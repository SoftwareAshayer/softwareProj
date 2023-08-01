package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sakan {

	public List<String> getPhotos() {
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





	private List <String> photos;



	int maxNoOfTenants;
	public List<Tenant> getTenant() {
		return tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant.add(tenant);
		maxNoOfTenants++;
	}

	private List <Tenant> tenant;
	private Owner owner;
	public SakanDetails getSakanD() {
		return sakanD;
	}





	public void setSakanD(SakanDetails sakanD) {
		this.sakanD = sakanD;
	}





	private SakanDetails sakanD;
	public boolean isAvailabel() {
		return availabel;
	}





	public void setAvailabel() {
		this.availabel= maxNoOfTenants < 4;

	}





	boolean availabel;
	
	
	
	
	
	public Sakan() {
		
		photos=new ArrayList <>();
		availabel= true;
		sakanD=null;
		owner=null;
		maxNoOfTenants=0;
		tenant=new ArrayList<>();
		
	}
	 public Sakan(Sakan otherSakan) {
	        this.photos = new ArrayList<>(otherSakan.photos);
	        this.owner = otherSakan.owner;
	        this.sakanD = new SakanDetails(otherSakan.sakanD);
	        this.availabel = otherSakan.availabel;
			this.maxNoOfTenants= otherSakan.maxNoOfTenants;
			this.tenant=otherSakan.tenant;
	}
	
	
	@Override
	 public String toString() {
	        return "Sakan\n" +
	                "photos=" + photos +
	                ", owner=" + owner +
	                ", sakanD=" + sakanD.toString() +
	                ", available=" + availabel;
	    }




	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		Sakan s2 = (Sakan) obj;

		return availabel == s2.availabel &&
				Objects.equals(photos, s2.photos) &&
				Objects.equals(owner, s2.owner) &&
				Objects.equals(sakanD, s2.sakanD);
	}





}
