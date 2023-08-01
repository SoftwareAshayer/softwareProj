package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TenantFeatures {
    public static List <Sakan>seeAvailableHousing(List<Sakan> sakan) {
        List<Sakan> AvailabelSakan = new ArrayList<>();
for(Sakan AvailabelS:sakan)
{
    if (AvailabelS.isAvailabel())
    {
        AvailabelSakan.add(AvailabelS);
    }
}

        return AvailabelSakan;
    }




    public static boolean seeInformationsAboutSakan(List <Sakan> sakan)
    {
     Sakan s=sakan.get(1);
     return s.getPhotos().size() > 0 && !s.getSakanD().isSakanElectricity() && !s.getSakanD().isSakanWater()&& !Objects.equals(s.getSakanD().getLocation(), "");










    }



    public static void SignInSakan(Tenant tenant)
    {
        List <Sakan> sakan= DataBase.initializeSakan();
Sakan s=sakan.get(0);

if(s.isAvailabel()) {
    tenant.setS(s);

}


    }




    public static Tenant StudentAccess(Tenant tenant,List <Users>DB)
    {
        if(!tenant.isAStudent)
            return null;
        else {
            List<Users> tenants;
            tenants = DB;
            for (Users user : tenants) {
                if (user instanceof Tenant student && !Objects.equals(user.getName(), tenant.getName()))
                {
                    if( student.heIsAStudent())
                        return student;


                }
            }




        }



return null;
    }






    public static boolean SellFurniture(Tenant tenant)
    {
    boolean sold=tenant.getS().getSakanD().isFurnitureSaled();
    tenant.getS().getSakanD().setFurnitureSaled(true);
        return sold != tenant.getS().getSakanD().isFurnitureSaled();

    }


    public static boolean ShowAllDeitails(Tenant tenant)
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