package com.self.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.Test;

/**
 * @author shaojieyue
 * Created at 2020-10-16 20:01
 */
public class MappedByteBufferReaderWriterBenchmarkTest {
    @Test
    public void readTest(){
        final MappedByteBufferReaderWriterBenchmark readerWriterBenchmark = new MappedByteBufferReaderWriterBenchmark();

        readerWriterBenchmark.read("/tmp/test.txt", 4);
    }

    @Test
    public void dd() throws Exception {
        final File file = new File("/tmp/test.txt");
        final FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (true) {
            final String line = bufferedReader.readLine();
            if (line != null) {
                System.out.println(line);
            }

        }
//        TimeUnit.SECONDS.sleep(20);
////        fileReader.close();
//        try {
//            TimeUnit.SECONDS.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
