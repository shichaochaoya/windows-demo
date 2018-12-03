package thread.test;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.logging.LoggingMXBean;


class QuickSort {
    private int low;
    private int high;
    private Long[] numbers;

    public QuickSort(int low, int high, Long[] numbers) {
        this.low = low;
        this.high = high;
        this.numbers = numbers;
    }
    private static int partion(Long[] numbers,int low,int high){
        Long soldier = numbers[low];
        while (low < high) {
            while (low < high) {
                if (numbers[high] < soldier) {
                    numbers[low] = numbers[high];
                    break;
                }
                high--;
            }
            while (low < high) {
                if (numbers[low] > soldier){
                    numbers[high] = numbers[low];
                    break;
                }
                low++;
            }
        }
        numbers[low]=soldier;
        return low;
    }

    public static void  qsort(Long[] numbers, int low, int high){
        if (low < high) {
            int soldier = partion(numbers ,low, high);
            qsort(numbers,low,soldier-1);
            qsort(numbers,soldier+1,high);
        }
    }
}




class ParallelQuickSort extends RecursiveAction {
    private int threahold=30;
    private int low;
    private int high;
    private Long[] numbers;
    private static int partion(Long[] numbers,int low,int high){
        Long soldier = numbers[low];
        while (low < high) {
            while (low < high) {
                if (numbers[high] < soldier) {
                    numbers[low] = numbers[high];
                    break;
                }
                high--;
            }
            while (low < high) {
                if (numbers[low] > soldier){
                    numbers[high] = numbers[low];
                    break;
                }
                low++;
            }
        }
        numbers[low]=soldier;
        return low;
    }

    public ParallelQuickSort(int threahold, Long[] numbers) {
        this.threahold = threahold;
        this.numbers = numbers;
    }

    public ParallelQuickSort( int low, int high, Long[] numbers) {
        this.threahold = threahold;
        this.low = low;
        this.high = high;
        this.numbers = numbers;
    }



    @Override
    protected void compute() {
        if (high - low < threahold) {
         QuickSort.qsort(numbers,low,high);
        }else {
            int soldier =partion(numbers,low,high);
            ParallelQuickSort left=new ParallelQuickSort(low,soldier-1,numbers);
            ParallelQuickSort right=new ParallelQuickSort(soldier+1,high,numbers);
            invokeAll(left,right);
        }

    }
}
public class MainSort {
    private static Long[] RamdomNumbers(int n){
        Random random = new Random();
        Long[] numbers =new Long[n];

        for (int i = 0; i < n; i++) {
            Long num=random.nextLong();
            if (num < 0) {
                num=Math.abs(num);
            }
            numbers[i]=num;
        }
        return numbers;
    }


    public static void main(String[] args) {
        final int RUN_TIMES =10;
        final int SORT_NUM=10000000;
        final int THRESHOLD=36200;

        Long startTime;

        for (int i = 0; i < RUN_TIMES; i++) {
            Long[] pqsNumbers=RamdomNumbers(SORT_NUM);
            System.out.println("The "+ i + "run");
            System.out.println("Generating" + SORT_NUM + "numbers");
            System.out.println("EXECUTING ParallelQuickSort");
            ForkJoinPool pool=new ForkJoinPool();
            ParallelQuickSort parallelQuickSort=new ParallelQuickSort(THRESHOLD,pqsNumbers);
            startTime=System.currentTimeMillis();
            pool.execute(parallelQuickSort);
            while (!parallelQuickSort.isDone()) {}
                Long pqsRunTime =System.currentTimeMillis()-startTime;
                System.out.println("Tatal use :" + pqsRunTime + "ms\n");



        }
    }
}