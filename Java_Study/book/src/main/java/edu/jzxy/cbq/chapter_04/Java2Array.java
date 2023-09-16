package edu.jzxy.cbq.chapter_04;

/**
 * @author Cola0817
 * @name Java2Array
 * @date 2023/9/16 13:16
 * @since 1.0.0
 */
public class Java2Array {

    public static void main(String[] args) {
        /**
         * 二维数组的定义：
         * dataType [][] arrayName
         * dataType arrayName [][]
         * demo:
         * int [][] a,b; // a,b 均为数组
         * int x[][], y; // x 为数组 y 为普通变量
         * 一维数组的初始化：
         * dataType [][] arrayName = {{},{},{}}
         * dataType arrayName[][]= {{},{},{}}
         */
        int[][] x_y = {{1, 1}, {2, 2}, {3, 3}};

        System.out.println("通过 for 循环遍历数组：");
        for (int i = 0; i < x_y.length; i++) {
            System.out.println("第 " + (i+1) + "行：");
            for (int j = 0; j < x_y[0].length; j++) {
                System.out.println("x_y = " + x_y[i][j]);
            }
        }
    }


}
