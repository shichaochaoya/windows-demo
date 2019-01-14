package JAVA8.students;

import java.time.LocalDate;

public class Student {
    public enum Gender{
        FEMALE,MALE
    }
    public enum Department{
        CS,SE,CN,AT
    }
    private long id;
    private String name;
    private Gender gender;
    private Integer age;
    private Department department;
    private Integer credit;
    private LocalDate birth;

    public Student(long id, String name, Gender gender, Integer age, Department department, Integer credit, LocalDate birth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.department = department;
        this.credit = credit;
        this.birth = birth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{"+
                "id="+name+
                ",gender="+gender+
                ",age="+age+
                ",credit="+credit+
                ",entryDate="+birth+
                ",department="+department;
    }
}
