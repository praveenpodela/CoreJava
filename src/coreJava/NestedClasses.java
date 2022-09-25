package PracticeBased;

class Jntuh{
	Department civil = new Department();
	void announcement(){
		System.out.println("exams will be conducted on oct 23rd");
		civil.prepare();
	}
	class Department{
		
		void prepare() {
			System.out.println("papers should be prepared in 12 days");
		}
		
	}
}

public class NestedClasses {

	public static void main(String[] args) {
		Jntuh obj = new Jntuh();
		obj.announcement();

	}

}
