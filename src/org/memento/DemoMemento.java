package org.memento;

public class DemoMemento {
	  public static void main(String[] atgs) {
		  Car car = new Car(50, 50);
	        System.out.println("Initial car description:");
	        System.out.println(car.getDescription() + "\n");

	        Object memento = car.getMemento();

	        car.setSpeed(25);
	        car.setPower(25);
	        System.out.println("New tank description:");
	        System.out.println(car.getDescription() + "\n");

	        car.setMemento(memento);

	        System.out.println("Restored tank description:");
	        System.out.println(car.getDescription());
	    }
		

}
