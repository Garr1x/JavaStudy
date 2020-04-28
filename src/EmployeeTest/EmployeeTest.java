package EmployeeTest;

class Person {
    String name;
    String address;
    public Person(String name,String address){
        this.name = name;
        this.address = address;
    }
    public void showInfo(){
        System.out.println("Name:" + name);
        System.out.println("Address:" + address);
    }
}

class Employee extends Person {
    String ID;
    double wage;
    int workAge;
    public Employee(String name,String address,String ID,double wage,int workAge){
        super(name,address);
        this.ID = ID;
        this.wage = wage;
        this.workAge = workAge;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("ID:" + ID);
        System.out.println("Wage:" + wage);
        System.out.println("WorkAge:" + workAge);
    }
}

class Manager extends Employee{
    String level;
    public Manager(String name,String address,String ID,double wage,int workAge,String level){
        super(name,address,ID,wage,workAge);
        this.level = level;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("Level:" + level);
    }
}

class Add{
    public static double addWage(double wage,String level){
        if(level == null){
            return  wage * 1.1;
        }
        else{
            return wage * 1.2;
        }
    }
}

public class EmployeeTest {
    public static void main(String[] arg){
        Employee E = new Employee("Jacky","China","6324",11000,5);
        Manager M = new Manager("James","Japan","5020",15000,3,"1");
        E.showInfo();
        System.out.println("Salary after salary increase:" + Add.addWage(E.wage,null) + "\n");
        M.showInfo();
        System.out.println("Salary after salary increase:" + Add.addWage(M.wage,"1"));
    }
}
