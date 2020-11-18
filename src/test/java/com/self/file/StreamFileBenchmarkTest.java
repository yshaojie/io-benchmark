package com.self.file;

import org.junit.Test;

/**
 * @author shaojieyue
 * @date 2020/11/02
 */
public class StreamFileBenchmarkTest {
    @Test
    public void readTest(){
        for (int i = 0; i < 5; i++) {
            final StreamFileBenchmark streamFileBenchmark = new StreamFileBenchmark();
            streamFileBenchmark.read("/tmp/test.txt", 3);
        }

    }
}
