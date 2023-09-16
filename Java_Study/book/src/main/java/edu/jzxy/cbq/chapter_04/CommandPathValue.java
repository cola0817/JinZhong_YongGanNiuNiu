package edu.jzxy.cbq.chapter_04;

/**
 * @author Cola0817
 * @name CommandPathValue
 * @date 2023/9/16 13:25
 * @since 1.0.0
 */
public class CommandPathValue {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);

        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
