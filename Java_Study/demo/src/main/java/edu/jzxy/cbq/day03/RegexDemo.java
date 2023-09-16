package edu.jzxy.cbq.day03;

import java.util.regex.Pattern;

/**
 * @author Cola0817
 * @name RegexDemo
 * @date 2023/9/16 21:15
 * @since 1.0.0
 */
public class RegexDemo {
    public static void main(String[] args) {

        String text = "Cola777RH";
        String regex = ".*Cola.*";
        boolean matches = Pattern.matches(regex, text);
        System.out.println("matches = " + matches);
    }
}
