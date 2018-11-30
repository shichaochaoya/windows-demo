package thread;

public class DemoTest {
    public static void main(String[] args) throws InterruptedException{
        Message msg = new Message("锁");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter, "waiter").start();
        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "waiter1").start();
        Notifier notifier = new Notifier(msg);
        new Thread(notifier,"notifier").start();
    }
}
