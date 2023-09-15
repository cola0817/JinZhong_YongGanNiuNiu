package edu.jzxy.cbq.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Cola0817
 * @name User
 * @date 2023/9/15 21:06
 * @since 1.0.0
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
