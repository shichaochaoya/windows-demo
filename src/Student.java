package demo;

public class Student {
    public Student() {
    }

    public Student(String name, int age, int gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private String name;

   private  int age;

   private  int gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
