package TestsFolder.tests;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TenantFeaturesTest {
String username="omar";


    Tenant tenant;
    @Given("that the user is Tenant")
    public void that_the_user_is_tenant() {
        assertNotNull(DataBase.getTenant(username));
        assertNull(DataBase.getTenant("anyString"));
 tenant=new Tenant();
    }
    @Then("the Tenant can see list of Availabel Sakans")
    @Test
    public void the_tenant_can_see_list_of_availabel_sakans() {

List <Sakan>sakan=DataBase.initializeSakan();
        List <Sakan>sakanAvailabel=   TenantFeatures.seeAvailableHousing(sakan);
for(Sakan s:sakanAvailabel)
{
    assertTrue(s.isAvailabel());
}


    }

////////////////feature two
    @Then("the Tenant can see pictures of housing and know their prices, location,and services")
    @Test
    public void the_tenant_can_see_pictures_of_housing_and_know_their_prices_location_and_services() {
List <Sakan> sakan=DataBase.initializeSakan();
boolean getInfromations=TenantFeatures.seeInformationsAboutSakan(sakan);
assertTrue(getInfromations);
    }




////////////////feature three


    @Then("the Tenant sign in the availabel sakan")
    @Test
    public void the_tenant_sign_in_the_availabel_sakan() {
        Tenant tenant=DataBase.getTenant(username);
        assert tenant != null;
        Sakan sakan=new Sakan(tenant.getS());
        sakan.setTenant(tenant);
        TenantFeatures.SignInSakan(tenant);
        boolean tenantSignedInSakan=sakan.isAvailabel();
        assertTrue(tenantSignedInSakan);
        Tenant tenant2=new Tenant();
        Tenant tenant3=new Tenant();
        Tenant tenant4=new Tenant();
        sakan.setTenant(tenant2);
        sakan.setTenant(tenant3);
        sakan.setTenant(tenant4);
        sakan.setAvailabel();
        assertFalse(sakan.isAvailabel());
        assertNotNull(sakan.getTenant());



    }


////////////////feature four


    @Then("the Tenant can see details about students if he is student")
    @Test
    public void the_tenant_can_see_details_about_students_if_he_is_student() {
        Tenant tenant=DataBase.getTenant(username);
        assert tenant != null;
        List <Users>DB;
        DB= DataBase.initializeDB();
        Tenant student=TenantFeatures.StudentAccess(tenant,DB);
        assertNotNull(student);
Tenant tenant2=new Tenant("anyName","anyPass");
tenant2.setAStudent(false);
assertNull(TenantFeatures.StudentAccess(tenant2,DB));
        List <Users>DB2=new ArrayList<>();
        Tenant tenant3=new Tenant();
        tenant3.setAStudent(true);
        assertNull(TenantFeatures.StudentAccess(tenant3,DB2));



    }

////////////////feature five


    @Then("the Tenant can sell the furniture")
    @Test
    public void the_tenant_can_sell_the_furniture() {
    Tenant tenant=DataBase.getTenant(username);
        assert tenant != null;
        boolean sold;
    sold=TenantFeatures.SellFurniture(tenant);
    assertTrue(sold);






    }




////////////////feature six


    @Then("the Tenant can see details for all infromations about this Sakan")
    @Test
    public void the_tenant_can_see_details_for_all_infromations_about_this_sakan() {
        Tenant tenant=DataBase.getTenant(username);
        assert tenant != null;
        Tenant tenant2=new Tenant(tenant.getName(),tenant.getPass(),tenant.getTimeForRent(),tenant.isAStudent,tenant.getS(),tenant.getAge(),tenant.getUniversityMajor());
        List <Sakan> sakan=DataBase.initializeSakan();
        tenant.setS(sakan.get(0));

        boolean doneForFeatureSix=TenantFeatures.ShowAllDeitails(tenant2);
         assertTrue(doneForFeatureSix);
         assertNotEquals("",tenant.toString());
         assertNotEquals("",tenant.getS().toString());
         assertNotEquals("",tenant.getS().getSakanD().toString());
         Tenant tenant1=new Tenant("anyName","anyPass");
         tenant1.setS(new Sakan());
         tenant1.getS().setOwner(new Owner());
         assertFalse(TenantFeatures.ShowAllDeitails(tenant1));

    }











}
