package org.example;
import java.util.List;

public class SignInFeature {
private SignInFeature()
{
    //private constructor
}

    public static boolean signIn(List<Users> dataBase, String un, String pass) {
        for (Users user : dataBase) {
            if (user.getName().equals(un) && user.getPass().equals(pass)) {//this code for searching for the user I entered
                return true;
            }


        }
        return false;

    }
}