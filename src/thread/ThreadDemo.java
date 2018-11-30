package demo.thread;

class RunableTest implements Runnable{
    private String name;
    private Thread t;
    RunableTest(String ThreadName) {
        name=ThreadName;
        System.out.println("Thread name is"+name);
    }
    public void run() {
        System.out.println("Running"+name);
        try {

        for (int i = 0; i <=4; i++) {
            System.out.println("Thread "+name+"\t"+i);
            Thread.sleep(1000);
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        System.out.println("Thread"+name+"start");
        if (t == null) {
            t = new Thread (this, name);
            t.start ();
        }
    }
}

class ThreadTest extends Thread{
    private String name;
    private Thread t;
    ThreadTest(String ThreadName){
        name=ThreadName;
        System.out.println("Thread name is"+name);
    }
    public void run() {
        System.out.println("Running"+name);
        try {

            for (int i = 0; i <=4; i++) {
                System.out.println("Thread "+name+"\t"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        System.out.println("Thread"+name+"start");
        if (t == null) {
            t = new Thread (this, name);
            t.start ();
        }
    }
}



public class ThreadDemo {
    public static void main(String[] args) {
        /*RunableTest t1 = new RunableTest("t1");
        t1.start();

        RunableTest t2 = new RunableTest("t2");
        t2.start();*/
        ThreadTest t1=new ThreadTest("t1");
        t1.start();
        ThreadTest t2=new ThreadTest("t2");
        t2.start();
    }
}
