package com.self.file;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * @author shaojieyue
 * @date 2020/11/03
 */

public class DD {
    public static void main(String[] args) {
        System.out.println(Duration.ofHours(1).getSeconds());
        System.out.println(Duration.ofHours(1).toMinutes());
        System.out.println(Duration.ofHours(1).toDays());
        System.out.println(TimeUnit.MINUTES.toDays(1));
    }
}

