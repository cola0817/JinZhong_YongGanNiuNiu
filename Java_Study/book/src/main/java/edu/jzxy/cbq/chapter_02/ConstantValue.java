package edu.jzxy.cbq.chapter_02;

/**
 * @author Cola0817
 * @name ConstantValue
 * @date 2023/9/16 12:42
 * @since 1.0.0
 */
public class ConstantValue {
    /*常量的定义形式：
    * final datatype symbolic-constant = constant-value
    * 常量规范：
    *  1. 符号常量命名规则一般为大写
    * */
    private static final double PI = 3.14;

    public static void main(String[] args) {
        System.out.println("PI = " + PI);
    }

}
