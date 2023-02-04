package interfaceConcept;

public class Developing implements ClientBank, BankingDomain{

	public static void main(String[] args) {
		//d1 is referring the all interface methods along with this class methods 
	Developing d1= new Developing();
	d1.cashtransfer();
	d1.checkBalance();
	d1.withdrawl();
	d1.login();
	ClientBank d2= new Developing();// run time polymorphism
	d2.cashtransfer();
	d2.checkBalance();
	d2.withdrawl();
	//d2.login();-->This method can not be called with this object as is referring the interfaces methods only 
	BankingDomain d3= new Developing();
	d3.neftService();
	d3.netBanking();
	}

	@Override
	public void cashtransfer() {
		System.out.println("implemented cashtransfer");
		
	}

	@Override
	public void withdrawl() {
		System.out.println("implemented withdrawl");		
	}

	@Override
	public void checkBalance() {
		System.out.println("implemented checkBalance");		
		
	}
	public void login() {
		System.out.println("implemented Login");		

	}

	@Override
	public void netBanking() {
		System.out.println("implemented netBanking");		
	}

	@Override
	public void neftService() {
		System.out.println("implemented neftService");		
	}

}
