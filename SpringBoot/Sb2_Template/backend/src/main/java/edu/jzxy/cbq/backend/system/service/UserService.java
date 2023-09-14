package edu.jzxy.cbq.backend.system.service;


import edu.jzxy.cbq.backend.system.entity.User;

/**
 * @author Cola0817
 * @date 2023/9/8 17:04
 * @since 1.0
 */
public interface UserService extends BaseService<User> {
    void login(User user);

}
