package Atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class opeartions {
	balance bal=new balance();
	Map<Integer,String> miniStatement=new HashMap<>();
    void deposit(int money){
    	bal.setBalance(money+bal.getBalance());
    	System.out.println("Amount Deposited Successfully !!!");
    	System.out.println("Your balance Will be "+ bal.getBalance());
    	miniStatement.put(money," Deposited ");
    }
    void withdraw(int money) {
    	if(money<bal.getBalance()) {
    		System.out.println("Amount Withdraw Successfully !!!");
    		System.out.println("Your balance will be "+(bal.getBalance()-money));
    		miniStatement.put(money," Withdrawn ");
    	}
    	else {
    		System.out.println("insufficiat Fund ");
    	}
    	
    }
    void ministatement() {
    	for(Map.Entry<Integer,String> m:miniStatement.entrySet()) {
    		System.out.println(m.getKey()+" "+m.getValue());
    	}
    }
    void exit() {
    	System.out.println("Thank you for visiting Us ..!!!");
    	System.out.println("have a nice day ..!!!");
    
    }
}
