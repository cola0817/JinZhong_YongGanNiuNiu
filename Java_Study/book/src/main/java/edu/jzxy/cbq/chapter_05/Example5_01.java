package edu.jzxy.cbq.chapter_05;

import java.util.Scanner;

/**
 * @author Cola0817
 * @name Example5_01
 * @date 2023/9/16 16:33
 * @since 1.0.0
 */
public class Example5_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要计算的阶乘 n 的值：");
        int n = scanner.nextInt();
        long result = fac(n);
        System.out.println("result = " + result);
    }

    /**
     *     当 n>1:  n * (n-1)!
     * n!=
     *     当 n=1: n=1
     * 计算 n! 的值
     * @param n n！ 的底数
     * @return n!
     */
    public static long fac(int n){
        if(n>1){
            return n * fac(n - 1);
        }else
            return 1;
    }
}
