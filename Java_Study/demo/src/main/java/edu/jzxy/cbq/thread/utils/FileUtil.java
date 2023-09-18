package edu.jzxy.cbq.thread.utils;


import com.univocity.parsers.csv.CsvWriter;
import com.univocity.parsers.csv.CsvWriterSettings;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Cola0817
 * @name FileUtil
 * @date 2023/9/18 16:13
 * @since 1.0.0
 */
public class FileUtil {
    /**
     * 读取txt文件工具类
     *
     * @param inputPath
     * @return
     */
    public static Map<String, List<String>> readTxtFile(String inputPath) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        List<String> aList = new ArrayList<String>();
        List<String> bList = new ArrayList<String>();
        List<String> cList = new ArrayList<String>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(inputPath), "UTF-8"), 10 * 1024 * 1024);
            String line = "";
            while ((line = reader.readLine()) != null) {
                if (null == line || line.isEmpty()) {
                    continue;
                }
                String[] split = line.split("=");
                if (split.length < 2) {
                    continue;
                }
                if (split[0].equals("a")) {
                    aList.add(split[1]);
                }
                if (split[0].equals("b")) {
                    bList.add(split[1]);
                }
                if (split[0].equals("c")) {
                    cList.add(split[1]);
                }
            }
            map.put("a", aList);
            map.put("b", bList);
            map.put("c", cList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
    /**
     * 写出CSV文件工具类
     *
     * @param headers
     * @param rows
     * @throws IOException
     */
    public static void writerCSVFile(String outputPath, List<String> headers, List<Object[]> rows,String prefixName)
    {
        String fileName = prefixName + ".csv";
        // 新建需要写出的文件
        File file = new File(outputPath,fileName);
        Writer writer = null;
        try
        {
            // 如果写出地址是个文件夹，创建新文件
            if (file.isDirectory())
            {
                file.createNewFile();
            }
            writer = new FileWriter(file, true);
            // 创建文件写出流
            // 创建CSV文件写出设置
            CsvWriterSettings setting = new CsvWriterSettings();
            // 写出文件，并可以追加
            CsvWriter csvwriter = new CsvWriter(writer, setting);
            // 写出文件标题
            csvwriter.writeHeaders(headers);
            // 写出文件内容
            csvwriter.writeRowsAndClose(rows);
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                if (null != writer)
                {
                    // 关闭文件写出流
                    writer.close();
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        }
}
