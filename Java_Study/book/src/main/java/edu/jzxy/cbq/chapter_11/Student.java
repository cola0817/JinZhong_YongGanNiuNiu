package edu.jzxy.cbq.chapter_11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Cola0817
 * @name Student
 * @date 2023/9/18 12:32
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private Integer age;
    private Integer month;
}
