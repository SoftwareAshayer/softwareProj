package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Sakan {

	public ArrayList<String> getPhotos() {
		return photos;
	}





	public void setPhotos(String photo) {
	    this.photos.add(photo);
	}















	public Owner getOwner() {
		return owner;
	}





	public void setOwner(Owner owner) {
		this.owner = owner;
	}





	public ArrayList <String> photos;



	int maxNoOfTenants;
	public ArrayList<Tenant> getTenant() {
		return tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant.add(tenant);
		maxNoOfTenants++;
	}

	public ArrayList <Tenant> tenant;
	public Owner owner;
	public SakanDetails getSakanD() {
		return sakanD;
	}





	public void setSakanD(SakanDetails sakanD) {
		this.sakanD = sakanD;
	}





	public SakanDetails sakanD;
	public boolean isAvailabel() {
		return Availabel;
	}





	public void setAvailabel() {
		this.Availabel= maxNoOfTenants < 4;

	}





	boolean Availabel;
	
	
	
	
	
	public Sakan() {
		
		photos=new ArrayList <>();
		Availabel= true;
		sakanD=null;
		owner=null;
		maxNoOfTenants=0;
		tenant=new ArrayList<>();
		
	}
	 public Sakan(Sakan otherSakan) {
	        this.photos = new ArrayList<>(otherSakan.photos);
	        this.owner = otherSakan.owner;
	        this.sakanD = new SakanDetails(otherSakan.sakanD);
	        this.Availabel = otherSakan.Availabel;
			this.maxNoOfTenants= otherSakan.maxNoOfTenants;
			this.tenant=otherSakan.tenant;
	}
	
	
	@Override
	 public String toString() {
	        return "Sakan\n" +
	                "photos=" + photos +
	                ", owner=" + owner +
	                ", sakanD=" + sakanD.toString() +
	                ", available=" + Availabel;
	    }




	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		Sakan s2 = (Sakan) obj;

		return Availabel == s2.Availabel &&
				Objects.equals(photos, s2.photos) &&
				Objects.equals(owner, s2.owner) &&
				Objects.equals(sakanD, s2.sakanD);
	}





}
