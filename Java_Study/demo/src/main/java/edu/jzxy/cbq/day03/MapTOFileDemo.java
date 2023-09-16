package edu.jzxy.cbq.day03;

import java.io.*;
import java.util.*;

/**
 * @author Cola0817
 * @name MapTOFileDemo
 * @date 2023/9/16 21:43
 * @since 1.0.0
 */
public class MapTOFileDemo {
    public static void main(String[] args) throws IOException {
        /**
         * Student(int age, int month,String name)
         * 随机生成 3 个班级
         * 每个班级的人数为 48 53 62 人
         * age 为 18 - 20  month 为 1 - 12
         */
        Integer[] counts = {48, 53, 62};
        String classNamePrefix = "class_";
        Integer classIndex = 0;
        Random random = new Random();
        Map<String, List<Student>> classMap = new HashMap<>();

        for (Integer count : counts) {
            List<Student> students = new ArrayList<>();
            String className = classNamePrefix + classIndex;
            int ageRandom = random.nextInt(16, 25);
            int monthRandom = random.nextInt(1, 13);
            while (count != 0){
                Student student = new Student("student_" + count, ageRandom, monthRandom);
                students.add(student);
                count--;
            }
            classMap.put(className, students);
            classIndex++;
        }

        String filePath = "Test.csv";
        writer2Csv(classMap,filePath);
        readForCsv(filePath);
    }

    public static void writer2Csv(Map<String,List<Student>> classMap,String filePath) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

        for (String className : classMap.keySet()) {
            writer.write(className);
            writer.write("\n");

            for (Student student : classMap.get(className)) {
                writer.write(student.toString());
                writer.write("\n");
            }
        }
        writer.close();
    }

    public static void readForCsv(String filePath) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }
}
