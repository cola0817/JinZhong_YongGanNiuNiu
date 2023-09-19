package edu.jzxy.cbq.classMapV1;

import java.io.*;
import java.util.*;

/**
 * @author Cola0817
 * @name DomainV1
 * @date 2023/9/19 9:59
 * @since 1.0.0
 */
public class DomainV1 {
    public static void main(String[] args) {
        Random random = new Random();
        String classNamePrefix = "class_";
        String studentNamePrefix = "student_";
        int classIndex = 0;
        Integer[] counts = {68, 53, 42};
        Map<String, List<Student>> classMap = new HashMap<>();

        for (Integer count : counts) {
            String className = classNamePrefix + classIndex;
            List<Student> students = new ArrayList<>();
            while (count != 0) {
                Student student = new Student(
                    studentNamePrefix + classIndex + "_" + count,
                    random.nextInt(16, 25),
                    random.nextInt(1, 13));
                students.add(student);
                count--;
            }
            classMap.put(className, students);
            classIndex++;
        }


    }

    /**
     * 输出 classMapInfo
     *
     * @param classMap classMap
     */
    private static void printClassMapInfo(Map<String, List<Student>> classMap) {
        classMap.forEach((s, students) -> {
            System.out.println(s);
            students.forEach(System.out::println);
        });
    }

    /**
     * 将 classMap 按照月份分组
     * @param classMap classMap
     * @return groupByMonth
     */
    private static Map<String, List<Student>> groupByMonth(Map<String, List<Student>> classMap) {
        Map<String, List<Student>> groupedClassMap = new HashMap<>();

            for (int month = 1; month < 13; month++) {
                List<Student> groupedStudents = new ArrayList<>();
                for (List<Student> students : classMap.values()) {
                    for (Student student : students) {
                        if (student.getMonth() == month) {
                            groupedStudents.add(student);
                        }
                    }
                }
                groupedClassMap.put(String.valueOf(month), groupedStudents);
            }

        return groupedClassMap;
    }


    /**
     * 将 classMap 中的信息写入 csv
     *
     * @param classMap classMap
     * @param filePath filePath
     */
    private static void write2Csv(Map<String, List<Student>> classMap, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String className : classMap.keySet()) {
                writer.write(className + "\n");
                for (Student student : classMap.get(className)) {
                    writer.write(student.toString() + "\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 读取 csv
     *
     * @param filePath filePath
     */
    private static void readForCsv(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
