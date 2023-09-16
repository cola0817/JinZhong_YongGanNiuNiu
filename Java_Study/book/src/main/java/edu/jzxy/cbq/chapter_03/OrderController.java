package edu.jzxy.cbq.chapter_03;

import java.util.Scanner;

/**
 * @author Cola0817
 * @name OrderController
 * @date 2023/9/16 14:08
 * @since 1.0.0
 */
public class OrderController {
    public static void main(String[] args) {
        Example3_01();
    }

    /**
     * OrderController
     * 求解一元二次方程组的跟
     */
    public static void Example3_01(){
        double a, b, c;
        double p, q;
        double x1, x2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入该一元二次方程组的系数：");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        p = -b / (2 * a);
        q = Math.sqrt(b * b - 4 * a * c) / (2 * a);

        x1 = p + q;
        x2 = p - q;

        System.out.println("该一元二次方程组的根为：x1 = " + x1 + " x2 = "+x2);
    }
}
