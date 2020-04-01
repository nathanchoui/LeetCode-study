package com.github.nathan.fibnaci;

/**
 * @author nathan.z
 * @date 2020/3/28.
 */
public class FibRecImpl implements Fibnaci {

    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
