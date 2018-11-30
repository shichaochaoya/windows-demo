package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Emp{
    private String e_id;
    private String e_name;

    public Emp(String e_id, String e_name) {
        this.e_id = e_id;
        this.e_name = e_name;
    }

    public String getE_id() {
        return e_id;
    }

    public void setE_id(String e_id) {
        this.e_id = e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }
}




public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        Emp emp1=new Emp("001","张三");
        Emp emp2 =new Emp("003","王一");
        Emp emp3=new Emp("002","李四");
        map.put(emp1.getE_id(),emp1.getE_name());
        map.put(emp2.getE_id(),emp2.getE_name());
        map.put(emp3.getE_id(),emp3.getE_name());
        Set<String> set=map.keySet();
        String str=map.get(set);
        Iterator it=set.iterator();
        while (it.hasNext()) {
            String name=(String) it.next();
            System.out.println(name+map.get(name));
        }
    }
}
