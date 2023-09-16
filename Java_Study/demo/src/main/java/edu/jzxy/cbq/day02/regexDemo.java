package edu.jzxy.cbq.day02;

import java.util.regex.Pattern;

/**
 * @author Cola0817
 * @name regexDemo
 * @date 2023/9/16 17:43
 * @since 1.0.0
 */
public class regexDemo {
    public static void main(String[] args) {
        String regex = ".*Cola.*";
        String text = "Cola123RH";

        boolean matches = Pattern.matches(regex, text);
        System.out.println("matches = " + matches);
    }
}
