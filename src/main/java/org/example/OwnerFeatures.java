package org.example;


import java.util.List;

public class OwnerFeatures {
private OwnerFeatures()
{
	//private constructor
}
	public static void ownerFeatureOne(List<Sakan> sakan,String photoPath, String username) {
		for (Sakan s : sakan)
		{
			if(s.getOwner().getName().equals(username))
			{
			s.setPhotos(photoPath);

			}
			
			
			
		}
	}



	public static void ownerFeatureTwo(Owner owner,String email,String phoneNo,String location) {
              owner.setLocation(location);
			  owner.setPhoneNumber(phoneNo);
			  owner.setEmailForContact(email);






	}







	public static boolean ownerFeatureThree(Owner owner,Sakan sakan,boolean electricity,boolean water) {

		boolean electricityBefore=sakan.getSakanD().isSakanElectricity();
		boolean waterBefore =sakan.getSakanD().isSakanWater();
owner.getSakan().getSakanD().setSakanElectricity(!electricity);
owner.getSakan().getSakanD().setSakanWater(!water);
return (electricityBefore!=owner.getSakan().getSakanD().isSakanElectricity())&&(waterBefore!=owner.getSakan().getSakanD().isSakanWater());


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
