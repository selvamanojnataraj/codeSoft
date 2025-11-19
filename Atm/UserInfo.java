package Atm;

import java.util.Scanner;

public  class UserInfo {
	
	int number = 1234;
	int password = 1234;
	Scanner sc = new Scanner(System.in);
	opeartions opr=new opeartions();
   //  int balance=0;
	void profile() {
		System.out.println("Enter ATM Number");
		int num = sc.nextInt();
		System.out.println("Enter Password");
		int pass = sc.nextInt();
		while(true) {
		if ((num == number) && (password == pass)) {
			System.out.println("Access permitted !!!");
			System.out.println("Welcome to our ATM");
			System.out.println("-------------------------");
			System.out.println("Enter your option");
			System.out.println("1.deposit \n2.Withdraw \n3.MiniStatement \n4.Exit");
			int option=sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter Amount to deposit");
				int amount=sc.nextInt();
				opr.deposit(amount);
				break;
			case 2:
				System.out.println("Enter Amount to Withdraw ");
				int cash=sc.nextInt();
				opr.withdraw(cash);
				
				break;
			case 3:
				opr.ministatement();
				break;
			case 4:
				opr.exit();
				break;
			default:
				System.out.println("Enter valid option");
				break;
			}
			
		} else {
			System.out.println("Access Denied !!!");
		}
	}

}
}
