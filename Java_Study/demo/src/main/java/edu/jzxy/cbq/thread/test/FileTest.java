package edu.jzxy.cbq.thread.test;

import edu.jzxy.cbq.thread.service.FileIService;
import edu.jzxy.cbq.thread.service.impl.TxtFileService;

/**
 * @author Cola0817
 * @name FileTest
 * @date 2023/9/18 16:23
 * @since 1.0.0
 */
public class FileTest {
    public static void main(String[] args)
    {
        //读取文件地址
        String inputPath = "demo.txt";
        //写出文件地址
        String outputPath = "demo.txt";
        FileIService readTxt = new TxtFileService();
        long readFile = readTxt.readFile(inputPath, outputPath);
        System.out.println("成功解析" + readFile + "条数据");
    }

}
