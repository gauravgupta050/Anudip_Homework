class Vehicle {
 public void start() {
     System.out.println("Vehicle is starting...");
 }

 public void stop() {
     System.out.println("Vehicle is stopping...");
 }
}

class Car extends Vehicle {
 @Override
 public void start() {
     System.out.println("Car is starting with ignition...");
 }

 @Override
 public void stop() {
     System.out.println("Car is stopping with brakes...");
 }
}

class Bike extends Vehicle {
 @Override
 public void start() {
     System.out.println("Bike is starting with kick or button...");
 }

 @Override
 public void stop() {
     System.out.println("Bike is stopping with hand brakes...");
 }
}

public class Main {
	 public static void main(String[] args) {
	        Vehicle myCar = new Car();
	        System.out.println("Car actions:");
	        myCar.start();
	        myCar.stop();   

	        Vehicle myBike = new Bike();
	        System.out.println("\nBike actions:");
	        myBike.start();  
	        myBike.stop();
	
	 }
}
