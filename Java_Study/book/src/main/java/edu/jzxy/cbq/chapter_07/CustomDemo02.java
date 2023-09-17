package edu.jzxy.cbq.chapter_07;

import java.util.*;

/**
 * @author Cola0817
 * @name CustomDemo02
 * @date 2023/9/17 12:19
 * @since 1.0.0
 */
public class CustomDemo02 {
    public static void main(String[] args) {
        /**
         * 三个班级 58,62,33
         * 年龄为 16 - 25
         * 月份为 1-12
         */
        Random random = new Random();
        String classNamePrefix = "class_";
        Integer classIndex = 0;
        Integer[] counts = {58, 62, 33};
        Map<String, List<Student>> classMap = new HashMap<>();
        for (Integer count : counts) {
            String className = classNamePrefix + classIndex;
            List<Student> students = new ArrayList<>();
            while (count != 0){
                Student student = new Student(count, random.nextInt(16, 26),
                    random.nextInt(1, 13), className+"_" + count);
                students.add(student);
                count--;
            }
            classMap.put(className, students);
            classIndex++;
        }


        Map<Integer, List<Student>> classGroupByMonth = new HashMap<>();

        for (int month = 1; month < 13; month++) {
            List<Student> studentListByMonth = new ArrayList<>();
            for (List<Student> students : classMap.values()) {
                for (Student student : students) {
                    if (student.getMonth() == month){
                        studentListByMonth.add(student);
                    }
                }
            }
            classGroupByMonth.put(month, studentListByMonth);
        }
        classMap.forEach((key,value)->{
            System.out.println(key);
            value.forEach(System.out::println);
        });
        System.out.println("-----------------");
        classGroupByMonth.forEach((key,value)->{
            System.out.println(key);
            value.forEach(System.out::println);
        });
        int numbers1 = 0;
        int numbers2 = 0;
        for (List<Student> students : classMap.values()) {
            numbers1 += students.size();
        }

        for (List<Student> students : classGroupByMonth.values()) {
            numbers2 += students.size();
        }
        System.out.println(numbers1);
        System.out.println(numbers2);
        System.out.println(58+33+62);
    }
}
