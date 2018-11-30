package collection.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class test3 {
    public static void main(String[] args) {
        Emp emp1=new Emp("wang","2");
        Emp emp2=new Emp("wang013","1");
        Emp emp3=new Emp("wang015","3");
        Map<String,String> map=new HashMap<>();
        map.put(emp1.getId(),emp1.getName());
        map.put(emp2.getId(),emp2.getName());
        map.put(emp3.getId(),emp3.getName());
        System.out.println(map);
        map.remove("wang015");
        System.out.println(map);
    }
}








class Emp  {
    String id;
    String name;

    public Emp(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
