package edu.jzxy.cbq.chapter_11;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Cola0817
 * @name ThreadDemo
 * @date 2023/9/18 15:17
 * @since 1.0.0
 */
public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadByExt threadByExt = new ThreadByExt();
        threadByExt.start();

        ThreadByRunnable runnable = new ThreadByRunnable();
        Thread threadByRunnable = new Thread(runnable);
        threadByRunnable.start();

        ThreadByCallable callable = new ThreadByCallable();
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread threadByCallable = new Thread(futureTask);
        threadByCallable.start();
        String result = futureTask.get();
        System.out.println("result = " + result);
    }
}
