package edu.jzxy.cbq.day02;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Cola0817
 * @name ArrayListDemo
 * @date 2023/9/16 17:49
 * @since 1.0.0
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length ; i++) {
             numbers[i] = random.nextInt(1, 101);
        }
        List<Integer> list = Arrays.stream(numbers).sorted().toList();
        list.forEach(System.out::println);
    }
}
