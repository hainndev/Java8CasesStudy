/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

/**
 *
 * @author hnguyen
 */
public class Sum1 {

    public static void main(String[] args) {
        long r1 = sum(10_000_000);
        System.out.println("R1: sum " + r1);

        long r2 = rangedSum(10_000_000);
        System.out.println("R2: rangedSum " + r2);

        long r3 = sideEffectParallelSum(10_000_000);
        System.out.println("R3: sideEffectParallelSum " + r3);
        
        long r4 = forkJoinSum(10_000_000);
        System.out.println("R4: forkJoinSum " + r4);
    }

    public static long sum(long n) {
        long start = System.nanoTime();
        long result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        long duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("duration: " + duration);
        return result;
    }

    public static long rangedSum(long n) {
        long start = System.nanoTime();
        long result = LongStream.rangeClosed(1, n).sum();
        long duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("duration: " + duration);
        return result;
    }

    public static long sideEffectParallelSum(long n) {
        long start = System.nanoTime();
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).parallel().forEach(accumulator::add);
        long result = accumulator.total.get();

        long duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("duration: " + duration);
        return result;
    }

    public static long forkJoinSum(long n) {
        long start = System.nanoTime();
        long[] numbers = LongStream.rangeClosed(1, n).toArray();
        ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
        long duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("duration: " + duration);
        return new ForkJoinPool().invoke(task);
    }
}
