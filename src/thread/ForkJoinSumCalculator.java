/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.concurrent.RecursiveTask;

/**
 *
 * @author hnguyen
 */
public class ForkJoinSumCalculator extends RecursiveTask<Long> {

    //the array of number to sum
    private final long[] numbers;
    //the inital and final positions 
    private final int start;
    //
    private final int end;

    //size of array under which task
    public static final long THRESHOLD = 10_000;

    public ForkJoinSumCalculator(long[] numbers) {
        this(numbers, 0, numbers.length);
    }

    public ForkJoinSumCalculator(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int length = end - start;
        if (length <= THRESHOLD) {
            return computeSequentially();
        }

        ForkJoinSumCalculator leftTask = new ForkJoinSumCalculator(numbers, start, start + length / 2);
        leftTask.fork();

        ForkJoinSumCalculator rightTask = new ForkJoinSumCalculator(numbers, start + length / 2, end);
        rightTask.fork();
        
        long rightResult = rightTask.compute();
        long leftResult = leftTask.join();
        
        return leftResult + rightResult;

    }

    private long computeSequentially() {
        long sum = 0;
        for (int i = (int) start; i < end; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
