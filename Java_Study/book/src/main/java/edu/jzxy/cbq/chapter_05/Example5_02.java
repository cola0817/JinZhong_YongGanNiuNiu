package edu.jzxy.cbq.chapter_05;

import java.util.Scanner;

/**
 * @author Cola0817
 * @name Example5_02
 * @date 2023/9/16 16:38
 * @since 1.0.0
 */
public class Example5_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要计算的斐波那契的项数 n: ");
        int n = scanner.nextInt();
        long result = fib(n);
        System.out.println("result = " + result);

    }

    /**
     *          当 n>2 : fib(n-1) + fib(n-2)
     * fib(n) =
     *          当 n=1 或 n = 2 : 1
     *
     * 计算斐波那契第 n 项值
     * @param n n
     * @return 第 n 项的值
     */
    public static long fib(int  n){
        if (n>2){
            return fib(n - 1) + fib(n - 2);
        }else
            return 1;
    }
}
