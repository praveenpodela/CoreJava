package coreJava;

class employe1{
	
	int id ;
	String name ;
	float value;
	 void insert(int i,String n,float v) {
		id =i;
		name = n;
		value = v;
				
	}
	void display()
	{
		System.out.println("employe details:"+ id+"  "+name+" "+value);
	}
}

public class Employe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employe1 obj = new employe1();
		obj.insert(12, "praveen",  123);
		obj.display();

	}

}


