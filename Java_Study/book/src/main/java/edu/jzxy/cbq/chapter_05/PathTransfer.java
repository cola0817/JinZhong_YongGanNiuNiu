package edu.jzxy.cbq.chapter_05;

/**
 * @author Cola0817
 * @name PathTransfer
 * @date 2023/9/16 16:47
 * @since 1.0.0
 */
public class PathTransfer {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int[] ids = {1, 2};
        System.out.println("值传递：");
        transferByValue(a,b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("址传递：");
        transferByAddress(ids);
        for (int id : ids) {
            System.out.println(id);
        }
    }

    /**
     * 值传递
     * @param a a
     * @param b b
     */
    public static void transferByValue(int a,int b){
        int temp = 0;
        temp = a; a=b; b=temp;
    }

    /**
     * 址传递
     * @param ids ids
     */
    public static void transferByAddress(int [] ids){
        int temp = 0;
        temp = ids[0]; ids[0]=ids[1];ids[1]=temp;
    }
}
