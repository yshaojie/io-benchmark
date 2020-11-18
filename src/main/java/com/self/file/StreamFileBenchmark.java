package com.self.file;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author shaojieyue
 * @date 2020/11/02
 */
public class StreamFileBenchmark extends AbstractFileBenchmark {
    @Override
    void read0(String file, int kb) throws Exception {
        final FileInputStream fileInputStream = new FileInputStream(new File(file));
        final byte[] bytes = new byte[kb];
        int read = fileInputStream.read(bytes);
        for (; read > 0; ) {
            read = fileInputStream.read(bytes);
        }
    }

    @Override
    void write0(String file, int gb) {

    }
}
