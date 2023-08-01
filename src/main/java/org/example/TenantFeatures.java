package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TenantFeatures {
   private TenantFeatures()
   {
       //private constructor
   }
    public static List <Sakan>seeAvailableHousing(List<Sakan> sakan) {
        List<Sakan> availabelSakan = new ArrayList<>();
for(Sakan availabelS:sakan)
{
    if (availabelS.isAvailabel())
    {
        availabelSakan.add(availabelS);
    }
}

        return availabelSakan;
    }




    public static boolean seeInformationsAboutSakan(List <Sakan> sakan)
    {
     Sakan s=sakan.get(1);
     return !s.getPhotos().isEmpty() && !s.getSakanD().isSakanElectricity() && !s.getSakanD().isSakanWater()&& !Objects.equals(s.getSakanD().getLocation(), "");










    }



    public static void signInSakan(Tenant tenant)
    {
        List <Sakan> sakan= DataBase.initializeSakan();
Sakan s=sakan.get(0);

if(s.isAvailabel()) {
    tenant.setS(s);

}


    }




    public static Tenant studentAccess(Tenant tenant,List <Users>dataBase)
    {
        if(!tenant.heIsAStudent())
            return null;
        else {
            List<Users> tenants;
            tenants = dataBase;
            for (Users user : tenants) {
                if (user instanceof Tenant student && !Objects.equals(user.getName(), tenant.getName())&&student.heIsAStudent())
                {
                        return student;


                }
            }




        }



return null;
    }






    public static boolean sellFurniture(Tenant tenant)
    {
    boolean sold=tenant.getS().getSakanD().isFurnitureSaled();
    tenant.getS().getSakanD().setFurnitureSaled(true);
        return sold != tenant.getS().getSakanD().isFurnitureSaled();

    }


    public static boolean showAllDeitails(Tenant tenant)
    {
  Owner owner=DataBase.getOwner("Ali");
        assert owner != null;
        if(tenant.getS().getOwner().getName().equals(owner.getName()))
  {
      return owner.getName() != null && owner.getEmailForContact() != null && tenant.getTimeForRent() != null;


 

  }


        return false;


    }













}