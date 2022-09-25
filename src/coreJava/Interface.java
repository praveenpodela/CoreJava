package ConceptBased;


interface motors{
	
	void milage();
	void cost();
	
}
abstract class car1 implements motors{
	void viper() {
		System.out.println("cars have viper");
	}
	
}
abstract class bike1  implements motors{
	void stand() {
		System.out.println("bikes have stand");
	}
	
}
class breeza extends car1{
	public void milage(){
		System.out.println("milage is 32 km");
	}
	public void cost () {
		System.out.println(" breeza 16 lack");
	}
}
class  shift extends car1{
	public void milage(){
		System.out.println("shift milage is 15 km");
	}
	public void cost () {
		System.out.println("cost is 18 lack");
	}
}

class  Fz extends bike1 {
	public void milage(){
		System.out.println("fz milage is 30 km");
	}
	public void cost () {
		System.out.println("cost is 1 lack");
	}
}
class  ktm extends bike1 {
	public void milage(){
		System.out.println(" ktm milage is 25 km");
	}
	public void cost () {
		System.out.println("cost ios 1.5 lack");
	}
}

public class Interface {

	public static void main(String[] args) {
	
	bike1 obj;
	obj= new Fz();
	obj.milage();
	obj.cost();
	obj=new ktm();
	obj.cost();
	obj.milage();
	
	
	car1 obj2;
	obj2= new breeza();
	obj2.cost();
	obj2.milage();
	obj2=new shift();
	obj2.cost();
	obj2.milage();
	
	

	}
 
}
