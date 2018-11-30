package demo;

public class duotai {
    public static void main(String[] args) {
        new Person().printPerson();
        new Student2().printPerson();}

    }
    class Student2 extends Person{

        public String getInfo() {
            return "Student";
        }
    }
    class Person{
        public String getInfo(){
            return "Person";
        }
        public void printPerson(){
            System.out.println(getInfo());
        }
    }
