package TheameBased;

abstract class Bank{
	abstract void interest();
	abstract void payBackTime() ;
	void Loans()	{
		System.out.println("Loans are same for all categorys");	}
}
class icic extends Bank{
	
	void interest() {
		System.out.println("sbi interest is 2%");
		
	}
	
	void payBackTime() {
		// TODO Auto-generated method stub
		System.out.println("Pay Back Time for sbi bank is 1 year");
	}
		
}
class AxisBank extends icic{
	void interest() {
		System.out.println("sbi interest is 3%");
		
	}
	void  pacBackTime() {
		System.out.println("Pay Back Time for sbi bank is 2.5 years");
	}
		
	

}
public class Abstraction {
	public static void main(String args[]) {
		Bank  p ;
		p=new icic();
		
		p.interest();
		p.payBackTime();
		p.Loans();
		System.out.println("----------*-------");
		p= new AxisBank();
	
		p.interest();
		p.payBackTime();
		p.Loans();
	}

}









