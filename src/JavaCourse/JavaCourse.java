package JavaCourse;

class student {
	//��Ա����
	String name;
	int xh;
	double textScore,usualScore,finalScore;
	public double TR=0.3;
	public double RR=0.3;
	public double ER=0.4;
	
	//���췽��
	public student(String n,int x,double ts,double us,double fs) {
		name=n;
		xh=x;
		textScore=ts;
		usualScore=us;
		finalScore=fs;
	}
	
	public double endScore() {
		return textScore*TR+usualScore*RR+finalScore*ER;
	}
	
	public void showInfo() {
			System.out.println("Student Name:" + name);
		
			System.out.println("Student Number:" + xh);
		
			System.out.println("TextScore:" + textScore);
		
			System.out.println("UsualScroe:" + usualScore);

			System.out.println("FinalScore:" + finalScore);

			System.out.println("EndScore:" + endScore());
		}		
	}

public class JavaCourse{
	public static void main(String arg[]) {             //������
		student Student1 = new student("��",1820084,88,95,90);              //�������� ���ù��췽��
		
		Student1.showInfo();                       //���÷���
	}
}
