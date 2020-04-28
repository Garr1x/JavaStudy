package BankTester;

class BankAccount{
	String ownerName;
	int accountNumber;
	float balance;
	public BankAccount() {
		this("lilei",123,10.0f);
	}
	public BankAccount(String name,int number,float bal) {
		ownerName=name;
		accountNumber=number;
		balance=bal;
	}
	public BankAccount(BankAccount ba) {
		ownerName=ba.ownerName;
		accountNumber=ba.accountNumber;
		balance=ba.balance;
	}
}
		
public class BankTester {
	public static void main(String args[]) {
		BankAccount myAccount=new BankAccount();
		System.out.println("ownerName=" + myAccount.ownerName);
		System.out.println("accountNumber=" + myAccount.accountNumber);
		System.out.println("balance=" + myAccount.balance);
		BankAccount yourAccount=new BankAccount("zhanghua",124,20f);
		System.out.println("ownerName=" + yourAccount.ownerName);
		System.out.println("accountNumber=" + yourAccount.accountNumber);
		System.out.println("balance=" + yourAccount.balance);
		BankAccount hisAccount=new BankAccount(myAccount);
		System.out.println("ownerName=" + hisAccount.ownerName);
		System.out.println("accountNumber=" + hisAccount.accountNumber);
		System.out.println("balance=" + hisAccount.balance);		
	}
}
