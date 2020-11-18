package com.self.file;


import org.junit.Test;

/**
 * @author shaojieyue
 * Created at 2020-10-16 18:05
 */
public class BufferReaderBenchmarkTest {

    @Test
    public void writeTest(){
        final BufferReaderWriterBenchmark benchmark = new BufferReaderWriterBenchmark();
        benchmark.write("/tmp/test1.txt",1);
    }

    @Test
    public void readTest(){
        for (int i = 0; i < 10; i++) {
            final BufferReaderWriterBenchmark benchmark = new BufferReaderWriterBenchmark();
            benchmark.read("/tmp/test.txt",1028);
        }

    }

}
