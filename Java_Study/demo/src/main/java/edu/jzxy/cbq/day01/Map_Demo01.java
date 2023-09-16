package edu.jzxy.cbq.day01;

import java.util.*;

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

        Random random = new Random();
        int[] counts = new int[]{48, 53, 62};
        int classIndex = 0;
        Map<String, List<Student>> classInfo = new HashMap<>();
        Map<Integer, List<Student>> classInfoGroupByMonth = new HashMap<>();
        for (int i = 0; i < counts.length; i++) {
            String className = "class_" + classIndex;
            int count = counts[classIndex];
            List<Student> studentList = new ArrayList<>();

            while (count != 0) {
                int month_random = random.nextInt(1, 13);
                int age_random = random.nextInt(18, 21);
                Student student = new Student("student_" + count, age_random, month_random);
                studentList.add(student);
                count -= 1;
            }
            classIndex++;
            classInfo.put(className, studentList);
        }
        for (List<Student> studentList : classInfo.values()) {
            int numbers = 0;
            for (int i = 1; i < 13; i++) {
                List<Student> list = new ArrayList<>();
                for (Student student : studentList) {
                    if (student.getMonth() == i){
                        list.add(student);
                        numbers += 1;
                    }
                }
                classInfoGroupByMonth.put(i, list);

            }
            System.out.println(numbers);
        }
        int count = 0;
        for (List<Student> value : classInfoGroupByMonth.values()) {
            count += 1;
        }
        System.out.println("count = " + count);
    }
}
