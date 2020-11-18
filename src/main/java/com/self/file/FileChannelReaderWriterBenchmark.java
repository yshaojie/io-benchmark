package com.self.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author shaojieyue
 * Created at 2020-10-16 18:33
 */

public class FileChannelReaderWriterBenchmark extends AbstractFileBenchmark{
    @Override
    void read0(String file,int kb) throws Exception {
        FileChannel fileChannel = null;
        try {
            fileChannel = new FileInputStream(file).getChannel();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        final ByteBuffer byteBuffer = ByteBuffer.allocate(1024*kb);
        while (true) {
            int read = fileChannel.read(byteBuffer);
            byteBuffer.clear();
            if (read < 0) {
                break;
            }
        }

    }

    @Override
    void write0(String file,int gb) {

    }
}
