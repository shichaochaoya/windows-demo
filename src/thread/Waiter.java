package thread;

public class Waiter implements Runnable {

    private Message msg;

    public Waiter(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        synchronized (msg){
            try {
            System.out.println(name+"等待时间"+System.currentTimeMillis());
                msg.wait();//等待直到被唤醒
                System.out.println(msg.getMsg()+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
