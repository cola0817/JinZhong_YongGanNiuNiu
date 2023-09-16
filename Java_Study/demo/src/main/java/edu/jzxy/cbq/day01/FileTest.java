package edu.jzxy.cbq.day01;

import java.io.*;

/**
 * @author Cola0817
 * @name FileTest
 * @date 2023/9/16 19:42
 * @since 1.0.0
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));
        writer.write("Hello World !");
        writer.write("\n");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("out.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
