package thread;

public class TickerTest {
    public static void main(String[] args) {
        SellTicker ticker=new SellTicker();

        Thread t1=new Thread(ticker,"窗口1");
        Thread t2=new Thread(ticker,"窗口2");
        Thread t3=new Thread(ticker,"窗口3");
        Thread t4=new Thread(ticker,"窗口4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
