package com.github.nathan.fibnaci;

/**
 * @author nathan.z
 * @date 2020/3/28.
 */
public class FibForImpl implements Fibnaci {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int first = 0;
        int second = 1;
        int sum = 0;
        for (int i = 0; i < n - 1; i ++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}
