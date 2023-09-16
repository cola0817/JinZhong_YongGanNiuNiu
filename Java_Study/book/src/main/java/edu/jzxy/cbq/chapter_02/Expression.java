package edu.jzxy.cbq.chapter_02;

import java.util.Scanner;

/**
 * @author Cola0817
 * @name Expression
 * @date 2023/9/16 13:02
 * @since 1.0.0
 */
public class Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int input = scanner.nextInt();
        System.out.println((input + 1) > 2 ? "大于" : "小于");
    }
}
