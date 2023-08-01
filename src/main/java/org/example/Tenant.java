package org.example;

import java.util.Objects;

public class Tenant extends Users{
    public String getTimeForRent() {
		return TimeForRent;
	}

	public void setTimeForRent(String timeForRent) {
		TimeForRent = timeForRent;
	}
	String TimeForRent;
     public Sakan getS() {
		return s;
	}

	public void setS(Sakan s) {
		this.s = s;
	}
public boolean isAStudent;
	public boolean heIsAStudent() {
	return isAStudent;
}

public void setAStudent(boolean isAStudent) {
	this.isAStudent = isAStudent;
}
public	Sakan s;
	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	int Age;
	public String getUniversityMajor() {
		return UniversityMajor;
	}

	public void setUniversityMajor(String universityMajor) {
		UniversityMajor = universityMajor;
	}
	String UniversityMajor;
	public Tenant() {
		name="";
		s=null;
		isAStudent=false;
		Age=0;
		UniversityMajor=null;
	}
	
	public Tenant(String name,String password) {
        super(name,password);
    }
	public Tenant(String name,
				  String pass,
				  String TimeForRent,
				  boolean isAStudent,
				  Sakan s,
				  int age,
				  String UniversityMajor) {
        super(name,pass);
        // Copy other attributes from the otherTenant object
        this.TimeForRent = TimeForRent;
        this.isAStudent =isAStudent;
        this.s = s;
        this.Age = age;
        this.UniversityMajor = UniversityMajor;
    }
	 @Override
	    public String toString() {
	        return "Tenant\n" +
	                "name='" + name + '\'' +
	                ", TimeForRent='" + TimeForRent + '\'' +
	                ", isAStudent=" + isAStudent +
	                ", s=" + s +
	                ", Age=" + Age +
	                ", UniversityMajor='" + UniversityMajor + '\'';
	    }
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		Tenant T2 = (Tenant) obj;

		return Objects.equals(TimeForRent, T2.TimeForRent) &&
				isAStudent == T2.isAStudent &&
				Objects.equals(s, T2.s) &&
				Age == T2.Age &&
				Objects.equals(UniversityMajor, T2.UniversityMajor);
	}








}
