package thread.test;
class Run {
    private int step;
    class HareRun implements Runnable {
        @Override
        public void run() {
            try {
                for (step= 0; step <= 100; step++) {
                    System.out.println(Thread.currentThread().getName() + "跑了" + step + "米");
                    Thread.sleep(100);
                    if (step == 90) {
                        System.out.println("兔子睡着啦");
                        Thread.sleep(5000);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"跑完了");
        }
    }


    class TortoiseRun implements Runnable {
        @Override
        public void run() {
            try {
                for (step = 0; step <= 100; step++) {
                    System.out.println(Thread.currentThread().getName() + "跑了" + step + "米");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"跑完了");
        }
    }


    private String winner;

    private Boolean winner(int step){
        step=this.step;
        if (winner!=null){
            return true;
        }else {
            if (step==100){
                winner=Thread.currentThread().getName();
            }
            return false;
        }
    }
   /* private String gameover(){
        winner(step);
        i

    }*/
}

public class Race  {
    public static void main(String[] args) {
        Thread tortoise = new Thread(new Run().new TortoiseRun(), "tortoise");
        Thread hare = new Thread(new Run().new HareRun(), "Hare");
        tortoise.start();
        hare.start();
    }
}
