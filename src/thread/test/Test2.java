package thread.test;

import collection.test.test2;

class Ttest2 implements Runnable{
    private int num=99;

    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+"======="+num -- );
            if (num < 1){
                break;
            }
        }
    }
}




public class Test2 {
    public static void main(String[] args) {
        Ttest2 t=new Ttest2();
        new Thread(t,"manong").start();
        new Thread(t,"manong2").start();
        new Thread(t,"manong3").start();

    }
}
