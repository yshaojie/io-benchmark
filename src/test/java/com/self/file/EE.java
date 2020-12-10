package com.self.file;

/**
 * @author shaojieyue
 * @date 2020/12/06
 */

public class EE {
    public static void main(String[] args) {

        try {
            System.out.println(1 << 5);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("sss");
        }
    }

    private static boolean isBoolean(Boolean b) {
        return b;
    }
}
