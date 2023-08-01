package testsFolder;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AdministratorFeatureTest {


    @Given("that the user is Administrator")
    public void thatTheUserIsAdministrator() {
        /*
         don't need to implement it
         */    }
    @Then("the Administrator can see if there is changes in the system")
    @Test
    public void theAdministratorCanSeeIfThereIsChangesInTheSystem() {
        List <Users> dataBase= DataBase.initializeDB();
        List <Users> dataBase2=DataBase.initializeDB();
        Owner owner=new Owner();
         owner=(Owner) dataBase.get(1);
        owner.setEmailForContact("newemail@example.com");
        dataBase.set(1, owner);

        assertTrue(AdministratorFeature.administratorFeatureOne(dataBase,dataBase2));
List <Sakan> sakan=new ArrayList<>();
List <Sakan> sakan2=new ArrayList<>();
sakan=DataBase.initializeSakan();
sakan2=DataBase.initializeSakan();

        assertFalse(AdministratorFeature.administratorFeatureOneForSakan(sakan,sakan2));
Sakan s1=DataBase.getS1();
        Sakan s2=DataBase.getS2();
        s1.setOwner(new Owner());
        sakan.add(s1);
        sakan2.add(s2);
assertTrue(AdministratorFeature.administratorFeatureOneForSakan(sakan,sakan2));












    }


    @Then("the Administrator can see if there is no changes in the system")
    @Test
    public void theAdministratorCanSeeIfThereIsNoChangesInTheSystem() {
        List <Users> dataBase=DataBase.initializeDB();
        List <Users> dataBase2=DataBase.initializeDB();
        assertFalse(AdministratorFeature.administratorFeatureOne(dataBase,dataBase2));
    }







}
