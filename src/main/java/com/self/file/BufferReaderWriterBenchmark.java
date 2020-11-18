package com.self.file;

import java.io.*;

/**
 * @author shaojieyue
 * Created at 2020-10-16 17:57
 */

public class BufferReaderWriterBenchmark extends com.self.file.AbstractFileBenchmark {
    @Override
    protected void read0(String file,int kb) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file),kb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        while (true) {
            char[] chars = new char[kb];
            try {
                int read = bufferedReader.read(chars, 0, chars.length);
                if (read < 0) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }

    @Override
    protected void write0(String file,int gb) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        String randomData = randomData(1024 * 512);
        int byteSize = randomData.getBytes().length;
        //kbmbgb
        long oneGB = 1024L * 1024 * 1024*gb;
        for (int i = 0; i < oneGB/byteSize; i++) {
            try {
                bufferedWriter.write(randomData);
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}
