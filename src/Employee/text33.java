package Employee;

abstract class Employee{
    protected String name;
    protected double salary;
    public abstract double sumSalary();
}

final class Boss extends Employee{
    public Boss(String name,double salary){
        this.salary = salary;
        this.name = name;
    }
    @Override
    public double sumSalary(){
        return salary;
    }
    public String gatName(){
        return name;
    }
}

final class CommissionWorker extends Employee{
    private double floatingSalary;
    public CommissionWorker(String name,double salary,double floatingSalary){
        this.salary = salary;
        this.floatingSalary = floatingSalary;
        this.name = name;
    }

    @Override
    public double sumSalary() {
        return salary + floatingSalary;
    }
    public String gatName(){
        return name;
    }
}

final class PieceWorker extends Employee{
    private double goods;
    public PieceWorker(String name,double goods,double salary){
        this.goods = goods;
        this.salary = salary;
        this.name = name;
    }
    @Override
    public double sumSalary(){
        return goods*salary;
    }
    public String gatName(){
        return name;
    }
}

final class HourlyWorker extends Employee{
    private double workTime;
    public HourlyWorker(String name,double workTime,double salary){
        this.workTime = workTime;
        this.salary = salary;
        this.name = name;
    }
    @Override
    public double sumSalary(){
        return workTime*salary;
    }
    public String gatName(){
        return name;
    }
}

public class text33 {
    public static void main(String[] arg){
        Boss B = new Boss("Zhong",20000);
        System.out.println("Name:" + B.gatName() + "\tSalary:" + B.sumSalary());
        CommissionWorker CW = new CommissionWorker("Liu",10000,2000);
        System.out.println("Name:" + CW.gatName() + "\tSaraly" + CW.sumSalary());
        HourlyWorker HW = new HourlyWorker("Zhang",50,180);
        System.out.println("Name:" + HW.gatName() + "\tSaraly:" + HW.sumSalary());
        PieceWorker PW = new PieceWorker("Wang",100,100);
        System.out.println("Name:" + PW.gatName() + "\taraly:" + PW.sumSalary());
    }
}
