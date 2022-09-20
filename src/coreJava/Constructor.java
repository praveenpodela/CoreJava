package coreJava;

class Praveen122{
	int id;
double salary;
String name;
    Praveen122(int id,double salary,String name){
    	this.id=id;
    	this.salary=salary;
    	this.name=name;
    
    }
    void display() {
    	System.out.println("id is "+id+" salary is "+salary+"name is "+name);
    }
	
}

public class Constructor {

	public static void main(String[] args) {
		Praveen122 obj = new Praveen122(1245,2500,"nivi");
		obj.display();
	
		


	}

}
