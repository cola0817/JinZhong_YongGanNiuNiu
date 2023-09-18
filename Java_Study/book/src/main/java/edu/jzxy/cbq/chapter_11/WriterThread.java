package edu.jzxy.cbq.chapter_11;

/**
 * @author Cola0817
 * @name WriterThread
 * @date 2023/9/18 12:58
 * @since 1.0.0
 */
public class WriterThread extends Thread {

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println("I am " + thread.getName());
    }

    public WriterThread(String name) {
        super(name);
    }
}
