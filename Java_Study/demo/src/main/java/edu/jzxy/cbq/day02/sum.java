package edu.jzxy.cbq.day02;

/**
 * @author Cola0817
 * @name sum
 * @date 2023/9/16 17:26
 * @since 1.0.0
 */
public class sum {
    public static void main(String[] args) {
        int result = returnSum();
        System.out.println("result = " + result);
    }


    public static int returnSum(){
        int sum =0;

        for (int i = 1; i <= 100; i++) {
            if (i %2 ==1){
                sum += i;
            }
        }
        return sum;
    }
}
