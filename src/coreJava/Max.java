package coreJava;

class birds{
	
	void kiww()
	{
		System.out.println("eating");
	}
}
class parrot extends birds{
	void kiww() {
		System.out.println("hello");
	}
}
class pekacok extends parrot{

	void kiww() {
		super.kiww();
		System.out.println("hiii");
	}
}

public class Max {

	public static void main(String[] args) {
	
		pekacok obj = new pekacok();
        obj.kiww();
	}

}
