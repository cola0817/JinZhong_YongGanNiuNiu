package edu.jzxy.cbq.byMapper;

import com.baomidou.mybatisplus.core.toolkit.Constants;
import edu.jzxy.cbq.entity.User;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class UserMapperTest {

    @Resource
    UserMapper userMapper;

    @Test
    void testInsert() {
        User user = new User();

        user.setName("Cola");
        user.setAge(21);
        user.setEmail("1203952894@qq.com");


        int count = userMapper.insert(user);

        System.out.println("count = " + count);
    }

    @Test
    void delete() {
    }
}
