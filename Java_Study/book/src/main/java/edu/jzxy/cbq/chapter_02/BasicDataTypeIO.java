package edu.jzxy.cbq.chapter_02;

import java.util.Scanner;

/**
 * @author Cola0817
 * @name BasicDataTypeIO
 * @date 2023/9/16 12:48
 * @since 1.0.0
 */
public class BasicDataTypeIO {
    public static void main(String[] args) {
        double average;
        int number = 10;
        int source = 0, sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入成绩：");

        for (int i = 0; i < number; i++) {
            source = scanner.nextInt();
            sum += source;
        }

        average = (double) sum / number;
        System.out.println("average = " +average);

    }
}
