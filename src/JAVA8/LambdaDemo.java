package JAVA8;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        String[] names = {"wang","zhang","li","zhao"};
        List<String> listName = Arrays.asList(names);
        /**传统for循环*/
        for (String name : listName){
            System.out.println(name);
        }


        /**Lambda表达式foreach*/
        listName.forEach(System.out::println);
        listName.forEach((name)-> System.out.println(name));
        listName.forEach((String name) -> System.out.println(name));

    }
}
