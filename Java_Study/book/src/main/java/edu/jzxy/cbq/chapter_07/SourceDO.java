package edu.jzxy.cbq.chapter_07;

/**
 * @author Cola0817
 * @name SourceDO
 * @date 2023/9/17 11:58
 * @since 1.0.0
 */
public class SourceDO {
    public static void main(String[] args) {
        SOURCE[] values = SOURCE.values();
        for (SOURCE value : values) {
            System.out.println("value = " + value);
        }
        Integer main = SOURCE.BAD.getMain();
        System.out.println("main = " + main);
        Integer max = SOURCE.BAD.getMax();
        System.out.println("max = " + max);
    }
}
