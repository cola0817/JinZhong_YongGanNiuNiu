package edu.jzxy.cbq.day02;

/**
 * @author Cola0817
 * @name math_sqrt
 * @date 2023/9/16 17:44
 * @since 1.0.0
 */
public class math_sqrt {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        double cos = 0;
        for (int i = 0; i < 10000000; i++) {
            double o = i +0.0;
             cos += Math.sin(o);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
