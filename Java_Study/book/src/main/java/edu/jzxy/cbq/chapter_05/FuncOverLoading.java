package edu.jzxy.cbq.chapter_05;

/**
 * @author Cola0817
 * @name FuncOverLoading
 * @date 2023/9/16 16:42
 * @since 1.0.0
 */
public class FuncOverLoading {
    public static void main(String[] args) {
        System.out.println("add-int");
        System.out.println(add(1, 2));
        System.out.println("add-double");
        System.out.println(add(1.0, 2.0));
        System.out.println("add-long");
        System.out.println(add(1L, 2L));

    }

    public static int add(int a,int b){
        return a + b;
    }

    public static double add(double a,double b){
        return a + b;
    }

    public static long add(long a,long b ){
        return a + b;
    }
}
