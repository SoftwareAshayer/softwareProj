package org.example;

import java.util.Objects;

public class SakanDetails {

	boolean SakanWater;
	int rentMonthly;
	boolean SakanElectricity;
	String Location;
int NumberOfFloor;
boolean furnitureSaled;

	public void setHasBalcony(boolean hasBalcony) {
		this.hasBalcony = hasBalcony;
	}

	public void setNumberOfBathrooms(int numberOfBathrooms) {
		NumberOfBathrooms = numberOfBathrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		NumberOfBedrooms = numberOfBedrooms;
	}

	public boolean isHasBalcony() {
		return hasBalcony;
	}

	public boolean hasBalcony;

	public int getNumberOfBathrooms() {
		return NumberOfBathrooms;
	}

	int NumberOfBathrooms;

	public int getNumberOfBedrooms() {
		return NumberOfBedrooms;
	}

	int NumberOfBedrooms;



	public boolean isFurnitureSaled() {
	return furnitureSaled;
}
public void setFurnitureSaled(boolean furnitureSaled) {
	this.furnitureSaled = furnitureSaled;
}
	public int getNumberOfFloor() {
	return NumberOfFloor;
}
public void setNumberOfFloor(int numberOfFloor) {
	NumberOfFloor = numberOfFloor;
}
	public SakanDetails() {
		SakanElectricity = true;
		SakanWater= true;
		rentMonthly=0;
	}
	
	public SakanDetails(SakanDetails other) {
        this.SakanWater = other.SakanWater;
        this.rentMonthly = other.rentMonthly;
        this.SakanElectricity = other.SakanElectricity;
        this.Location = other.Location;
        this.NumberOfFloor = other.NumberOfFloor;
        this.furnitureSaled = other.furnitureSaled;
		this.hasBalcony=other.hasBalcony;
		this.NumberOfBathrooms=other.NumberOfBathrooms;
		this.NumberOfBedrooms=other.NumberOfBedrooms;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean isSakanElectricity() {
		return SakanElectricity;
	}





	public void setSakanElectricity(boolean sakanElectricity) {
		SakanElectricity = sakanElectricity;
	}





	public boolean isSakanWater() {
		return SakanWater;
	}





	public void setSakanWater(boolean sakanWater) {
		SakanWater = sakanWater;
	}

	public int getRentMonthly() {
		return rentMonthly;
	}





	public void setRentMonthly(int rentMonthly) {
		this.rentMonthly = rentMonthly;
	}
	public String getLocation() {
		return Location;
	}





	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		SakanDetails otherSakanDetails = (SakanDetails) obj;

		return SakanWater == otherSakanDetails.SakanWater &&
				rentMonthly == otherSakanDetails.rentMonthly &&
				SakanElectricity == otherSakanDetails.SakanElectricity &&
				Objects.equals(Location, otherSakanDetails.Location) &&
				NumberOfFloor == otherSakanDetails.NumberOfFloor &&
				furnitureSaled == otherSakanDetails.furnitureSaled;
	}

	@Override
	public String toString() {
	    return "SakanDetails\n" +
	            "SakanWater=" + SakanWater +
	            ", rentMonthly=" + rentMonthly +
	            ", SakanElectricity=" + SakanElectricity +
	            ", Location='" + Location +
	            ", NumberOfFloor=" + NumberOfFloor +
	            ", furnitureSaled=" + furnitureSaled;
	}

}
