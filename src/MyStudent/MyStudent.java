package MyStudent;

import java.util.Scanner;

class Student{
	int grade;
	String college;
	String major;
	int classnum;
	String name;
	double java;
	double wlyl;
	double sjk;
	double finalScore;
	
	public double FinalScore() {
		return java + wlyl + sjk;
	}
	
}

public class MyStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		Scanner test = new Scanner(System.in);
		s1.grade = test.nextInt();
		s1.college = test.next();
		s1.major = test.next();
		s1.classnum = test.nextInt();
		s1.name = test.next();
		s1.java = test.nextDouble();
		s1.wlyl = test.nextDouble();
		s1.sjk = test.nextDouble();
		test.close();
		
		System.out.println("Name:" + s1.name);
		System.out.println("College:" + s1.college);
		System.out.println("Major:" + s1.major);
		System.out.println("ClassNum:" + s1.classnum);
		System.out.println("FinalScore:" + s1.FinalScore());
	}

}
