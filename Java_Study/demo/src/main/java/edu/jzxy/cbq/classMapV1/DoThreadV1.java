package edu.jzxy.cbq.classMapV1;

/**
 * @author Cola0817
 * @name DoThreadV1
 * @date 2023/9/19 10:49
 * @since 1.0.0
 */
public class DoThreadV1 {
    public static void main(String[] args) {
        Thread thread_01 = new Thread(new WriterThreadV1("writer_thread_01"));
        Thread thread_02 = new Thread(new WriterThreadV1("writer_thread_02"));
        Thread thread_03 = new Thread(new WriterThreadV1("writer_thread_03"));

        thread_01.start();
        thread_02.start();
        thread_03.start();
    }
}
