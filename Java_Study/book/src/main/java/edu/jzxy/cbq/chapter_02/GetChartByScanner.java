package edu.jzxy.cbq.chapter_02;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Cola0817
 * @name GetChartByScanner
 * @date 2023/9/16 12:55
 * @since 1.0.0
 */
public class GetChartByScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        System.out.println("通过 scanner.next() 获取单个字符："+input.charAt(0));
        try {
            int read = System.in.read();
            System.out.println("通过 System.in.read() 读取字符串： "+(char)read);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
