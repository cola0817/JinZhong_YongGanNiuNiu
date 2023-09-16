package edu.jzxy.cbq.day03;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Cola0817
 * @name ArrayListDemo
 * @date 2023/9/16 21:02
 * @since 1.0.0
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        Integer [] ids = new Integer[10];
        Random random = new Random();

        for (int i = 0; i < ids.length; i++) {
            ids[i] = random.nextInt(1, 101);
        }

        Arrays.stream(ids)
            .sorted()
            .toList()
            .forEach(System.out::println);
    }
}
