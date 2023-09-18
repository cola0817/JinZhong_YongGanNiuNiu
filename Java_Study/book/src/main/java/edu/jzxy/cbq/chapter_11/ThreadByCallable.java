package edu.jzxy.cbq.chapter_11;

import java.util.concurrent.Callable;

/**
 * @author Cola0817
 * @name ThreadByCallable
 * @date 2023/9/18 15:16
 * @since 1.0.0
 */
public class ThreadByCallable implements Callable<String> {


    @Override
    public String call() throws Exception {
        System.out.println("I am Callable Thread");
        return "Hello ThreadByCallable";
    }
}
