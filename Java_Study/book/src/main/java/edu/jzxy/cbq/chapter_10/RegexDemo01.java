package edu.jzxy.cbq.chapter_10;

import java.util.regex.Pattern;

/**
 * @author Cola0817
 * @name RegexDemo01
 * @date 2023/9/18 20:04
 * @since 1.0.0
 */
public class RegexDemo01 {
    public static void main(String[] args) {
        String text = "Cola777RH";
        String regex = "^[0-9]*$";
        boolean matches = Pattern.matches(regex, text);
        System.out.println("matches = " + matches);
    }
}
