package testsFolder;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.*;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OwnerFeaturesTest {

    String username = "Ali";

    @Given("that the user is owner")
    public void thatTheUserIsOwner() {
assertNotNull(DataBase.getOwner(username));
assertNull(DataBase.getOwner("anyString"));
    }

    @Then("the Owner can add photos to the Sakan")
    @Test
    public void theOwnerCanAddPhotosToTheSakan() {
        int sizeBefore = 0;
        // Write code here that turns the phrase above into concrete actions
        List<Sakan> sakan;
        sakan = DataBase.initializeSakan();
        for (Sakan s : sakan) {
            if (s.getOwner().getName().equals(username)) {
                sizeBefore = s.getPhotos().size();

            }

        }
        OwnerFeatures.ownerFeatureOne(sakan, "AnyString", username);
        for (Sakan s : sakan) {
            if (s.getOwner().getName().equals(username)) {
                assertNotEquals(sizeBefore, s.getPhotos().size());

            }

        }
    }

//////////////feature Two

    List<Users> dataBase = DataBase.initializeDB();
    Owner owner = (Owner) dataBase.get(1);
    Owner owner2 = new Owner(owner.getName(), owner.getPass(), owner.getPhoneNumber(), owner.getLocation(), owner.getEmailForContact());


    String empty = "";

    @Then("the Owner can change his email")
    @Test
    public void theOwnerCanChangeHisEmail() {
        OwnerFeatures.ownerFeatureTwo(owner2, "anyEmailThatOwnerNeed", "", "");
        assertNotEquals(empty, owner.getEmailForContact());
    }

    @Then("the Owner can change his location")
    @Test
    public void theOwnerCanChangeHisLocation() {
        OwnerFeatures.ownerFeatureTwo(owner, "", "", "anyLocationThatOwnerNeed");
        assertNotEquals(empty, owner.getLocation());


    }

    @Then("the Owner can change his phoneNo")
    @Test
    public void theOwnerCanChangeHisPhoneNo() {
        OwnerFeatures.ownerFeatureTwo(owner, "", "anyPhoneNumberThatOwnerNeed", "");
        assertNotEquals(empty, owner.getPhoneNumber());
    }

/////////////feature Three

    @Then("the Owner can change his Sakan electricity and Water services")
    @Test
    public void theOwnerCanChangeHisSakanElectricityAndWaterServices() {
        List<Users> dataBase = DataBase.initializeDB();
        for (Users user : dataBase) {
            if (user.getName().equals(username)) {
                Owner owner3 = (Owner) user;
                assertTrue(OwnerFeatures.ownerFeatureThree(owner3, owner3.getSakan(), true, true));


            }


        }

    }

    @Then("the Owner can see the rent monthly for this Sakan")
    @Test
    public void theOwnerCanSeeTheRentMonthlyForThisSakan() {
        // Write code here that turns the phrase above into concrete actions
        for (Users user : dataBase) {
            if (user.getName().equals(username)) {
                Owner owner3 = (Owner) user;
                assertNotEquals(0, owner3.getSakan().getSakanD().getRentMonthly());


            }


        }


    }

    @Then("the Owner can see his email")
    @Test
    public void theOwnerCanSeeHisEmail() {
        List<Users> dataBase = DataBase.initializeDB();
        for (Users user : dataBase) {
            if (user.getName().equals(username)) {
                Owner owner3 = (Owner) user;
                assertNotEquals("", OwnerFeatures.ownerFeatureFiveForEmail(owner3));

            }

        }
    }

    @Then("the Owner can see his location")
    @Test
    public void theOwnerCanSeeHisLocation() {

        List<Users> dataBase = DataBase.initializeDB();
        for (Users user : dataBase) {
            if (user.getName().equals(username)) {
                Owner owner3 = (Owner) user;
                assertNotEquals("", OwnerFeatures.ownerFeatureFiveForLocation(owner3));

            }

        }
    }


    @Then("the Owner can see his phoneNo")
    @Test
    public void theOwnerCanSeeHisPhoneNo() {
        List<Users> dataBase = DataBase.initializeDB();
        for (Users user : dataBase) {
            if (user.getName().equals(username)) {
                Owner owner3 = (Owner) user;
                assertNotEquals("", OwnerFeatures.ownerFeatureFiveForPhoneNumber(owner3));

            }

        }
    }

    @Then("the Owner can see the Dashboard")
    public void theOwnerCanSeeTheDashboard() {
        List<Users> dataBase = DataBase.initializeDB();
        for (Users user : dataBase) {
            if (user.getName().equals(username)) {
                Owner owner3 = (Owner) user;
                assertTrue(OwnerFeatures.ownerFeatureSix(owner3.getSakan()));
                assertNotEquals("",owner3.toString());
            }


        }


    }
}