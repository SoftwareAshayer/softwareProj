package org.example;

public class Users {
    public void setName(String name) {
        this.name = name;
    }



    private String name;
    private final String password;
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
