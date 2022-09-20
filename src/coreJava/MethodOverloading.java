package coreJava;

import java.util.Scanner;

class addition{
	
	void add(int x,int y){
		System.out.println("intiger sum is="+(x+y));
	}
	void add(float x,float y) {
		System.out.println("decimal sum is="+(x+y));
	}
	
	
}

public class MethodOverloading {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 addition obj = new addition();
 System.out.println("enter two values");
 
 obj.add(sc.nextInt(), sc.nextInt());
 
System.out.println("enter decimal values");
	obj.add(sc.nextFloat(), sc.nextFloat());
	}

}
