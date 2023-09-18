package edu.jzxy.cbq.chapter_12;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @author Cola0817
 * @name MultiThread
 * @date 2023/9/18 19:38
 * @since 1.0.0
 */
public class MultiThread extends Thread{
    private List<Integer> idList;
    private CountDownLatch countDownLatch;

    public void setIdList(List<Integer> idList) {
        this.idList = idList;
    }

    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
}
