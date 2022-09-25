package PracticeBased;

abstract class Animal{
	abstract void lifeSpan();
	abstract void eat() ;
	void breath()	{
		System.out.println("all animals takes oxygen for respiration");	}
}
class Tiger extends Animal{
	
	void lifeSpan() {
		System.out.println("tiger life span is 8-10 years");
		
	}
	void  eat() {
		System.out.println("tiger eats meat");
	}
		
}
class girafee extends Tiger{
	
	void lifeSpan() {
		System.out.println("girafee life span is 25 years");
		
	}
	void  eat() {
		System.out.println("girafee eats leaves");
	}	

}
public class Abstracton {
	public static void main(String args[]) {
		Animal p;
		p=new Tiger();
		p.breath();
		p.lifeSpan();
		p.eat();
		System.out.println("----------*-------");
		p= new girafee();
		p.breath();
		p.lifeSpan();
		p.eat();

	}

}
