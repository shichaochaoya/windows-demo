package JAVA8.students;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;


public class StudentStats {
    public static void main(String[] args) {
        List<Student>students = readDB();
        long studentCount = students
                .stream()
                .mapToLong(s->1L)//将一个String类型的集合通过Stream转化成long类型的集合
                .sum();
        log("Total number of students is:",studentCount);
        Map<Student.Gender,Long>groupCountByGender = students.stream()
                .collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
        log("Student number by gender is",groupCountByGender);

        Optional<Student>maxCredit = students.stream()
                .max((s1,s2) -> s1.getCredit()-s2.getCredit());
        if (maxCredit.isPresent()) {
            log("max credit is",maxCredit.get().getName());
        }else {
            log("can not find max credit","!");
        }
        Integer sumCredits = students.stream()
                .reduce(0,
                        (Integer partialSum,Student s)->{
                            Integer middle = partialSum+s.getCredit();
                            System.out.println(Thread.currentThread().getName()+""+
                                    s.getName()+""+middle);
                            return middle;
                        },
                        (a,b)->{
                            System.out.println(Thread.currentThread().getName()+" "+a+" "+b);
                            return null;
                        });
        log("The sum Credit is",sumCredits);

        boolean allMale = students.stream()
                .allMatch(s->s.getGender()==Student.Gender.MALE);
        log("Whether all students are male:",allMale);
        LongSummaryStatistics creditStsts=students.stream()
                .map(Student::getCredit)
                .collect(LongSummaryStatistics::new,
                        LongSummaryStatistics::accept,
                        LongSummaryStatistics::combine);
        log("Starts:",creditStsts);

        Map<String, Integer> simpleStudent=students.stream()
                .collect(Collectors.toMap(Student::getName,Student::getCredit));
        log("<Name,Credits:",simpleStudent);

        String names=students.stream()
                .filter(s->s.getCredit()>=60)
                .map(Student::getName)
                .collect(Collectors.joining(",","YD 2018 Best Students<"," Great!>"));
        log("",names);

    }






    private static List<Student> readDB() {
        Student s1=new Student(1L,"ZhangSan",Student.Gender.MALE,24, Student.Department.AT,30, LocalDate.of(1996, Month.FEBRUARY,12));
        Student s2=new Student(2L,"ZhangSanSan",Student.Gender.MALE,23, Student.Department.AT,40, LocalDate.of(1997,Month.APRIL,10));
        Student s3=new Student(3L,"ZhangSanSi",Student.Gender.MALE,22, Student.Department.CN,35, LocalDate.of(1996,Month.AUGUST,11));
        Student s4=new Student(4L,"GaoDaShang",Student.Gender.MALE,21, Student.Department.SE,38, LocalDate.of(1997,Month.DECEMBER,9));
        Student s5=new Student(5L,"MeiJieCao",Student.Gender.MALE,20, Student.Department.CS,50, LocalDate.of(1998,Month.JANUARY,8));
        Student s6=new Student(6L,"LiSi",Student.Gender.MALE,19, Student.Department.SE,45, LocalDate.of(1996,Month.JULY,7));
        Student s7=new Student(7L,"WangMaZi",Student.Gender.MALE,18, Student.Department.CN,80, LocalDate.of(1997,Month.JUNE,6));
        Student s8=new Student(8L,"DaShaDiao",Student.Gender.MALE,21, Student.Department.AT,60, LocalDate.of(1998,Month.MARCH,5));
        Student s9=new Student(9L,"HeiHeiHei",Student.Gender.MALE,23, Student.Department.CN,75, LocalDate.of(1999,Month.MAY,4));
        Student s10=new Student(10L,"WangJunChao",Student.Gender.MALE,22, Student.Department.SE,65, LocalDate.of(1996,Month.NOVEMBER,3));
        Student s11=new Student(11L,"DaShaZi",Student.Gender.MALE,21, Student.Department.CS,70, LocalDate.of(1997,Month.OCTOBER,2));
        return Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11);
    }
    private static void log(String prefix,Object Content){
        System.out.println(prefix+Content);
    }
    }

