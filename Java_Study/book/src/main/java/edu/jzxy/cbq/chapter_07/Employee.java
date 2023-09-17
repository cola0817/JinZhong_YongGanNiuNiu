package edu.jzxy.cbq.chapter_07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Cola0817
 * @name Employee
 * @date 2023/9/17 11:42
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private Double salary;

}
