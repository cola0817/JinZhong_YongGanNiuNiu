package edu.jzxy.cbq.backend.system.service.impl;



import edu.jzxy.cbq.backend.system.dao.UserDao;
import edu.jzxy.cbq.backend.system.entity.User;
import edu.jzxy.cbq.backend.system.exception.ColaException;
import edu.jzxy.cbq.backend.system.service.UserService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Cola0817
 * @date 2023/9/8 17:04
 * @since 1.0
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserDao, User> implements UserService {


    @Resource
    private AuthenticationManager authenticationManager;

    @Resource
    private BCryptPasswordEncoder encoder;

    @Override
    public void save(User entity) {
        entity.setPassword(encoder.encode(entity.getPassword()));
        super.save(entity);
    }

    @Override
    public void login(User user) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword());
        // 使用spring security 的认证方法
        try {
            authenticationManager.authenticate(token);
        } catch (AuthenticationException e) {
            throw new ColaException("用户名或密码错误", e);
        }

    }

}
