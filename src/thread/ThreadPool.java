package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println("自定义线程任务在执行"+i);
        }
    }
}

class Test {
    public static void main(String[] args) {
        //创建线程池对象，参数5，代表5个线程的线程池
        ExecutorService service= Executors.newFixedThreadPool(5);
        //创建Runnable线程任务对象
        ThreadPool test=new ThreadPool();
        //从线程池中获取线程对象
        service.submit(test);
        System.out.println("--------------------");
        //在获取一个线程对象
        service.submit(test);
        //关闭线程池
        service.shutdown();
    }
}
