package coreJava;


class masakali{
	
	int id ;
	String name ;
	float salary;
	long phnno;
	masakali(int i,String n,float s){
		
		id = i;
		name = n;
		salary = s;
		
	}
	masakali (masakali s){

		id =  s.id;
		name = s.name;
		salary = s.salary;
		phnno = s.phnno;
		
	}
	void displayInformation() {
		
		
		System.out.println(id+" "+name+" "+salary+" "+phnno);
	}
	
	
}

public class ParameterizedConstructor1 {

	public static void main(String[] args) {
	masakali m = new masakali(111,"intel",12121);
	masakali m1 = new masakali(m);
	
	m.displayInformation();
	m1.displayInformation();

	}

}
