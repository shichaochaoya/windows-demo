package demo.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    /**
     *泛型方法
     */
    public static void getDate(List<?> date){
        System.out.println("date:"+date.get(0));
    }
    public static void getNumber(List<? extends Number> numbers) {// ？ exteds 上限，包含NUMBER及其下层子类  ？super 下限，NUMBER及其的父类
        System.out.println("number:"+numbers.get(0));
    }
    public static void getAge(List<? super Integer> age){
        System.out.println("age:"+age.get(0));
    }



    /**
     *泛型类
     */
    public static class Generc<T>{
        private T className;
        private T name;
        public void getClassName(T t) {
            System.out.println(t.getClass().getName());
        }
    }



    public static void main(String[] args) {
        //getNumber(name);
        List<String> name=new ArrayList<String>();
        List<Integer> age=new ArrayList<>();
        List<Float> id=new ArrayList<>();
        name.add("wang");
        age.add(12);
        id.add(1.263f);
        getDate(name);//调用泛型方法
        getAge(age);//调用泛型方法
        getNumber(id);//调用泛型方法

        Generc generc=new Generc();//创建泛型对象
        Generc generc1=new Generc();
        generc.getClassName("wang");
        generc1.getClassName(1212);

    }
}
