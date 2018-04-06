package cn.itcast.spark.streaming;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 配合sparkstreaming使用
 * 可以实现流式处理
 */
public class SocketStream {
    public static void main(String args[]) throws IOException, InterruptedException {
        Socket socket=new ServerSocket(8888).accept();
        PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);
        while (true){
            System.out.println("msg sent");
            pw.println("abc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1ac");
            Thread.sleep(3000);
        }
    }
}
