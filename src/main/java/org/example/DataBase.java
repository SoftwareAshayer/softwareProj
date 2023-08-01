package org.example;
import java.util.ArrayList;
import java.util.List;
public class DataBase {

    public static Sakan getS1() {
        return s1;
    }

    public static Sakan getS2() {
        return s2;
    }

    public static Sakan s1=new Sakan();

    public static Sakan s2=new Sakan();

    public static void sakanEditDeitails(Sakan s1,Sakan s2)
    {
        SakanDetails ForS1=new SakanDetails();
        SakanDetails ForS2=new SakanDetails();
        ForS1.setFurnitureSaled(false);
        ForS1.setLocation("90 Street");
        ForS1.setNumberOfFloor(1);
        ForS1.setRentMonthly(500);
        ForS1.setSakanElectricity(true);
        ForS1.setSakanWater(true);
ForS1.setHasBalcony(true);
ForS1.setNumberOfBathrooms(3);
ForS1.setNumberOfBedrooms(4);
ForS1.setNumberOfFloor(1);
        s1.setSakanD(ForS1);
        ForS2.setFurnitureSaled(false);
        ForS2.setLocation("2 Street");
        ForS2.setNumberOfFloor(3);
        ForS2.setRentMonthly(1500);
        ForS2.setSakanElectricity(false);
        ForS2.setSakanWater(false);
        s2.setSakanD(ForS2);


    }

    public static List<Users> initializeDB() {
        List<Users> DB = new ArrayList<>();

        Administrator admin = new Administrator("Ahmad","1234");
        Owner owner1 = new Owner("Ali","al1234");
        Owner owner2 = new Owner("Sameer","s12028561");
        Tenant tenant1 = new Tenant("omar","s123");
        Tenant tenant2 = new Tenant("saly","saly123");
        Tenant tenant3 = new Tenant("aker","789");
        Tenant tenant4 = new Tenant("ammar","456");
        Tenant tenant5 = new Tenant("sufyan","321");

        owner1.setEmailForContact("Ali44@gmail.com");
        owner1.setLocation("Nablus");
        owner1.setPhoneNumber("0594806137");
        owner2.setEmailForContact("sameers55@gmail.com");
        owner2.setLocation("Tulkarem");
        owner2.setPhoneNumber("05940345465");
        tenant1.setAge(18);
        tenant1.setAStudent(true);
        tenant1.setTimeForRent("18/5/2023");
        tenant1.setUniversityMajor("CE");
        tenant2.setAge(20);
        tenant2.setAStudent(true);
        tenant2.setTimeForRent("30/7/2023");
        tenant2.setUniversityMajor("EE");
        tenant3.setAge(21);
        tenant3.setAStudent(true);
        tenant3.setTimeForRent("18/9/2023");
        tenant3.setUniversityMajor("EE");
        tenant4.setAge(15);
        tenant4.setAStudent(false);
        tenant4.setTimeForRent("9/1/2023");
        tenant4.setUniversityMajor("Doctor");
        tenant5.setAge(26);
        tenant5.setAStudent(false);
        tenant5.setTimeForRent("18/12/2023");
        tenant5.setUniversityMajor("CE");
        DB.add(admin);
        DB.add(owner1);
        DB.add(owner2);
        DB.add(tenant3);
        DB.add(tenant4);
        DB.add(tenant5);





        s1.setOwner(owner1);
        s2.setOwner(owner2);
        s1.setPhotos("C:/Users/ashay/OneDrive/Desktop/Sakan1.jpg");
        s2.setPhotos("C:\\Users\\ashay\\OneDrive\\Desktop\\Sakan2.jpg");




        sakanEditDeitails(s1,s2);
        owner1.setSakan(s1);
        owner2.setSakan(s2);

        tenant1.setS(s1);
        tenant2.setS(s2);
        DB.add(tenant1);
        DB.add(tenant2);






        return DB;
    }


    public static List<Sakan> initializeSakan() {
        List<Sakan> sakan = new ArrayList<>();

        Sakan s1 = new Sakan();
        Sakan s2 = new Sakan();
        s1.setPhotos("C:/Users/ashay/OneDrive/Desktop/Sakan1.jpg");
        s2.setPhotos("C:\\Users\\ashay\\OneDrive\\Desktop\\Sakan2.jpg");
        Owner owner1 = new Owner("Ali", "al1234");
        Owner owner2 = new Owner("Sameer", "s12028561");


        sakanEditDeitails(s1,s2);
        sakan.add(s1);
        sakan.add(s2);
        s1.setOwner(owner1);
        s2.setOwner(owner2);

        return sakan;
    }


    public static Owner getOwner(String userName) {
        List<Users> database = DataBase.initializeDB();
        for (Users user : database) {
            if (user instanceof Owner && user.getName().equals(userName)) {
                return (Owner) user;
            }
        }

        return null;
    }

    public static Tenant getTenant(String userName) {
        List<Users> database = DataBase.initializeDB();
        for (Users user : database) {
            if (user instanceof Tenant && user.getName().equals(userName)) {
                return (Tenant) user;
            }
        }

        return null;
    }


}




























