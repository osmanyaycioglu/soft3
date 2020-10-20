package com.training.java.nio;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Streams {

    public static void main(final String[] args) {
        try {
            File fileLoc = new File("customer.txt");
            byte[] bytes = new byte[1024];
            FileInputStream fileInputStreamLoc = new FileInputStream(fileLoc);

            ByteBuffer bufferLoc = ByteBuffer.allocateDirect(1024);
            FileChannel channelLoc = fileInputStreamLoc.getChannel();
            int read2Loc = channelLoc.read(bufferLoc);


            BufferedInputStream bufferedInputStreamLoc = new BufferedInputStream(fileInputStreamLoc,
                                                                                 4 * 1024 * 1024);
            int readLoc = bufferedInputStreamLoc.read(bytes);

            FileReader fileReaderLoc = new FileReader(fileLoc);
            BufferedReader readerLoc = new BufferedReader(fileReaderLoc);
            readerLoc.readLine();


            Path pathLoc = Paths.get("customer.txt");
            List<String> readAllLinesLoc = Files.readAllLines(pathLoc);

            byte[] readAllBytesLoc = Files.readAllBytes(pathLoc);


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
