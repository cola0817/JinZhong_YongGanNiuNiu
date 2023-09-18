package edu.jzxy.cbq.thread.service;

/**
 * @author Cola0817
 * @name FileIService
 * @date 2023/9/18 16:19
 * @since 1.0.0
 */
public interface FileIService {
    /**
     * 文件读取主方法
     * @param inputPath
     * @param outputPath
     * @return
     */
    long readFile(String inputPath, String outputPath);
}
