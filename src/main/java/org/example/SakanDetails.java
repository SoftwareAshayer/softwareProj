package org.example;

import java.util.Objects;

public class SakanDetails {

	boolean sakanWater;
	int rentMonthly;
	boolean sakanElectricity;
	String location;
int numberOfFloor;
boolean furnitureSaled;

	public void setHasBalcony(boolean hasBalcony) {
		this.hasBalcony = hasBalcony;
	}

	public void setNumberOfBathrooms(int numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public boolean isHasBalcony() {
		return hasBalcony;
	}

	private boolean hasBalcony;

	public int getNumberOfBathrooms() {
		return numberOfBathrooms;
	}

	int numberOfBathrooms;

	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	int numberOfBedrooms;



	public boolean isFurnitureSaled() {
	return furnitureSaled;
}
public void setFurnitureSaled(boolean furnitureSaled) {
	this.furnitureSaled = furnitureSaled;
}
	public int getNumberOfFloor() {
	return numberOfFloor;
}
public void setNumberOfFloor(int numberOfFloor) {

		this.numberOfFloor = numberOfFloor;
}
	public SakanDetails() {
		sakanElectricity = true;
		sakanWater= true;
		rentMonthly=0;
	}
	
	public SakanDetails(SakanDetails other) {
        this.sakanWater = other.sakanWater;
        this.rentMonthly = other.rentMonthly;
        this.sakanElectricity = other.sakanElectricity;
        this.location = other.location;
        this.numberOfFloor = other.numberOfFloor;
        this.furnitureSaled = other.furnitureSaled;
		this.hasBalcony=other.hasBalcony;
		this.numberOfBathrooms=other.numberOfBathrooms;
		this.numberOfBedrooms=other.numberOfBedrooms;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean isSakanElectricity() {
		return sakanElectricity;
	}





	public void setSakanElectricity(boolean sakanElectricity) {

		this.sakanElectricity = sakanElectricity;
	}





	public boolean isSakanWater() {
		return sakanWater;
	}





	public void setSakanWater(boolean sakanWater) {

		this.sakanWater = sakanWater;
	}

	public int getRentMonthly() {
		return rentMonthly;
	}





	public void setRentMonthly(int rentMonthly) {
		this.rentMonthly = rentMonthly;
	}
	public String getLocation() {
		return location;
	}





	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		SakanDetails otherSakanDetails = (SakanDetails) obj;

		return sakanWater == otherSakanDetails.sakanWater &&
				rentMonthly == otherSakanDetails.rentMonthly &&
				sakanElectricity == otherSakanDetails.sakanElectricity &&
				Objects.equals(location, otherSakanDetails.location) &&
				numberOfFloor == otherSakanDetails.numberOfFloor &&
				furnitureSaled == otherSakanDetails.furnitureSaled;
	}

	@Override
	public String toString() {
	    return "SakanDetails\n" +
	            "SakanWater=" + sakanWater +
	            ", rentMonthly=" + rentMonthly +
	            ", SakanElectricity=" + sakanElectricity +
	            ", Location='" + location +
	            ", NumberOfFloor=" + numberOfFloor +
	            ", furnitureSaled=" + furnitureSaled;
	}

}
