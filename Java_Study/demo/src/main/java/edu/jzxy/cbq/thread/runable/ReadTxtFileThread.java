package edu.jzxy.cbq.thread.runable;

import edu.jzxy.cbq.thread.utils.FileUtil;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/**
 * @author Cola0817
 * @name ReadTxtFileThread
 * @date 2023/9/18 16:21
 * @since 1.0.0
 */
public class ReadTxtFileThread implements Runnable
{
    /**
     * 读取来的数据
     */
    private Map<String, List<String>> allLines;

    /**
     * 表头
     */
    private List<String> head;

    /**
     * 线程计数
     */
    private CountDownLatch latch;

    /**
     * 线程name
     */
    private String ThreadName;

    /**
     * 文件写出地址
     */
    private String outputPath;

    /**
     * 统计
     */
    private Hashtable<String, Long> successCount;

    public ReadTxtFileThread(Map<String, List<String>> allLines, List<String> head, CountDownLatch latch,
                             String threadName, Hashtable<String, Long> successCount,String outputPath)
    {
        super();
        this.allLines = allLines;
        this.head = head;
        this.latch = latch;
        this.ThreadName = threadName;
        this.successCount = successCount;
        this.outputPath = outputPath;
    }


    @Override
    public void run()
    {
        //通过判断线程名字来决定执行那个线程
        String[] str = {"a","b","c"};
        for (String name : str)
        {
            if(name.equals(ThreadName))
            {
                writeTxtFile(name);
            }
        }
        //线程计数
        latch.countDown();
    }


    /**
     * 解析并写出文件
     * @param type
     */
    private synchronized void writeTxtFile(String type)
    {
        //每个文件写出条数统计
        long sucNum = 0;
        //需要写出的行
        List<Object[]> rows = new ArrayList<Object[]>();
        //生成文件标题
        String prefixName = type + System.currentTimeMillis();
        //需要写出的文件的原始数据
        List<String> list = allLines.get(type);
        //根据需求解析文件
        for (String line : list)
        {
            String[] split = line.split(",");
            rows.add(split);
        }
        //统计单个文件成功条数
        sucNum = rows.size();
        successCount.put(type, sucNum);
        //调用工具类，写出CSV文件
        FileUtil.writerCSVFile(outputPath, head, rows,prefixName);
    }
}
