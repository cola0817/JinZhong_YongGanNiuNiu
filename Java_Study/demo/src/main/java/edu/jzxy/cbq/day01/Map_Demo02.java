package edu.jzxy.cbq.day01;

import java.io.*;
import java.util.*;

/**
 * @author Cola0817
 * @name Map_Demo02
 * @date 2023/9/16 18:59
 * @since 1.0.0
 */
public class Map_Demo02 {
    public static void main(String[] args) throws IOException {

        /**
         * Student(int age, int month,String name)
         * 随机生成 3 个班级
         * 每个班级的人数为 48 53 62 人
         * age 为 18 - 20  month 为 1 - 12
         */
        Random random = new Random();
        int[] counts = {48, 53, 62};
        String classNamePrefix = "class_ ";
        int classIndex = 0;
        Map<String, List<Student>> classMap = new HashMap<>();

        for (int i = 0; i < counts.length; i++) {

            String className = classNamePrefix + classIndex;
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
            classMap.put(className, studentList);
        }

        String filePath = "classMap.csv";
        write2Csv(classMap,filePath);

        readForCsv(classMap,filePath);

    }

    /**
     * 写入 Csv
     * @param classMap classMap
     * @throws IOException  IOException
     */
    public static void write2Csv(Map<String,List<Student>> classMap,String filePath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        Set<String> keySet = classMap.keySet();
        List<String> keyList = keySet.stream().toList();
        for (String key : keyList) {
            writer.write(key);
            writer.write("\n");
            List<Student> studentList = classMap.get(key);
            for (Student student : studentList) {
                writer.write(student.toString());
                writer.write("\n");
            }
        }
        writer.close();
    }

    /**
     * 从 Csv 中读取
     * @param classMap classMap
     * @throws IOException IOException
     */
    public static void readForCsv(Map<String,List<Student>> classMap,String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
    }

}
