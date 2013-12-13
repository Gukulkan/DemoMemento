package org.memento;

public class Car {

	    private int speed;
	    private int power;

	    public Car(int speed, int power) {
	        this.speed = speed;
	        this.power = power;
	    }

	    private class CarMemento {
	        private int speedState;
	        private int powerState;

	        private CarMemento(int speedState, int powerState) {
	            this.speedState = speedState;
	            this.powerState = powerState;
	        }
	    }

	    public Object getMemento() {
	        return new CarMemento(speed, power);
	    }

	    public void setMemento(Object object) {
	        if (object instanceof CarMemento) {
	        	CarMemento memento = (CarMemento) object;

	            speed = memento.speedState;
	            power = memento.powerState;
	        }
	    }

	    public int getSpeed() {
	        return speed;
	    }

	    public void setSpeed(int speed) {
	        this.speed = speed;
	    }

	    public int getPower() {
	        return power;
	    }

	    public void setPower(int power) {
	        this.power = power;
	    }

	    public String getDescription() {
	        return "Speed is " + speed + " km/h, power is " + power;
	    }
	
}
