package org.example;

import java.util.Objects;

public class Tenant extends Users{
    public String getTimeForRent() {
		return timeForRent;
	}

	public void setTimeForRent(String timeForRent) {
		this.timeForRent = timeForRent;
	}
	String timeForRent;
     public Sakan getS() {
		return s;
	}

	public void setS(Sakan s) {
		this.s = s;
	}
private boolean isAStudent;
	public boolean heIsAStudent() {
	return isAStudent;
}

public void setAStudent(boolean isAStudent) {
	this.isAStudent = isAStudent;
}
private 	Sakan s;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	int age;
	public String getUniversityMajor() {
		return universityMajor;
	}

	public void setUniversityMajor(String universityMajor) {
		this.universityMajor = universityMajor;
	}
	String universityMajor;
	public Tenant() {
		setName("");
		s=null;
		isAStudent=false;
		age=0;
		universityMajor=null;
	}
	
	public Tenant(String name,String password) {
        super(name,password);
    }
	public Tenant(String name,
				  String pass,
				  String timeForRent,
				  boolean isAStudent,
				  Sakan s,
				  int age,
				  String universityMajor) {
        super(name,pass);
        // Copy other attributes from the otherTenant object
        this.timeForRent = timeForRent;
        this.isAStudent =isAStudent;
        this.s = s;
        this.age = age;
        this.universityMajor = universityMajor;
    }
	 @Override
	    public String toString() {
	        return "Tenant\n" +
	                "name='" + getName() + '\'' +
	                ", TimeForRent='" + timeForRent + '\'' +
	                ", isAStudent=" + isAStudent +
	                ", s=" + s +
	                ", Age=" + age +
	                ", UniversityMajor='" + universityMajor + '\'';
	    }
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		Tenant t2 = (Tenant) obj;

		return Objects.equals(timeForRent, t2.timeForRent) &&
				isAStudent == t2.isAStudent &&
				Objects.equals(s, t2.s) &&
				age == t2.age &&
				Objects.equals(universityMajor, t2.universityMajor);
	}








}
