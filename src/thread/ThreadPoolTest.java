package thread;
import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //创建线程池对象
        ExecutorService threadPool= Executors.newFixedThreadPool(2);

        //创建一个callable接口子类对象
        MyCallable c=new MyCallable(100,200);
        MyCallable c2=new MyCallable(10,20);

        //获取线程池中的线程，调用callable接口子类对象中的call方法完成求和操作
        //<Integer>Future<Integer>submit(Callable<Integer>task)
        //Future 结果对象
        Future<Integer> result=threadPool.submit(c);
        //此Future的get方法所返回的结果类型
        Integer sum=result.get();
        System.out.println("sum="+sum);

        //再演示
        result=threadPool.submit(c2);
        sum=result.get();
        System.out.println("sum="+sum);
        //关闭线程池
    }

    private static class MyCallable implements Callable<Integer> {
        int x=5;
        int y=3;
        public MyCallable() {
        }

        public MyCallable(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public Integer call() throws Exception {//实现call方法，实现接口方法，返回值为Integer类型
            return x+y;
        }
    }
}
