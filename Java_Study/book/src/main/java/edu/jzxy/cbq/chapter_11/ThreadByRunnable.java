package edu.jzxy.cbq.chapter_11;

/**
 * @author Cola0817
 * @name ThreadByRunnable
 * @date 2023/9/18 15:15
 * @since 1.0.0
 */
public class ThreadByRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("I am ThreadByRunnable ");
    }
}
