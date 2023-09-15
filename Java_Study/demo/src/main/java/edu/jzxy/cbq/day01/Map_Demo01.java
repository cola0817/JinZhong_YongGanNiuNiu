package edu.jzxy.cbq.day01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Cola0817
 * @name Map_Demo01
 * @date 2023/9/15 20:02
 * @since 1.0.0
 */
public class Map_Demo01 {
    public static void main(String[] args) {
        /**
         * Student(int age, int month,String name)
         * 随机生成 3 个班级
         * 每个班级的人数为 48 53 62 人
         * age 为 18 - 20  month 为 1 - 12
         */
        Map<String, List<Student>> classes_1 = new HashMap<>();
        Map<String, List<Student>> classes_2 = new HashMap<>();
        Map<String, List<Student>> classes_3 = new HashMap<>();

        int[] counts = new int[]{48, 53, 62};

        for (int count : counts) {

        }


    }
}
