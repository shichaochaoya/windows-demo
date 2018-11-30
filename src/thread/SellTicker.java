package thread;

public class SellTicker implements Runnable {
    private static int ticketCount=100;
    private  Object obj=new Object();


    @Override
    public void run() {
        try {
            while (ticketCount > 0) {
            sellTicket();
            Thread.sleep(100);
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    private synchronized static void sellTicket() {
       /* synchronized (this){//同步代码块 锁是任何一个对象*/
            if (ticketCount > 0) {
                ticketCount--;
                System.out.println(Thread.currentThread().getName()+"买票  还剩："+ticketCount+"张");
            }else {
                System.out.println("票卖完了");
            }
    }
}

