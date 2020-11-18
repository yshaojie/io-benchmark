package com.self.file;

import org.junit.Test;

/**
 * @author shaojieyue
 * Created at 2020-10-16 19:17
 */

public class FileChannelReaderWriterBenchmarkTest {
    @Test
    public void readTest(){
        final FileChannelReaderWriterBenchmark readerWriterBenchmark = new FileChannelReaderWriterBenchmark();
        readerWriterBenchmark.read("/tmp/test.txt",4);
    }
}
