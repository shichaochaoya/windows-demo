package demo.thread;

import java.util.Random;

public class PrintChar implements Runnable {
    String print;
    int time;

    public PrintChar(String print, int time) {
        this.print = print;
        this.time = time;
    }

    @Override
    public void run() {
       /* try {
            for (int i = 0; i < time; i++) {
                System.out.print(print);
                if (i >= 20) {
                    Thread.sleep(3000);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println();*/
    }
}
