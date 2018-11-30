package demo;

public class Circle {
    //默认的构造方法
    Circle() {
        count++;
    }


    //构造方法 用来构造类 可以有n个
    Circle(double pram) {
        radius = pram;
    }

    Circle(double pram, String nameParam) {
        radius = pram;
        name = nameParam;
    }

    double radius;
    String name;//类的数据域 成员变量

    static int count;//static关键字 将变量 变为类级别的 所有对象共享


    //类的方法域
     double getArea() {
        return Math.PI * radius * radius;
    }
   double getRadius(){return  radius;}
    double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    //启动类
    void setRadius(double param) {
        radius = param;
    }




}
