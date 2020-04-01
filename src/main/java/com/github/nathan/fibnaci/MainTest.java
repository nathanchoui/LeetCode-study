package com.github.nathan.fibnaci;

import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * @author nathan.z
 * @date 2020/3/28.
 */
public class MainTest {

    public static void main(String[] args) throws RunnerException {

//        Fibnaci fibnaci = new FibRecImpl();
//        Fibnaci fibnaci = new FIbForImpl();
//        System.out.println(fibnaci.fib(3));


        Options opt = new OptionsBuilder()
                .include(FibTest.class.getSimpleName())
                .forks(1)
                .build();
        new Runner(opt).run();
    }



}
