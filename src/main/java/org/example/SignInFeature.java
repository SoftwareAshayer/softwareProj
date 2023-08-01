package org.example;
import java.util.List;

public class SignInFeature {


    public static boolean signIn(List<Users> DB, String un, String pass) {
        for (Users user : DB) {
            if (user.getName().equals(un) && user.getPass().equals(pass)) {//this code for searching for the user I entered
                return true;
            }


        }
        return false;

    }
}