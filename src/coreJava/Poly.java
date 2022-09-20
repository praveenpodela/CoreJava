package coreJava;
class milkshake{
	public void badham() {
		
		System.out.println("badham is tasty");
	}

}
class p extends milkshake{
	 public void badham() {
		 
		 System.out.println("pistha is tasty");
		 
	 }
	
}
public class Poly {

	public static void main(String[] args) {
		milkshake obj = new milkshake();
milkshake obj1 = new p();

obj.badham();
obj1.badham();


	}

}
