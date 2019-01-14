package design.singleton;

/**懒汉式 线程安全 加锁*/

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
