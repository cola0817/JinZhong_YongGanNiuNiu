package edu.jzxy.cbq.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Cola0817
 * @name UserBean
 * @date 2023/9/16 9:45
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBean {
    private Integer id;
    private String name;
    private Integer age;
    private String birthday;
}
