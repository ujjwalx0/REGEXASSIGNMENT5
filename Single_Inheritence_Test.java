

/*Assignment 1: On Single Inheritance:
Take an object Car and define the following methods in it.
1. move()
2. brake()
Take another object Audi and reuse the Car basic function and define the following new functions.
1. autoPilot()
2. autoGear()
Take another class as Test then take main() and test it.
*/
package Assignments_Regex;
class Car {
	void move (){System.out.println("Moving...");}
	void brake () {System.out.println("Brake Applied...");}
}		
	
class Audi extends Car {
	void Auto_Pilot() { System.out.println("Auto Pilot Mode On..");}
	void Auto_Gear() {System.out.println("Auto Gear mode on..");}
}
		
    public class Single_Inheritence_Test {

	public static void main(String[] args) {
		
	Car c= new Car();
	c.move();
	c.brake();
	Audi a= new Audi();
	a.move();
	a.brake();
	a.Auto_Pilot();
	a.Auto_Gear();
		

	}

}


	

	


