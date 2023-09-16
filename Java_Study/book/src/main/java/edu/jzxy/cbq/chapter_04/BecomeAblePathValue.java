package edu.jzxy.cbq.chapter_04;

import java.util.Arrays;

/**
 * @author Cola0817
 * @name BecomeAblePathValue
 * @date 2023/9/16 13:27
 * @since 1.0.0
 */
public class BecomeAblePathValue {
    public static void main(String[] args) {
        printIds("Cola ", 1, 2, 3, 4, 5);
    }

    public static void printIds (String name,int...ids){
        System.out.println(name+ Arrays.toString(ids));
    }
}
