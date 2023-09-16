package edu.jzxy.cbq.day03;

/**
 * @author Cola0817
 * @name MathSinDemo
 * @date 2023/9/16 20:59
 * @since 1.0.0
 */
public class MathSinDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        double radian = 0.0;
        double sum = 0.0;
        for (int i = 0; i < 1000_0000; i++) {
            radian += i;
            double sin = Math.sin(radian);
            sum += sin;
        }

        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }
}
