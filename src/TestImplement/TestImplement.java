package TestImplement;

interface Singer{
    public void sing();
    public void sleep();
}

interface Painter{
    public void paint();
    public void eat();
}

class Student implements Singer{
    private String name;
    Student(String name){this.name = name;}
    public String getName(){return name;}
    public void study(){System.out.println("Studying!");}
    @Override
    public void sing(){System.out.println("Student is singing!");}
    @Override
    public void sleep(){System.out.println("Student is sleeping");}
}

class Teacher implements Singer,Painter{
    private String name;
    Teacher(String name){this.name = name;}
    public String getString(){return name;}
    public void teach(){System.out.println("Teaching!");}
    @Override
    public void sing(){System.out.println("Teacher is singing!");}
    @Override
    public void sleep(){System.out.println("Teacher is sleeping!");}
    @Override
    public void paint(){System.out.println("Teacher is painting!");}
    @Override
    public void eat(){System.out.println("Teacher is eating!");}
}

public class TestImplement {
    public static void main(String[] args){
        Student s = new Student("Bo");
        System.out.println("Name:" + s.getName());
        s.study();
        s.sing();
        s.sleep();
        Teacher t = new Teacher("SomeBody");
        System.out.println("Name:" + t.getString());
        t.eat();
        t.paint();
        t.sing();
        t.sleep();
        t.teach();
    }
}
