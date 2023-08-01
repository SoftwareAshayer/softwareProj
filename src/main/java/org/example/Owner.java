package org.example;

import java.util.Objects;

public class Owner extends Users {
    String PhoneNumber;
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getEmailForContact() {
		return EmailForContact;
	}
	public void setEmailForContact(String emailForContact) {
		EmailForContact = emailForContact;
	}
	String Location;
	String EmailForContact;

	public Sakan getSakan() {
		return sakan;
	}

	public void setSakan(Sakan sakan) {
		this.sakan = sakan;
	}

	Sakan sakan;

	public Owner() {
		name="";
		PhoneNumber="";
		Location="";
		EmailForContact="";
		sakan=null;
		
	}
	public Owner(String name,String pass,String PhoneNumber,String Location,String EmailForContact) {
        super(name,pass);
        // Copy other attributes from the otherOwner object
        this.PhoneNumber = PhoneNumber;
        this.Location = Location;
        this.EmailForContact = EmailForContact;

    }
	public Owner(String name,String password) {
        super(name,password);
    }
	@Override
	public String toString() {
        return "Owner\n" +
                "name='" + name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Location='" + Location + '\'' +
                ", EmailForContact='" + EmailForContact + '\'';
    }
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		Owner o2 = (Owner) obj;

		return Objects.equals(PhoneNumber, o2.PhoneNumber) &&
				Objects.equals(Location, o2.Location) &&
				Objects.equals(EmailForContact, o2.EmailForContact);
	}



}
