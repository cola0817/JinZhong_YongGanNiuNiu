package edu.jzxy.cbq.chapter_11;

import java.io.*;
import java.util.*;

/**
 * @author Cola0817
 * @name ClassMapThreadDemo
 * @date 2023/9/18 12:29
 * @since 1.0.0
 */
public class ClassMapThreadDemo {
    public static void main(String[] args) throws IOException {

        /**
         * 三个班 48 63 52
         * 学生 (int month , int age ,String name)
         * month 1-12
         * age 16-25
         */
        Integer[] counts = {48, 63, 52};
        String classNamePrefix = "class_";
        Integer classIndex = 0;
        Map<String, List<Student>> classMap = new HashMap<>();
        Random random = new Random();
        for (Integer count : counts) {
            String className = classNamePrefix + classIndex;
            List<Student> students = new ArrayList<>();
            while (count != 0){
                Student student = new Student("student_" + count,
                    random.nextInt(16, 25),
                    random.nextInt(1, 13));

                students.add(student);
                count--;
            }
            classMap.put(className, students);
            classIndex++;
        }

        /*打印 classMap 内容*/
//        listClassMap(classMap);
        /*将 classMap 的内容写入 csv 文件*/
        String filePath = "./classMap.csv";
        writeClassMap(classMap,filePath);
        System.out.println("正在读取文件");
        readeClassMap(classMap,filePath);
    }

    public static void listClassMap(Map<String,List<Student>> classMap){
        classMap.forEach((key,value)->{
            System.out.println(key);
            value.forEach(System.out::println);
        });
    }

    public static void writeClassMap(Map<String,List<Student>> classMap,String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Map.Entry<String, List<Student>> subClassMap : classMap.entrySet()) {
                writer.write(subClassMap.getKey());
                writer.write("\n");
                subClassMap.getValue().forEach(student -> {
                    try {
                        writer.write(student.toString());
                        writer.write("\n");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void readeClassMap(Map<String,List<Student>> classMap,String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = null;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();

    }
}
