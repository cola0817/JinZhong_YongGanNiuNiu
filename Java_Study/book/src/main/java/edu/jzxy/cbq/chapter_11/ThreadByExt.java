package edu.jzxy.cbq.chapter_11;

/**
 * @author Cola0817
 * @name ThreadByExt
 * @date 2023/9/18 15:15
 * @since 1.0.0
 */
public class ThreadByExt extends Thread {
    @Override
    public void run() {
        System.out.println("Hello I am ThreadByExt");
    }
}
