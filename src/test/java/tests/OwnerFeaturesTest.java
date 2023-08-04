import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class OwnerFeaturesTest {

    String username = "Ali";

    @Given("that the user is owner")
    public void thatTheUserIsOwner() {
assertNotNull(DataBase.getOwner(username));
assertNull(DataBase.getOwner("anyString"));
    }
    @Test
    @Then("the Owner can add photos to the Sakan")
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
    @Test
    @Then("the Owner can change his email")
    public void theOwnerCanChangeHisEmail() {
        OwnerFeatures.ownerFeatureTwo(owner2, "anyEmailThatOwnerNeed", "", "");
        assertNotEquals(empty, owner.getEmailForContact());
    }
    @Test
    @Then("the Owner can change his location")
    public void theOwnerCanChangeHisLocation() {
        OwnerFeatures.ownerFeatureTwo(owner, "", "", "anyLocationThatOwnerNeed");
        assertNotEquals(empty, owner.getLocation());


    }
    @Test
    @Then("the Owner can change his phoneNo")
    public void theOwnerCanChangeHisPhoneNo() {
        OwnerFeatures.ownerFeatureTwo(owner, "", "anyPhoneNumberThatOwnerNeed", "");
        assertNotEquals(empty, owner.getPhoneNumber());
    }

/////////////feature Three
@Test
    @Then("the Owner can change his Sakan electricity and Water services")
    public void theOwnerCanChangeHisSakanElectricityAndWaterServices() {
        for (Users user : dataBase) {
            if (user.getName().equals(username)) {
                Owner owner3 = (Owner) user;
                assertTrue(OwnerFeatures.ownerFeatureThree(owner3, owner3.getSakan(), true, true));


            }


        }

    }
    @Test
    @Then("the Owner can see the rent monthly for this Sakan")
    public void theOwnerCanSeeTheRentMonthlyForThisSakan() {
        // Write code here that turns the phrase above into concrete actions
        for (Users user : dataBase) {
            if (user.getName().equals(username)) {
                Owner owner3 = (Owner) user;
                assertNotEquals(0, owner3.getSakan().getSakanD().getRentMonthly());


            }


        }


    }
    @Test
    @Then("the Owner can see his email")
    public void theOwnerCanSeeHisEmail() {
        for (Users user : dataBase) {
            if (user.getName().equals(username)) {
                Owner owner3 = (Owner) user;
                assertNotEquals("", OwnerFeatures.ownerFeatureFiveForEmail(owner3));

            }

        }
    }
    @Test
    @Then("the Owner can see his location")
    public void theOwnerCanSeeHisLocation() {

        for (Users user : dataBase) {
            if (user.getName().equals(username)) {
                Owner owner3 = (Owner) user;
                assertNotEquals("", OwnerFeatures.ownerFeatureFiveForLocation(owner3));

            }

        }
    }

    @Test
    @Then("the Owner can see his phoneNo")
    public void theOwnerCanSeeHisPhoneNo() {
        for (Users user : dataBase) {
            if (user.getName().equals(username)) {
                Owner owner3 = (Owner) user;
                assertNotEquals("", OwnerFeatures.ownerFeatureFiveForPhoneNumber(owner3));

            }

        }
    }
@Test
    @Then("the Owner can see the Dashboard")
    public void theOwnerCanSeeTheDashboard() {
        for (Users user : dataBase) {
            if (user.getName().equals(username)) {
                Owner owner3 = (Owner) user;
                assertTrue(OwnerFeatures.ownerFeatureSix(owner3.getSakan()));
                assertNotEquals("",owner3.toString());
            }


        }


    }
}