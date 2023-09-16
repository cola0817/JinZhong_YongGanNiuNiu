package edu.jzxy.cbq.day02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Cola0817
 * @name Student
 * @date 2023/9/16 18:02
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int age;
    private int month;
    String name;
}
