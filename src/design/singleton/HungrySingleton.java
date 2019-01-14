package design.singleton;
/**饿汉式 在装载类时就实例化对象*/

public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
