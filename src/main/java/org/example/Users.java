package org.example;

public class Users {
   public String name;
    public String password;
	public Users() {
		name="";
		password="";
	}
	public Users(String name,String password) {
        this.name = name;
        this.password=password;
        }
	public String getName() {
        return name;
    }
	public String getPass() {
        return password;
    }
}
