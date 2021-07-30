/*Bhavya kellla
 Programming fundamentals
 Summer
 Programming Assignment lab 2
 Exercise #2
 */

public class Account {
	static int numAccounts = 0;  //initialize the numAccounts

	Account()
	{
		numAccounts += 1;  //add 1 for each account object creation
	}

	static int getNumAccounts()  // we can also execute without static
	{
		
		return numAccounts;     //return numAccounts, if there is  no more account object creation
	}

	public static void main(String[] args) {
		System.out.println("Accounts");
		Account obj1=new Account(); 				  
		System.out.println(obj1.getNumAccounts());   //display the no. accounts created
		Account obj2=new Account();
		System.out.println(obj2.getNumAccounts());
		Account obj3=new Account();
		System.out.println(obj3.getNumAccounts());
		Account obj4=new Account();
		System.out.println(obj4.getNumAccounts());
		
		
	}

}

