package edu.jzxy.cbq.chapter_05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Cola0817
 * @name Employee
 * @date 2023/9/16 16:55
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private int age;
    private String vocation;

}
