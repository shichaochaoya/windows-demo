package design.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jdp");

        image.display();
        System.out.println("");

        image.display();
    }
}
