package testsFolder.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.DataBase;
import org.example.SignInFeature;
import org.example.Users;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SignInTest {
    List<Users> dataBase = DataBase.initializeDB();

    String username, password;

    @Given("that the user is not logged in")
    public void thatTheUserIsNotLoggedIn() {
        // Implement the logic to verify that the user is not logged in
        // For example: Check if the user session is null or expired
    }

    @Given("the username is {string}")
    public void theUsernameIs(String username) {

        this.username = username;
    }

    @Given("the password is {string}")
    public void thePasswordIs(String password) {
        this.password = password;
    }

    @Then("the administrator login succeeds")
    @Test
    public void theAdministratorLoginSucceeds() {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream("fileForUser2.txt")) {
            prop.load(input);
            String username2 = prop.getProperty("admin.username");
            String password2= prop.getProperty("admin.password");
            assertTrue(SignInFeature.signIn(dataBase, username2, password2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        @Then("the administrator will not login")
    @Test
    public void theAdministratorWillNotLogin() {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream("fileForUser.txt")) {
            prop.load(input);
            String username3 = prop.getProperty("admin.username");
            String password3 = prop.getProperty("admin.password");
            assertFalse(SignInFeature.signIn(dataBase, username3, password3));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}