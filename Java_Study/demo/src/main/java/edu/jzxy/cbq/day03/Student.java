package edu.jzxy.cbq.day03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Cola0817
 * @name Student
 * @date 2023/9/16 21:16
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int age;
    private int month;
}
