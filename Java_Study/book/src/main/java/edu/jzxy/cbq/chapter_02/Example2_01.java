package edu.jzxy.cbq.chapter_02;

/**
 * @author Cola0817
 * @name Example2_01
 * @date 2023/9/16 12:37
 * @since 1.0.0
 */
public class Example2_01 {
    public static void main(String[] args) {
        /**
         * 1. 输出 19966 到 40959 （中、日、韩文字） Unicode 对应的字符
         */
        int iCode;
        char cCode;

        for (iCode = 19966; iCode < 40960; iCode++) {
            cCode = (char) iCode;
            System.out.println("第 " +iCode + "个 " + "cCode = " + cCode);

            if (iCode %20 ==0) System.out.println();
        }
    }
}
