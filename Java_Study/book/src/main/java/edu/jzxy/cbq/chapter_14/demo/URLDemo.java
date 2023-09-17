package edu.jzxy.cbq.chapter_14.demo;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author Cola0817
 * @name URLDemo
 * @date 2023/9/17 17:01
 * @since 1.0.0
 */
public class URLDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入 url: ");
        String input = scanner.nextLine();

        URL url = new URL(input);
        System.out.println("url = " + url);
        InputStream inputStream = url.openStream();
        byte[] bytes = inputStream.readAllBytes();
        for (byte aByte : bytes) {
            System.out.print((char) aByte);
        }
    }
}
