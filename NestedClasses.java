package TheameBased;

class Rbi{
	Locker key = new Locker();
	
	void bankBalance() {
		System.out.println("bank balavce is  5 lack");
		key.access();
	}
	class Locker{
		 void access() {
			 System.out.println("bank employes only have access to open the locker");
			 
		 }	
	}
}

public class NestedClasses {

	public static void main(String[] args) {
	Rbi obj = new Rbi();
	obj.bankBalance();

	}

}
