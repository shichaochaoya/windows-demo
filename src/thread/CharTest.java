package thread;

public class CharTest {

    public static void main(String[] args) {
        Thread t2=new Thread(new demo.thread.PrintChar("B",100));
        //Thread t1=new Thread(new PrintChar("A",100));
        //t1.start();
        t2.start();
        try {
        for (int i = 0; i <50 ; i++) {
            System.out.print(i);
            if (i==20){
                t2.join();
                }
        }
        }catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }


