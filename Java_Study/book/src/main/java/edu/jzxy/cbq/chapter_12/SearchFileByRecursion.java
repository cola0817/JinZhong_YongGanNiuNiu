package edu.jzxy.cbq.chapter_12;

import java.io.File;

/**
 * @author Cola0817
 * @name SearchFileByRecursion
 * @date 2023/9/19 9:41
 * @since 1.0.0
 */
public class SearchFileByRecursion {
    public static void main(String[] args) {
        searchFile(new File("D:"), "settings.xml");
    }

    /**
     * 使用递归查找指定目录下的指定文件并返回文件绝对路径
     *
     * @param dir      dir
     * @param fileName fileName
     */
    public static void searchFile(File dir, String fileName) {
        /*1. 排除所有非法情况：目录为空、目录不存在、指定的目录为文件*/
        if (dir == null || !dir.exists() || dir.isFile()) {
            return;
        }
        /*2. 获取当前目录下的所有一级文件对象*/
        File[] files = dir.listFiles();

        /*3. 判断当前目录下是否存在一级文件对象，以及是否可以拿到一级文件对象*/
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isFile()) {
                    if (file.getName().equals(fileName)) {
                        System.out.println(file.getName() + "文件位于 " + file.getAbsoluteFile());
                    }
                } else {
                    searchFile(file, fileName);
                }
            }
        }

    }
}
