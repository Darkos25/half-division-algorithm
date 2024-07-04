package org.example;

import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(mySqrt(645161265));


    }
    public static long mySqrt(long x) {
        long current = 0;
        String length = Long.toString(x);
        long numsOfsqrt = 1;
        long maxLength = 1;
        if (x == 1 || x == 2 || x == 3){
            return 1;
        }
        if (x == 0){
            return 0;
        }
        for (int i = 1; i < Math.ceil((double) length.length()/2); i++) {
            numsOfsqrt *= 10;
            maxLength = numsOfsqrt * 10;
        }

        while (numsOfsqrt*numsOfsqrt < x && maxLength*maxLength > x) {
            numsOfsqrt += 1;
            maxLength -= 1;
            if (numsOfsqrt * numsOfsqrt > x) {
                current = numsOfsqrt-1;
            } else if (maxLength < x) {
                current = maxLength;
            }
        }
        return current;
    }
}