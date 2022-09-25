package ConceptBased;

class consultancy{
	
	static class invictus{
		void mist() {
			System.out.println("mist students are offerd by incictus engineers");
		}
		static void interviews() {
			
			System.out.println(" there are two interviews are conducted by invictus engineers ");
		}
	}
	
	
	
}


public class NestedClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consultancy.invictus.interviews();
		consultancy.invictus java = new consultancy.invictus();
		java.mist();
	}

}
