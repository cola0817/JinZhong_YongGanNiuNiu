package edu.jzxy.cbq.chapter_02;

/**
 * @author Cola0817
 * @name JavaBasicDataType
 * @date 2023/9/16 12:45
 * @since 1.0.0
 */
public class JavaBasicDataType {
    public static void main(String[] args) {
        byte x = 1;

        System.out.println("x = " + x++);
        System.out.println("x = " + (x+=1)); // x+=1 具有自动类型推断所以可以编译通过

        /**
         * System.out.println("x = " + (x=x+1));
         * 这样的写法是错误我的
         * 原因：
         *  需要强制类型转换
         */
    }
}
