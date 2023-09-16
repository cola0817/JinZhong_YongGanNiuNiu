package edu.jzxy.cbq.day03;

import java.util.*;

/**
 * @author Cola0817
 * @name MapDemo
 * @date 2023/9/16 21:17
 * @since 1.0.0
 */
public class MapDemo {
    public static void main(String[] args) {

        /**
         * Student(int age, int month,String name)
         * 随机生成 3 个班级
         * 每个班级的人数为 48 53 62 人
         * age 为 18 - 20  month 为 1 - 12
         */
        String classNamePrefix = "class_ ";
        Integer classIndex = 0;
        Integer[] counts = {48, 53, 62};
        Random random = new Random();

        Map<String, List<Student>> classMap = new HashMap<>();
        Map<String, List<Student>> classMapGroupByMonth = new HashMap<>();

        for (Integer count : counts) {
            List<Student> studentList = new ArrayList<>();
            String className = classNamePrefix + classIndex;

            while (count != 0){
                int ageRandom = random.nextInt(11, 20);
                int monthRandom = random.nextInt(1, 13);

                Student student = new Student("student_"+count,ageRandom,monthRandom);
                studentList.add(student);
                count -= 1;
            }
            classMap.put(className, studentList);
            classIndex += 1;
        }

        for (List<Student> studentList : classMap.values()) {
            for (int month = 1; month <= 12; month++) {
                List<Student> students = new ArrayList<>();
                for (Student student : studentList) {
                    if (student.getMonth() == month){
                        students.add(student);
                    }
                }
                classMapGroupByMonth.put(month+"", students);
            }
        }

        classMapGroupByMonth.values().stream().forEach(System.out::println);
        classMapGroupByMonth.keySet().forEach(System.out::println);

    }
}
