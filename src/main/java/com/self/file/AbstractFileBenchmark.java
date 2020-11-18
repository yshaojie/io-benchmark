package com.self.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author shaojieyue
 * Created at 2020-10-16 17:54
 */
public abstract class AbstractFileBenchmark {
     abstract void read0(String file,int kb) throws Exception;
     abstract void write0(String file,int gb);

    public void read(String file,int kb) {
        long start = System.currentTimeMillis();
        try {
            read0(file,kb);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("duration="+(end - start));
    }

    public void write(String file,int gb) {
        try {
            Files.deleteIfExists(Paths.get(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        long start = System.currentTimeMillis();
        write0(file,gb);
        long end = System.currentTimeMillis();
        System.out.println("duration="+(end - start));
    }

    protected String randomData(int bytes) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < bytes; i++) {
            stringBuilder.append("a");
        }
        return stringBuilder.toString();
    }
}
