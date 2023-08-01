package TestsFolder.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.DataBase;
import org.example.SignInFeature;
import org.example.Users;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SignInTest {
    List<Users> DB= DataBase.initializeDB();

    String username,password;

    @Given("that the user is not logged in")
    public void thatTheUserIsNotLoggedIn() {
        // Implement the logic to verify that the user is not logged in
        // For example: Check if the user session is null or expired
    }

    @Given("the username is {string}")
    public void theUsernameIs(String username) {

        this.username=username;
    }

    @Given("the password is {string}")
    public void thePasswordIs(String password)
    {
        this.password=password;
    }

    @Then("the administrator login succeeds")
    @Test
    public void theAdministratorLoginSucceeds() {
        this.username="Ahmad";
        this.password="1234";

        assertTrue(SignInFeature.signIn(DB,username,password));
    }





    @Then("the administrator will not login")
    @Test
    public void theAdministratorWillNotLogin() {
        this.username="Ahmad";
        this.password="4321";
        // Write code here that turns the phrase above into concrete
        assertFalse(SignInFeature. signIn(DB,username,password));

    }
}










