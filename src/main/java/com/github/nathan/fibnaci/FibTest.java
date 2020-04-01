package com.github.nathan.fibnaci;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;

import java.util.concurrent.TimeUnit;

/**
 * @author nathan.z
 * @date 2020/3/28.
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class FibTest {

    Fibnaci fibFor = new FibForImpl();

    Fibnaci fibRec = new FibRecImpl();

    @Benchmark
    public void testFibFor() {
        System.out.println(fibFor.fib(10));
    }

    @Benchmark
    public void testFibRec() {
        System.out.println(fibRec.fib(10));
    }
}
