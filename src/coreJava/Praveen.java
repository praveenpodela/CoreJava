package coreJava;

class Apgvb{
	
	void applicationFillup() {
		
		System.out.println("date__/ age__/name__address__");
		
	}
	void proofs(String aadhar,String voteid) {
		System.out.println("id="+aadhar+" voter id is="+voteid);
		
		
	}
    String bankbook() {
    	System.out.println("the passbook is given");
    	return "passbook";
    	
    }
	String deposite(int amount) {
		System.out.println("amount deposited succesfully with rupees ="+amount);
		return"deposite";
	}
	}


public class Praveen {

	public static void main(String[] args) {
		Apgvb obj = new Apgvb() ;
		obj.applicationFillup();
		
		obj.proofs("45454","16546");
		obj.bankbook();
		obj.deposite(5000);
		System.out.println("thank you visit again");
		
		
		
			
			
			
			
		
	

	}

}
