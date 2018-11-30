package demo;

public class Course {

    {
        studentList = new Student[50];
    }

    private Student[] studentList;

    private int studentNumber;
    private String CourseName;

    public Course(String courseName) {
        CourseName = courseName;
    }

    public void selectCourse(Student student) {
        this.studentList[studentNumber] = student;
        this.studentNumber++;
    }


    public Student[] getStudentList() {
        return this.studentList;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public void dropStudent(Student student) {
        int j=studentList.length;
        //遍历学生列表 找到名字一样的那个学生  然后从数组删除
        // 找到名字一样的学生后 记录下标 把数组最后一个元素 赋值给下标位置
        // 然后数组长度缩减一
        for (int i = 0; i < studentList.length; i++) {//挨个寻找
            if (student == studentList[i]) {
                System.out.println(i);
                studentList[i]=studentList[j];
                for (int k=i+1;k<studentList.length;k++){
                    studentList[i]=studentList[k];
                }
            }
        }
    }
}