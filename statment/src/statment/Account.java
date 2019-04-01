package statment;
import java.util.*;
public class Account {
	private String accountNumber , holderName,secrectCode,email;
	private int debit,credits;
	public Account() {
		this.accountNumber="1020304050";
		this.holderName="yasir";
		this.secrectCode="code";
		this.email="thug@gmail.com";
		this.debit=1000;
		this.credits=20000;
	}
	public void generateStatement(String ac) {
		if(ac.equals(this.accountNumber)) {
			System.out.println("Generate Statement from account number");
			System.out.println("Account number :"+this.accountNumber);
			System.out.println("Holder Name :"+this.holderName);
			System.out.println("Number of Debits :"+this.debit);
			System.out.println("Number of Credits :"+this.credits);
			
		}
		else
			System.out.println("Account not found");
	}
	public void generateStatement(String code,String email) {
		if(code.equals(this.secrectCode) && email.equals(this.email)) {
			System.out.println("Generate Statement from Secret Code and email id");
			System.out.println("Account number :"+this.accountNumber);
			System.out.println("Holder Name :"+this.holderName);
			System.out.println("Number of Debits :"+this.debit);
			System.out.println("Number of Credits :"+this.credits);
		}
		else
			System.out.println("Acount not found");
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		 String Number ,code,email;
		 Number=sc.nextLine();
		 code=sc.nextLine();
		 email=sc.nextLine();
		 Account ob=new Account();
		 ob.generateStatement(Number);
		 ob.generateStatement(code,email);
		sc.close();
		 
		 
	}

}
