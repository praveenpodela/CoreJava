package ConceptBased;

interface Parent {
	
	int age =45;

interface Child extends Parent{
	int age =21;
}}
class details implements Parent{
	void show() {
		System.out.println("parent age is"+Parent.age);
		System.out.println("child  age is "+Child.age);
	}
	
	
}
public class InterfaceVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		details obj = new details();
		
		obj.show();
	}

}
