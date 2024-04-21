class Vehicle { 
	int maxSpeed = 120; 
} 
class Car extends Vehicle { 
	int maxSpeed = 180; 

	void display() 
	{ 
		System.out.println("Maximum Speed: " + super.maxSpeed); 
	} 
} 

public class Lab6_6 { 
	public static void main(String[] args) 
	{ 
		Car Audi = new Car(); 
		Audi.display(); 
	} 
}