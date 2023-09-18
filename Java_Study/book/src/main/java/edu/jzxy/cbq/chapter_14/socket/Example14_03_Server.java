package edu.jzxy.cbq.chapter_14.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Cola0817
 * @name Example14_03_Server
 * @date 2023/9/18 20:28
 * @since 1.0.0
 */
public class Example14_03_Server {
    public static void main(String[] args) {
        Socket socket_client = null;
        ServerSocket socket_server = null;
        Integer port = 5050;
        DataOutputStream output = null;
        DataInputStream input = null;

        try {
            socket_server = new ServerSocket(port);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            socket_client = socket_server.accept();
            input = new DataInputStream(socket_client.getInputStream());
            output = new DataOutputStream(socket_client.getOutputStream());
            String result = input.readUTF();
            System.out.println("客户机 A 响应 ：result = " + result);
            output.writeUTF("你好 我是服务器 B");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
