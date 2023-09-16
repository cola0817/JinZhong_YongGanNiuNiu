package edu.jzxy.cbq.chapter_03;

import java.util.Scanner;

/**
 * @author Cola0817
 * @name ChooseController
 * @date 2023/9/16 14:09
 * @since 1.0.0
 */
public class ChooseController {
    private static final int COUNT = 3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
/*        int[] numbers = new int[COUNT];
        System.out.println("请输入要排序的数：");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("排序前：");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("排序后：");
        orderNumber(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }*/

        int num_1 = scanner.nextInt();
        int num_2 = scanner.nextInt();

        System.out.println(getMaxNum(num_1,num_2));
    }

    /**
     * 排序
     *
     * @param numbers numbers
     */
    public static void orderNumber(int[] numbers) {
        int temp = 0;
        if (numbers[0] > numbers[1]) {
            temp = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = temp;
        }
        if (numbers[0] > numbers[2]) {
            temp = numbers[0];
            numbers[0] = numbers[2];
            numbers[2] = temp;
        }
        if (numbers[1] > numbers[2]) {
            temp = numbers[1];
            numbers[1] = numbers[2];
            numbers[2] = temp;
        }
    }


    public static int getMaxNum(int a, int b) {
        if (a>=b){
            return a;
        }else {
            return b;
        }
    }
}
