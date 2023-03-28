package Static_Method;

public class Student {
    private int rollno;
    private String name;
    private  static  String college = "BBDIT";

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static  void  change(){
        college = "CODEGYM";
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    void  display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
