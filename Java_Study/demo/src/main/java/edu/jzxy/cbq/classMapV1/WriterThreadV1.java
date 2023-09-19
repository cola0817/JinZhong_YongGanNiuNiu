package edu.jzxy.cbq.classMapV1;

/**
 * @author Cola0817
 * @name WriterThreadV1
 * @date 2023/9/19 10:49
 * @since 1.0.0
 */
public class WriterThreadV1 implements Runnable{

    private String name;

    @Override
    public void run() {
        System.out.println("I am " + this.name);
    }

    public WriterThreadV1(String name) {
        this.name = name;
    }
}
