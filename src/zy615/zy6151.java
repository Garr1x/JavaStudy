package zy615;


abstract class interfaceTest{
    public static final double A=0.6;
    public static final double B=0.4;
    public double finalscore(){return 0;}
}

class Student extends interfaceTest{
    private String name;
    private double usualGrades;
    private double midtermResults;

    public Student(String name,double usualGrades,double midtermResults){
        this.name = name;
        this.usualGrades = usualGrades;
        this.midtermResults = midtermResults;
    }

    @Override
    public double finalscore() {
        return usualGrades*A + midtermResults*B;
    }
}

public class zy6151 {
    public static void main(String[] args){
        Student s = new Student("Zhong",90,85);
        System.out.println("Final Score:" + s.finalscore());
    }
}
