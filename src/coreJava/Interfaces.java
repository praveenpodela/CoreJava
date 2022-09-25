package PracticeBased;
interface colleges{
	void fee();
	void semesters();
}
abstract class btech implements colleges{
	void duration() {
		System.out.println(" b tech duration is 4 years");
	}
	
}
abstract class degree  implements colleges{
	void timePeriod() {
		System.out.println(" b tech time period is 3 years ");
	}
	
}
class mist extends btech{
	public void fee(){
		System.out.println("mist college fee is 40,000 oer annum");
	}
	public void semesters () {
		System.out.println(" 8 semesters we have in b tech");
	}
}
class  sist extends btech{
	public void fee(){
		System.out.println("degree fee is 20 k per annum");
	}
	public void semesters () {
		System.out.println("8 semesters we have in degree");
	}
}

class  kakathiya extends degree {
	public void fee(){
		System.out.println(" 30 k per annum");
	}
	public void semesters () {
		System.out.println("6 sems");
	}
}
class  jvr extends degree {
	public void fee(){
		System.out.println("15 k per annum ");
	}
	public void semesters () {
		System.out.println(" 6 sems we have in degree ");
	}
}

public class Interfaces {

	public static void main(String[] args) {
	
	degree obj;
	obj= new kakathiya();
	obj.fee();
	obj.semesters();
obj.timePeriod();
	obj=new jvr();
	obj.fee();
	obj.semesters();
	
	btech obj2;
	obj2= new mist();
	obj2.fee();
	obj2.semesters();
	obj2=new sist();
	obj2.fee();
	obj2.semesters();
	obj2.duration();
	
	

	}
 
}
