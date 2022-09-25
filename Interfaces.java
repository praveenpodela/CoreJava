package TheameBased;

interface zbank{
	
	void interest();
	void returnPeriod();
	
}

class hcfc implements zbank{
	int a;
	int b;
	public void interest(){
		
		System.out.println("hcfc bank has interest 3%");
	}
	public void returnPeriod () {
		System.out.println("pay back period for 2 yeras");
	}
}
class  kotak implements  zbank{
	int a;
	int b;
	public void interest(){
		System.out.println("kotak bank has interest 2%");
	}
	public void returnPeriod () {
		System.out.println("pay back period for 1 year");
	}
}


public class Interfaces {

	public static void main(String[] args) {
	
		
hcfc obj;
obj = new hcfc();
obj.interest();
obj.returnPeriod();
kotak obj1 = new kotak();
obj.interest();
obj.returnPeriod();



	
	

	}
 
}

