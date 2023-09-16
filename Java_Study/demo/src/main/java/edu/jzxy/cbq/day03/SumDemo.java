package edu.jzxy.cbq.day03;

/**
 * @author Cola0817
 * @name SumDemo
 * @date 2023/9/16 20:57
 * @since 1.0.0
 */
public class SumDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
