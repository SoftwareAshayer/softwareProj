package org.example;


import java.util.List;

public class OwnerFeatures {

	public static void ownerFeatureOne(List<Sakan> Sakan,String PhotoPath, String username) {
		for (Sakan s : Sakan)
		{
			if(s.owner.name.equals(username))
			{
			s.setPhotos(PhotoPath);

			}
			
			
			
		}
	}



	public static void ownerFeatureTwo(Owner owner,String email,String phoneNo,String Location) {
              owner.setLocation(Location);
			  owner.setPhoneNumber(phoneNo);
			  owner.setEmailForContact(email);






	}







	public static boolean ownerFeatureThree(Owner owner,Sakan sakan,boolean electricity,boolean water) {

		boolean electricityBefore=sakan.sakanD.isSakanElectricity();
		boolean waterBefore =sakan.sakanD.isSakanWater();
owner.getSakan().sakanD.setSakanElectricity(!electricity);
owner.getSakan().sakanD.setSakanWater(!water);
return (electricityBefore!=owner.getSakan().sakanD.isSakanElectricity())&&(waterBefore!=owner.getSakan().sakanD.isSakanWater());


	}


















	public static String ownerFeatureFiveForLocation(Owner owner) {
		return owner.getLocation();
	}
	public static String ownerFeatureFiveForEmail(Owner owner) {
		return owner.getEmailForContact();
	}
	public static String ownerFeatureFiveForPhoneNumber(Owner owner) {
		return owner.getPhoneNumber();
	}






	public static boolean ownerFeatureSix(Sakan sakan)
	{
     SakanDetails sakanDetails=sakan.getSakanD();
		return sakanDetails.getNumberOfBedrooms() != 0 && sakanDetails.getNumberOfBathrooms() != 0 && sakanDetails.isHasBalcony()&&sakanDetails.getNumberOfFloor()!=0;


	}





}
