package edu.jzxy.cbq.thread.service.impl;

import edu.jzxy.cbq.thread.runable.ReadTxtFileThread;
import edu.jzxy.cbq.thread.service.FileIService;
import edu.jzxy.cbq.thread.utils.FileUtil;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Cola0817
 * @name TxtFileService
 * @date 2023/9/18 16:19
 * @since 1.0.0
 */
public class TxtFileService implements FileIService {
    /*
     * 读取文件，开启线程主方法
     */
    @Override
    public long readFile(String inputPath,String outputPath)
    {
        //统计解析成功条数
        long successNum = 0;
        //读取全部文件
        Map<String, List<String>> readTxtFile = FileUtil.readTxtFile(inputPath);
        //解析成功条数统计
        Hashtable<String, Long> successCount = new Hashtable<String, Long>();
        //获取标题
        List<String> head = getHead();
        //组装线程名字，既文件前缀
        String[] fileName =
            { "a", "b", "c" };

        // 创建计数器
        // 构造参数传入的数量值代表的是latch.countDown()调用的次数
        CountDownLatch latch = new CountDownLatch(3);
        // 创建线程池，可以通过以下方式创建
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < fileName.length; i++)
        {
            threadPool.execute(new ReadTxtFileThread(readTxtFile, head, latch, fileName[i], successCount,outputPath));
        }
        try
        {
            // 阻塞当前线程，直到所有线程都执行完毕
            latch.await();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        } finally
        {
            //所有业务执行完毕，关闭线程池
            threadPool.shutdown();
        }
        //解析成功条数统计
        for (Long num : successCount.values())
        {
            successNum += num;
        }
        return successNum;
    }

    /**
     * 组装文件表头
     * @return
     */
    private List<String> getHead()
    {
        List<String> head = new ArrayList<String>();
        head.add("A1");
        head.add("A2");
        head.add("A3");
        return head;
    }

}
