package com.self.file;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author shaojieyue
 * Created at 2020-10-16 19:51
 */

public class MappedByteBufferReaderWriterBenchmark extends AbstractFileBenchmark{
    @Override
    void read0(String file, int kb) throws Exception {
        final FileChannel fileChannel = new RandomAccessFile(file, "rw").getChannel();
        long startPosition = 0;
        long remaining = fileChannel.size() - startPosition;
        long size = remaining > Integer.MAX_VALUE ? Integer.MAX_VALUE : remaining;
        MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, startPosition, size);
        process(mappedByteBuffer);

        while (remaining > 0) {
            System.out.println(remaining);
            startPosition = startPosition + size;
            remaining = fileChannel.size() - startPosition;
            if (remaining < 1) {
                break;
            }
            size = remaining > Integer.MAX_VALUE ? Integer.MAX_VALUE : remaining;
            mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, startPosition, size);
            process(mappedByteBuffer);
        }
    }

    private void process(MappedByteBuffer mappedByteBuffer) {
        for (int i = 0; i < mappedByteBuffer.capacity(); i++) {
            mappedByteBuffer.get();
        }
    }

    @Override
    void write0(String file, int gb) {

    }
}
