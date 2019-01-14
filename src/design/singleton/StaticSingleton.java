package design.singleton;

public class StaticSingleton {
    private static StaticSingleton instance;
    StaticSingleton(){}
    static {instance = new StaticSingleton(); }
    public static StaticSingleton getInstance(){
        return instance;
    }
    @Override
    public String toString(){
        String str = super.toString().split("@")[1];
        return "i am" + str + "a static block singleton";
    }

    public static void main(String[] args) {
        StaticSingleton singleton = StaticSingleton.getInstance();
        System.out.println(singleton);
        StaticSingleton singleton1 = StaticSingleton.getInstance();
        System.out.println(singleton1);
    }
}
