package edu.jzxy.cbq.byService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.jzxy.cbq.byMapper.UserMapper;
import edu.jzxy.cbq.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author Cola0817
 * @name UserServiceImpl
 * @date 2023/9/15 22:48
 * @since 1.0.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
