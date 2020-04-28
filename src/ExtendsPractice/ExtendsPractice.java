package ExtendsPractice;

class Teacher{
	private String name;
	private String school;
	
	public Teacher(String name,String school) {
		this.name = name;
		this.school = school;
	}
	
	public void giveLesson() {
		System.out.println("֪ʶ�㽲��");
		System.out.println("�ܽ�����");
	}
	
	public void introduce() {
		System.out.println("����" + name + "������" + school);
	}
}

class CTeacher extends Teacher{
	private double salary;
	
	public CTeacher(String name,String school,double salary) {
		super(name,school);
		this.salary = salary;
	}
	
	public void giveLesson() {
		System.out.println("����VC");
		super.giveLesson();
	}
}

class JAVATeacher extends Teacher{
	private double salary;
	
	public JAVATeacher(String name,String school,double salary) {
		super(name,school);
		this.salary = salary;
	}
	
	public void giveLesson() {
		System.out.println("����Eclipse");
		super.giveLesson();
	}
}

public class ExtendsPractice {
	public static void main(String arg[]) {
		CTeacher t1 = new CTeacher("zhang","s",15000);
		JAVATeacher t2 =new JAVATeacher("liu","a",20000);
		t1.introduce();
		t1.giveLesson();
		t2.introduce();
		t2.giveLesson();
	}
}
