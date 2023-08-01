package org.example;

import java.util.Objects;

public class Owner extends Users {
    String phoneNumber;
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmailForContact() {
		return emailForContact;
	}
	public void setEmailForContact(String emailForContact) {
		this.emailForContact = emailForContact;
	}
	String location;
	String emailForContact;

	public Sakan getSakan() {
		return sakan;
	}

	public void setSakan(Sakan sakan) {
		this.sakan = sakan;
	}

	Sakan sakan;

	public Owner() {
		setName("");
		phoneNumber="";
		location="";
		emailForContact="";
		sakan=null;
		
	}
	public Owner(String name,String pass,String phoneNumber,String location,String emailForContact) {
        super(name,pass);
        // Copy other attributes from the otherOwner object
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.emailForContact = emailForContact;

    }
	public Owner(String name,String password) {
        super(name,password);
    }
	@Override
	public String toString() {
        return "Owner\n" +
                "name='" + getName() + '\'' +
                ", PhoneNumber='" + phoneNumber + '\'' +
                ", Location='" + location + '\'' +
                ", EmailForContact='" + emailForContact + '\'';
    }
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		Owner o2 = (Owner) obj;

		return Objects.equals(phoneNumber, o2.phoneNumber) &&
				Objects.equals(location, o2.location) &&
				Objects.equals(emailForContact, o2.emailForContact);
	}



}
