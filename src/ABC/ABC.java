package ABC;

class Animal{
	private String name;
	Animal(String name){
		this.name = name;
	}
	public String Getname() {
		return name;
	}
	public void enjoy() {
		System.out.println("Running____");
	}
}

class Cat extends Animal{
	private String eyesColor;
	Cat(String name,String eyesColor){
		super(name);
		this.eyesColor = eyesColor;
	}
	public String getEyesColor() {
		return eyesColor;
	}
	public void enjoy() {
		System.out.println("Climbing Tree___");
	}
}

class Dog extends Animal{
	private String furColor;
	public Dog(String name,String furColor){
		super(name);
		this.furColor = furColor;
	}
	public String getFurColor() {
		return furColor;
	}
	public void enjoy() {
		System.out.println("Swiming____");
	}
}

class Lady{
	private String name;
	private Animal pet;
	Lady(String name,Animal pet){
		this.name = name;
		this.pet = pet;
	}
	public String getName() {
		return name;
	}
	public void myPetEnjoy() {
		pet.enjoy();
	}
}


public class ABC {
	public static void main(String argp[]) {
		Cat c = new Cat("Mi","Blue");
		Dog d = new Dog("Wang","Golden");
		
		Lady l1 = new Lady("Miss Chen",c);
		Lady l2 = new Lady("Miss Liu",d);
		
		System.out.println("Name:" + l1.getName() + "Animal Hobby:");
		l1.myPetEnjoy();
		System.out.println("Name:" + l2.getName() + "Animal Hobby:");
		l2.myPetEnjoy();
		
	}
}
