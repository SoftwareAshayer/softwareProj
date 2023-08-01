package org.example;
import java.util.ArrayList;
import java.util.List;
public class DataBase {
private DataBase()
{
    //private constructor
}
    public static Sakan getS1() {
        return s1;
    }

    public static Sakan getS2() {
        return s2;
    }

    public static final Sakan s1=new Sakan();

    public static final Sakan s2=new Sakan();

    public static void sakanEditDeitails(Sakan s1,Sakan s2)
    {
        SakanDetails forS1=new SakanDetails();
        SakanDetails forS2=new SakanDetails();
        forS1.setFurnitureSaled(false);
        forS1.setLocation("90 Street");
        forS1.setNumberOfFloor(1);
        forS1.setRentMonthly(500);
        forS1.setSakanElectricity(true);
        forS1.setSakanWater(true);
        forS1.setHasBalcony(true);
        forS1.setNumberOfBathrooms(3);
        forS1.setNumberOfBedrooms(4);
        forS1.setNumberOfFloor(1);
        s1.setSakanD(forS1);
        forS2.setFurnitureSaled(false);
        forS2.setLocation("2 Street");
        forS2.setNumberOfFloor(3);
        forS2.setRentMonthly(1500);
        forS2.setSakanElectricity(false);
        forS2.setSakanWater(false);
        s2.setSakanD(forS2);


    }

    public static List<Users> initializeDB() {
        List<Users> dataBase = new ArrayList<>();

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
        dataBase.add(admin);
        dataBase.add(owner1);
        dataBase.add(owner2);
        dataBase.add(tenant3);
        dataBase.add(tenant4);
        dataBase.add(tenant5);





        s1.setOwner(owner1);
        s2.setOwner(owner2);
        s1.setPhotos("C:/Users/ashay/OneDrive/Desktop/Sakan1.jpg");
        s2.setPhotos("C:\\Users\\ashay\\OneDrive\\Desktop\\Sakan2.jpg");




        sakanEditDeitails(s1,s2);
        owner1.setSakan(s1);
        owner2.setSakan(s2);

        tenant1.setS(s1);
        tenant2.setS(s2);
        dataBase.add(tenant1);
        dataBase.add(tenant2);






        return dataBase;
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




























