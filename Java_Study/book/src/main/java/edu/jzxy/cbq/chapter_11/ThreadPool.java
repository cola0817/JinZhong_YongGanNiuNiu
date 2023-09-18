package edu.jzxy.cbq.chapter_11;

import java.util.*;

/**
 * @author Cola0817
 * @name ThreadPool
 * @date 2023/9/18 13:00
 * @since 1.0.0
 */
public class ThreadPool {
    public static void main(String[] args) {
        Integer[] counts = {58, 62, 31};
        String classNamePrefix = "class_";
        Integer classIndex = 0;
        Map<String, List<Student>> classMap = new HashMap<>();
        Random random = new Random();
        List<Thread> threadList = new ArrayList<>();
        for (Integer count : counts) {
            List<Student> students = new ArrayList<>();
            String className = classNamePrefix + classIndex;
            /*根据班级数量为指定班级创建 reader 和 writer 线程*/
            Thread writerThread = new WriterThread("writerThread@" + className);
            Thread readerThread = new ReaderThread("readerThread@" + className);
            threadList.add(writerThread);
            threadList.add(readerThread);
            while (count != 0) {
                Student student = new Student("student_" + count,
                    random.nextInt(16, 25),
                    random.nextInt(1, 13));
                students.add(student);
                count--;
            }
            classMap.put(className, students);
            classIndex++;
        }

        /*遍历 classMap*/
        for (Map.Entry<String, List<Student>> subClassMap : classMap.entrySet()) {
            System.out.println(subClassMap.getValue());
            for (Student student : subClassMap.getValue()) {
                System.out.println(student);
            }
        }

        System.out.println("遍历 threadList");
        threadList.forEach(System.out::println);

        System.out.println("执行 threadList 中各 thread 的方法");
        /*执行 threadList*/
        threadList.forEach(Thread::start);
    }
}
