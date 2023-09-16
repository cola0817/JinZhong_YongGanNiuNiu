package edu.jzxy.cbq.chapter_04;

/**
 * @author Cola0817
 * @name Java1SArray
 * @date 2023/9/16 13:07
 * @since 1.0.0
 */
public class Java1SArray {
    public static void main(String[] args) {

        /**
         * 一维数组的定义：
         * dataType [] arrayName
         * dataType arrayName []
         * demo:
         * int [] a,b; // a,b 均为数组
         * int x[], y; // x 为数组 y 为普通变量
         * 一维数组的初始化：
         * dataType [] arrayName = {}
         * dataType arrayName[]={}
         */

        int[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("通过数组的索引遍历数组");
        for (int i = 0; i < ids.length; i++) {
            System.out.println(ids[i]);
        }
        System.out.println("增强 for 遍历数组");
        for (int id : ids) {
            System.out.println("id = " + id);
        }

    }
}
