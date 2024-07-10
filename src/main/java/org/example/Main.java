package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(mySqrt(51564684));
    }
    public static long mySqrt(long x) {
        if (x < 0) {
            throw new IllegalArgumentException("Negative input is not allowed");
        }
        if (x == 0 || x == 1) {
            return x;
        }

        long minLength = 1;
        long maxLength = 10;

        while (maxLength * maxLength <= x) {
            minLength = maxLength;
            maxLength *= 10;
        }

        long minIndex = minLength;
        long maxIndex = maxLength;

        while (minIndex <= maxIndex) {
            long mid = minIndex + (maxIndex - minIndex) / 2;
            long square = mid * mid;
            if (square == x) {
                return mid;
            } else if (square < x) {
                minIndex = mid + 1;
            } else {
                maxIndex = mid - 1;
            }
        }

        return maxIndex;
    }
}