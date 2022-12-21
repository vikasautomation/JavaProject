package oops_Concept;

public class Bank_Account {
	private long Account_Number;
	private String Acount_Holder;
	private double Account_Balance=10000;
	double Money_After_Deposit;
	double Money_After_Withdraw;
	double temp=0;
	double Current_Balance;
	
	public void depositMoney(long Account_Number,String Acount_Holder,double depositAmount) {
		if(depositAmount>=0) {
			Money_After_Deposit= Account_Balance+depositAmount;
			Account_Balance=Money_After_Deposit;
			
			System.out.println("Money has been deposited  "+Account_Balance);
			
		}else{
			System.out.println("you have entered invalid amount -->"+depositAmount);

		}
	}
	public void withdrawMoney(long Account_Number,String Acount_Holder,double withdrawAmount) {
		if(withdrawAmount>=0) {
			Money_After_Withdraw=Account_Balance-withdrawAmount;
			Account_Balance=Money_After_Withdraw;
			System.out.println("Money has been successfully withdrawn --> "+Money_After_Withdraw);
			 
		}else {
			System.out.println("you have entered invalid amount -->  "+withdrawAmount);

		}
	}
	public void CurrentBalanceAftertransaction() {
		System.out.println("Here we final current balance after transactions  "+Account_Balance);
		
	}
	

}
