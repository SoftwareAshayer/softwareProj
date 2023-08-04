import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class TenantFeaturesTest {
String username="omar";


    Tenant tenant;
    @Given("that the user is Tenant")
    public void thatTheUserIsTenant() {
        assertNotNull(DataBase.getTenant(username));
        assertNull(DataBase.getTenant("anyString"));
 tenant=new Tenant();
    }
    @Test
    @Then("the Tenant can see list of Availabel Sakans")
    public void theTenantCanSeeListOfAvailabelSakans() {

List <Sakan>sakan=DataBase.initializeSakan();
        List <Sakan>sakanAvailabel=   TenantFeatures.seeAvailableHousing(sakan);
for(Sakan s:sakanAvailabel)
{
    assertTrue(s.isAvailabel());
}


    }

////////////////feature two
@Test
@Then("the Tenant can see pictures of housing and know their prices, location,and services")
    public void theTenantCanSeePicturesOfHousingAndKnowTheirPricesLocationAndServices() {
List <Sakan> sakan=DataBase.initializeSakan();
boolean getInfromations=TenantFeatures.seeInformationsAboutSakan(sakan);
assertTrue(getInfromations);
    }




////////////////feature three

    @Test
    @Then("the Tenant sign in the availabel sakan")
    public void theTenantSignInTheAvailabelSakan() {
        Tenant tenant2=DataBase.getTenant(username);
        assert tenant2 != null;
        Sakan sakan=new Sakan(tenant2.getS());
        sakan.setTenant(tenant2);
        TenantFeatures.signInSakan(tenant2);
        boolean tenantSignedInSakan=sakan.isAvailabel();
        assertTrue(tenantSignedInSakan);
        Tenant tenant1=new Tenant();
        Tenant tenant3=new Tenant();
        Tenant tenant4=new Tenant();
        sakan.setTenant(tenant1);
        sakan.setTenant(tenant3);
        sakan.setTenant(tenant4);
        sakan.setAvailabel();
        assertFalse(sakan.isAvailabel());
        assertNotNull(sakan.getTenant());



    }


////////////////feature four

    @Test
    @Then("the Tenant can see details about students if he is student")
    public void theTenantCanSeeDetailsAboutStudentsIfHeIsStudent() {
        Tenant tenant1=DataBase.getTenant(username);
        assert tenant1 != null;
        List <Users>dataBase;
        dataBase= DataBase.initializeDB();
        Tenant student=TenantFeatures.studentAccess(tenant1,dataBase);
        assertNotNull(student);
Tenant tenant2=new Tenant("anyName","anyPass");
tenant2.setAStudent(false);
assertNull(TenantFeatures.studentAccess(tenant2,dataBase));
        List <Users>dataBase2=new ArrayList<>();
        Tenant tenant3=new Tenant();
        tenant3.setAStudent(true);
        assertNull(TenantFeatures.studentAccess(tenant3,dataBase2));



    }

////////////////feature five

    @Test
    @Then("the Tenant can sell the furniture")
    public void theTenantCanSellTheFurniture() {
    Tenant tenant1=DataBase.getTenant(username);
        assert tenant1 != null;
        boolean sold;
    sold=TenantFeatures.sellFurniture(tenant1);
    assertTrue(sold);






    }




////////////////feature six

    @Test
    @Then("the Tenant can see details for all infromations about this Sakan")
    public void theTenantCanSeeDetailsForAllInfromationsAboutThisSakan() {
        Tenant tenant1=DataBase.getTenant(username);
        assert tenant1 != null;
        Tenant tenant2=new Tenant(tenant1.getName(),tenant1.getPass(),tenant1.getTimeForRent(),tenant1.heIsAStudent(),tenant1.getS(),tenant1.getAge(),tenant1.getUniversityMajor());
        List <Sakan> sakan=DataBase.initializeSakan();
        tenant1.setS(sakan.get(0));

        boolean doneForFeatureSix=TenantFeatures.showAllDeitails(tenant2);
         assertTrue(doneForFeatureSix);
         assertNotEquals("",tenant1.toString());
         assertNotEquals("",tenant1.getS().toString());
         assertNotEquals("",tenant1.getS().getSakanD().toString());
         Tenant tenant3=new Tenant("anyName","anyPass");
         tenant3.setS(new Sakan());
         tenant3.getS().setOwner(new Owner());
         assertFalse(TenantFeatures.showAllDeitails(tenant3));

    }











}
