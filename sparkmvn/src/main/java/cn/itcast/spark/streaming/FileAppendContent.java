package cn.itcast.spark.streaming;

import com.google.common.io.Files;
import java.io.*;
import java.nio.charset.Charset;

/**
 * 按文件流追加内容
 */
public class FileAppendContent {
    public static void main(String args[]) throws Exception {

        File file=new File("F://WorkCount/streamingfoo.txt");
        if (!file.exists()){file.getParentFile().mkdirs();file.createNewFile();}
        while(true){
            Thread.sleep(5000);
            Files.append("abc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1acabc 123 abc eee asd 1ac AEE AEE 1ac",file, Charset.defaultCharset());
            System.out.println("content appended");
        }
    }
}
