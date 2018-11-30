package thread.test;

class ThreadTest extends Thread{


    @Override
    public void run(){
        try {
        while (true){
            System.out.println("wang");
            Thread.sleep(300);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Test1 {
    public static void main(String[] args) {
        Thread thread = new ThreadTest();
        thread.start();
    }
}
