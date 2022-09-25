package ConceptBased;

abstract  class Bike{
	
	abstract void speed();
	abstract void model();
	
}
class Pulsar extends Bike{
	void speed() {
		System.out.println("pulsar reaches the speed is 50 km per second");
	}
	void model() {
		System.out.println("2022 model ");
		
	}
	
}
class Duke extends Pulsar{
	void speed() {
		System.out.println("Duke reaches the speed is 60 km per second");
	}
	void model() {
		System.out.println("2020 model ");
		
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		Bike obj;
		obj = new Pulsar();
		obj.speed();
		obj.model();
		obj = new Duke();
		obj.speed();
		obj.model();

	}

}
