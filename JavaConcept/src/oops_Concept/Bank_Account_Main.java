package oops_Concept;

public class Bank_Account_Main {

	public static void main(String    [] args) {
		// TODO Auto-generated method stub
		Bank_Account BA= new Bank_Account();
		//(long Account_Number,String Acount_Holder,double depositAmount)
		BA.depositMoney(1234567, "Vikas", 100.5);
		BA.depositMoney(1234567, "Vikas", 200.5);
		BA.withdrawMoney(1234567, "Vikas", 100.5);
		BA.depositMoney(1234567, "Vikas", 600.5);
		BA.CurrentBalanceAftertransaction();
		BA.depositMoney(1234567, "Vikas", 600.5);
		BA.depositMoney(1234567, "Vikas", -100.5);
		BA.withdrawMoney(1234567, "Vikas", -500.5);
		BA.withdrawMoney(12345, "Ramesh", 500.5);
	}

}
