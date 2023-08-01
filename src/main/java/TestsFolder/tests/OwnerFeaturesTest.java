package TestsFolder.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.*;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OwnerFeaturesTest {

    String username = "Ali";

    @Given("that the user is owner")
    public void that_the_user_is_owner() {
assertNotNull(DataBase.getOwner(username));
assertNull(DataBase.getOwner("anyString"));
    }

    @Then("the Owner can add photos to the Sakan")
    @Test
    public void the_owner_can_add_photos_to_the_sakan() {
        int size_Before = 0;
        // Write code here that turns the phrase above into concrete actions
        List<Sakan> D;
        D = DataBase.initializeSakan();
        for (Sakan s : D) {
            if (s.owner.name.equals(username)) {
                size_Before = s.photos.size();

            }

        }
        OwnerFeatures.ownerFeatureOne(D, "AnyString", username);
        for (Sakan s : D) {
            if (s.owner.name.equals(username)) {
                assertNotEquals(size_Before, s.photos.size());

            }

        }
    }

//////////////feature Two

    List<Users> DB = DataBase.initializeDB();
    Owner owner = (Owner) DB.get(1);
    Owner owner2 = new Owner(owner.getName(), owner.getPass(), owner.getPhoneNumber(), owner.getLocation(), owner.getEmailForContact());


    String empty = "";

    @Then("the Owner can change his email")
    @Test
    public void the_owner_can_change_his_email() {
        OwnerFeatures.ownerFeatureTwo(owner2, "anyEmailThatOwnerNeed", "", "");
        assertNotEquals(empty, owner.getEmailForContact());
    }

    @Then("the Owner can change his location")
    @Test
    public void the_owner_can_change_his_location() {
        OwnerFeatures.ownerFeatureTwo(owner, "", "", "anyLocationThatOwnerNeed");
        assertNotEquals(empty, owner.getLocation());


    }

    @Then("the Owner can change his phoneNo")
    @Test
    public void the_owner_can_change_his_phone_no() {
        OwnerFeatures.ownerFeatureTwo(owner, "", "anyPhoneNumberThatOwnerNeed", "");
        assertNotEquals(empty, owner.getPhoneNumber());
    }

/////////////feature Three

    @Then("the Owner can change his Sakan electricity and Water services")
    @Test
    public void the_owner_can_change_his_sakan_electricity_and_water_services() {
        List<Users> DB = DataBase.initializeDB();
        for (Users user : DB) {
            if (user.getName().equals(username)) {
                Owner owner = (Owner) user;
                assertTrue(OwnerFeatures.ownerFeatureThree(owner, owner.getSakan(), true, true));


            }


        }

    }

    @Then("the Owner can see the rent monthly for this Sakan")
    @Test
    public void the_owner_can_see_the_rent_monthly_for_this_sakan() {
        // Write code here that turns the phrase above into concrete actions
        List<Users> DB = DataBase.initializeDB();
        for (Users user : DB) {
            if (user.getName().equals(username)) {
                Owner owner = (Owner) user;
                assertNotEquals(0, owner.getSakan().getSakanD().getRentMonthly());


            }


        }


    }

    @Then("the Owner can see his email")
    @Test
    public void the_owner_can_see_his_email() {
        List<Users> DB = DataBase.initializeDB();
        for (Users user : DB) {
            if (user.getName().equals(username)) {
                Owner owner = (Owner) user;
                assertNotEquals("", OwnerFeatures.ownerFeatureFiveForEmail(owner));

            }

        }
    }

    @Then("the Owner can see his location")
    @Test
    public void the_owner_can_see_his_location() {

        List<Users> DB = DataBase.initializeDB();
        for (Users user : DB) {
            if (user.getName().equals(username)) {
                Owner owner = (Owner) user;
                assertNotEquals("", OwnerFeatures.ownerFeatureFiveForLocation(owner));

            }

        }
    }


    @Then("the Owner can see his phoneNo")
    @Test
    public void the_owner_can_see_his_phone_no() {
        List<Users> DB = DataBase.initializeDB();
        for (Users user : DB) {
            if (user.getName().equals(username)) {
                Owner owner = (Owner) user;
                assertNotEquals("", OwnerFeatures.ownerFeatureFiveForPhoneNumber(owner));

            }

        }
    }

    @Then("the Owner can see the Dashboard")
    public void the_owner_can_see_the_dashboard() {
        List<Users> DB = DataBase.initializeDB();
        for (Users user : DB) {
            if (user.getName().equals(username)) {
                Owner owner = (Owner) user;
                assertTrue(OwnerFeatures.ownerFeatureSix(owner.getSakan()));
                assertNotEquals("",owner.toString());
            }


        }


    }
}