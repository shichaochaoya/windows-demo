package thread;

import java.util.concurrent.atomic.AtomicInteger;

class print implements Runnable{
    private AtomicInteger number=new AtomicInteger();
    @Override
    public void run() {
        number.set(99);
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int i = number.decrementAndGet();
            if (i < 1) {
                break;
            }else {
                System.out.println(Thread.currentThread().getName()+"-*******"+i);
            }
        }
    }
}



public class AtomicTest {
    public static void main(String[] args) {
        print p1 = new print();
        Thread t1 = new Thread(p1, "w");
        Thread t2 = new Thread(p1, "x");
        Thread t3 = new Thread(p1, "y");
        t1.start();
        t2.start();
        t3.start();
    }
}
