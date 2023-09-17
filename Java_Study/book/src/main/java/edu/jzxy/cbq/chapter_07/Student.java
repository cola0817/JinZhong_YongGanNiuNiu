package edu.jzxy.cbq.chapter_07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Cola0817
 * @name Student
 * @date 2023/9/17 12:20
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private Integer age;
    private Integer month;
    private String name;
}
