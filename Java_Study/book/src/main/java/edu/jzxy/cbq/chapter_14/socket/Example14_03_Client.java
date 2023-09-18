package edu.jzxy.cbq.chapter_14.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @author Cola0817
 * @name Example14_03_Client
 * @date 2023/9/18 20:28
 * @since 1.0.0
 */
public class Example14_03_Client {
    public static void main(String[] args) {
        String ip = "127.0.0.1";
        Integer port = 5050;
        DataInputStream input = null;
        DataOutputStream output = null;
        Socket socket_client = null;

        try {
            socket_client = new Socket(ip, port);
            input = new DataInputStream(socket_client.getInputStream());
            output = new DataOutputStream(socket_client.getOutputStream());

            output.writeUTF("你好 我是客户机 A");
            String result = input.readUTF();
            System.out.println("服务器 B 响应 result = " + result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
