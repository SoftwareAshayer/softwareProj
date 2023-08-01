package org.example;


import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.*;
import java.util.List;




// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter.You can now see whitespace characters in your code.


public class Main {

    public static void main(String[] args) {
		List<Users> dataBase=DataBase.initializeDB();
		List<Users> dataBase2= DataBase.initializeDB();
    	Logger logger = Logger.getLogger(Main.class.getName());
        logger.setUseParentHandlers(false);
        Formatter formatter = new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getMessage() + "\n";
            }
        };
        ConsoleHandler consoleHandler = new ConsoleHandler();           //this logger method i use it to print the statments instead of system.out
        consoleHandler.setFormatter(formatter);
        logger.addHandler(consoleHandler);
        String ownerClassName="org.example.Owner";
		String tenantClassName="org.example.Tenant";
		String administratorClassName="org.example.Administrator";

        String redColor = "\u001B[31m";
        String resetColor = "\u001B[0m";
        String boldText = "\u001B[1m";
        String yellowColor = "\u001B[33m";
        String greenColor = "\u001B[32m";
        String specialColor = "\u001B[35m";
        String italicText = "\u001B[3m";
        String specialColor2 = "\u001B[38;2;0;255;255m";
		List<Sakan> sakan=new ArrayList<>();
    	List<Sakan> sakan2=new ArrayList<>();
        sakan.add(DataBase.getS1());
		sakan.add(DataBase.getS2());
		Sakan s1=new Sakan(DataBase.getS1());
		Sakan s2=new Sakan(DataBase.getS2());
		sakan2.add(s1);
		sakan2.add(s2);
		String logMessageForDone = String.format("%sDone!%s", specialColor2, resetColor);
		String logMessageForWrong = String.format("%sWrong Choice!%nTry Again%s", redColor, resetColor);
		String logMessageLogOut = String.format("%s%s7-%sLog out%s", boldText, yellowColor, greenColor, resetColor);




		String welcomeMessage = String.format("%s%s%s", redColor + boldText,
				"                                       Welcome to our Project for the Sakanat", resetColor);

		logger.info(welcomeMessage);
		logger.info("                                     -------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        while(true) {


			String logMessage = String.format("%s%s1-%sLog in%s", boldText, yellowColor, greenColor, resetColor);

			logger.info(logMessage);
			String logMessage2 = String.format("%s%s9-%sExit%s", boldText, yellowColor, greenColor, resetColor);

			logger.info(logMessage2);
			int choice = scanner.nextInt();
        if(choice==1)
        {
        	String type="";
			String logMessage3 = String.format("%s%sPlease sir enter your username%s", italicText, specialColor, resetColor);

			logger.info(logMessage3);
			String username=scanner.next();
			String logMessage4 = String.format("%s%sPlease sir enter your Password%s", italicText, specialColor, resetColor);

			logger.info(logMessage4);
			String pass=scanner.next();
            boolean found=false;
            Users u=new Users();
            for (Users user : dataBase) {
                if (user.getName().equals(username) && user.getPass().equals(pass)) {//this code for searching for the user i entered
                	found = true;
                	u=user;
                	type=user.getClass().getName();
                    break;
                }

            }
            
            if (found) {
				String logMessage5 = String.format("%s%sWelcome %s%s!", specialColor2, italicText, username, resetColor);

				logger.info(logMessage5);

				if(type.contains(administratorClassName))//It's Administrator
				{

					for (int i = 1; i < dataBase.size(); i++)
					{
						Users u1 = dataBase.get(i);
						int flagForType=0;//------------->to know the type of user
						Users u2 = dataBase2.get(i);
						String type2=u1.getClass().getName();
						if(type2.contains(ownerClassName))
						{
							flagForType=1;

						}








						if(!u1.equals(u2))
						{
							String logMessage6 = String.format("%s%sbefore:- %s%s%n%s%safter:- %s%s",
									specialColor2, italicText, u2.toString(), resetColor,
									redColor, italicText, u1.toString(), resetColor);

							logger.info(logMessage6);
							String logMessage7 = String.format("%s%s%nDO you want to confirm changes?%n%s1-%s yes%n%s2-%s No%n%s",
									specialColor, italicText, yellowColor, greenColor, yellowColor, greenColor, resetColor);

							logger.info(logMessage7);
							int choice2=scanner.nextInt();
							if(choice2==1)
							{
								if(flagForType==0)
								{
									Tenant TForEdit=(Tenant)u1;
									Tenant tenant=new Tenant(TForEdit.getName(),
											TForEdit.getPass(),
											TForEdit.getTimeForRent(),
											TForEdit.isAStudent,
											TForEdit.getS(),
											TForEdit.getAge(),
											TForEdit.getUniversityMajor());            	            		dataBase2.remove(i);
									dataBase2.add(i, tenant);
								}
								else {
									Owner ownerForEdit=(Owner) u1;
									Owner owner=new Owner(ownerForEdit.getName(),
											ownerForEdit.getPass(),
											ownerForEdit.getPhoneNumber(),
											ownerForEdit.getLocation(),
											ownerForEdit.getEmailForContact()
									);                	            		dataBase2.remove(i);
									dataBase2.add(i, owner);
								}



								logger.info(logMessageForDone);

							}
							else if(choice2==2)
							{

								if(flagForType==0)
								{
									Tenant tenantForEdit=(Tenant)u2;
									Tenant tenant=new Tenant(tenantForEdit.getName(),
											tenantForEdit.getPass(),
											tenantForEdit.getTimeForRent(),
											tenantForEdit.isAStudent,
											tenantForEdit.getS(),
											tenantForEdit.getAge(),
											tenantForEdit.getUniversityMajor());
									dataBase.remove(i);
									dataBase.add(i, tenant);
								}
								else {
									Owner ownerForEdit=(Owner) u2;
									Owner owner=new Owner(ownerForEdit.getName(),
											ownerForEdit.getPass(),
											ownerForEdit.getPhoneNumber(),
											ownerForEdit.getLocation(),
											ownerForEdit.getEmailForContact()
									);
									dataBase.remove(i);
									dataBase.add(i, owner);
								}
								logger.info(logMessageForDone);

							}
							else
							{
								logger.info(logMessageForWrong);

							}

						}



					}



					for (int o = 0; o < sakan.size(); o++) {
						Sakan a1 = sakan.get(o);
						Sakan a2 = sakan2.get(o);


						if(!a1.equals(a2))
					 {
						 String logMessage8 = String.format("%s%sbefore:- %s%s%n%s%safter:- %s%s",
								 specialColor2, italicText, a2.toString(), resetColor,
								 redColor, italicText, a1.toString(), resetColor);

						 logger.info(logMessage8);
						 String logMessage9 = String.format("%s%s%nDO you want to confirm changes?%n%s1-%syes%n%s2-%sNo%s",
								 specialColor, italicText, yellowColor, greenColor, yellowColor, greenColor, resetColor);
						 logger.info(logMessage9);
						 int choice2=scanner.nextInt();
							if(choice2==1)
							{
								Sakan sakanAfter=new Sakan(a1);
								sakan2.remove(o);
								sakan2.add(o, sakanAfter);
								logger.info(logMessageForDone);

							}
							else if(choice2==2)
							{

								Sakan sakanAfter=new Sakan(a2);
								sakan.remove(o);
								sakan.add(o, sakanAfter);

							}
							else
							{
								logger.info(logMessageForWrong);

							}























						}


					}











				}
              
              else if(type.contains(ownerClassName))	//It's Owner
              {
            	  
                  Owner owner = (Owner) u;
            	  while(true)
            	  {

					  String logMessage10 = String.format("%s%s1-%sAdding Photos%s", boldText, yellowColor, greenColor, resetColor);

					  logger.info(logMessage10);
					  String logMessage11 = String.format("%s%s2-%sinformations and Location%s", boldText, yellowColor, greenColor, resetColor);

					  logger.info(logMessage11);
					  String logMessage12 = String.format("%s%s3-%sAvailable Services%s", boldText, yellowColor, greenColor, resetColor);

					  logger.info(logMessage12);
					  String logMessage13 = String.format("%s%s4-%sThe monthly rent%s", boldText, yellowColor, greenColor, resetColor);

					  logger.info(logMessage13);
					  String logMessage14 = String.format("%s%s5-%sContact information%s", boldText, yellowColor, greenColor, resetColor);

					  logger.info(logMessage14);
					  String logMessage15 = String.format("%s%s6-%sDashboard%s", boldText, yellowColor, greenColor, resetColor);
					  logger.info(logMessage15);

					  logger.info(logMessageLogOut);
            	        int choice2=scanner.nextInt();
                        if(choice2==7)
                        {
							String logMessage16 = String.format("%sThank You Sir!%s", specialColor2, resetColor);

							logger.info(logMessage16);
							break;
                        }
                        else if(choice2==1) 
                        {
							String logMessage17 = String.format("%sPlease Enter the path for Your Sakan pictures%s", specialColor, resetColor);

							logger.info(logMessage17);
							String photoPath=scanner.next();
							for (Sakan s : sakan)
							{
								if(s.owner.name.equals(username))
								{
									s.setPhotos(photoPath);
									logger.info("Done!");

								}



							}
                        	
                        	
                        	
                       	 
                        	
                        }
                        else if(choice2==2)
                        {
							String logMessage18 = String.format("%sSir Your Name is: %s%nYour Location is: %s%nYour email is: %s%nYour Phone No#: %s%s",
									specialColor2, username, owner.getLocation(), owner.getEmailForContact(), owner.getPhoneNumber(), resetColor);

							logger.info(logMessage18);
							String logMessage19 = String.format("%sDo you want to change any one of Them?%n%s1-%sYes%n%s2-%sNo%s",
									specialColor, yellowColor, greenColor, yellowColor, greenColor, resetColor);

							logger.info(logMessage19);
							int ch=scanner.nextInt();
                         	if(ch==1)
                         	{
								String logMessage20 = String.format("%swhat Do you want to change%n%s1-%sPhone Number%n%s2-%sLocation%n%s3-%sEmail%s",
										specialColor, yellowColor, greenColor, yellowColor, greenColor, yellowColor, greenColor, resetColor);

								logger.info(logMessage20);                                 ch=scanner.nextInt();
                                 if(ch==1)
                                 {
									 String logMessage21= String.format("%sEnter The New Number%s", specialColor, resetColor);

									 logger.info(logMessage21);
									 String newNumber=scanner.next();
                                	 owner.setPhoneNumber(newNumber);
                                  	 logger.info(logMessageForDone);



                                 }
                                 else if(ch==2)
                                 {
									 String logMessage22 = String.format("%sEnter The New Location%s", specialColor, resetColor);

									 logger.info(logMessage22);
									 String newLocation=scanner.next();
                                	 owner.setLocation(newLocation);
									 logger.info(logMessageForDone);


                                 }
                                 else if(ch==3)
                                 {
									 String logMessage23 = String.format("%sEnter The New Email%s", specialColor, resetColor);

									 logger.info(logMessage23);
									 String newEmail=scanner.next();
                                	owner.setEmailForContact(newEmail);
									 logger.info(logMessageForDone);


                                 }
                                 else
                                	 logger.info(logMessageForWrong);
                                 }
                         	else if(ch != 2)// For yes and No
                         	{
								logger.info(logMessageForWrong);
                         	}







                        }
                        else if(choice2==3)
                        {
                        	for (Sakan s : sakan)
                           	{
                           		if(s.owner.name.equals(username))
                           		{
                              	 boolean electricity=s.sakanD.isSakanElectricity();
                              	 boolean water=s.sakanD.isSakanWater();

									if(electricity) {
										String logMessage24 = String.format("%sThe Sakan has Electricity%s", specialColor2, resetColor);
										logger.info(logMessage24);

									}
									else {
										String logMessage25 = String.format("%sThe Sakan does not have Electricity%s", specialColor2, resetColor);

										logger.info(logMessage25);
									}
									if(water) {
										String logMessage26 = String.format("%sThe Sakan has Water%s", specialColor2, resetColor);

										logger.info(logMessage26);
									}
									else {
										String logMessage27 = String.format("%sThe Sakan does not have Water%s", specialColor2, resetColor);

										logger.info(logMessage27);
									}

									String logMessage28 = String.format("%sDo you want to change it?%n%s1-%sYes%n%s2-%sNo%s",
											specialColor, yellowColor, greenColor, yellowColor, greenColor, resetColor);

									logger.info(logMessage28);
									int ch=scanner.nextInt();
                                 if(ch==1)
                                 {
									 String logMessage29 = String.format("%sWhich one of them?%n%s1-%sElectricity%n%s2-%sWater%s",
											 specialColor, yellowColor, greenColor, yellowColor, greenColor, resetColor);

									 logger.info(logMessage29);
									 int ch2=scanner.nextInt();
                                if(ch2==1)
                                {

                                	s.sakanD.setSakanElectricity(!electricity);
                                 	 logger.info(logMessageForDone);



                                }
                                else if(ch2==2)
                                {


                                	s.sakanD.setSakanWater(!water);
									logger.info(logMessageForDone);






                                }
                                else
                                {
									logger.info(logMessageForWrong);

                                }



                                 }




                           		}



                           	}









                        }
                        else if(choice2==4)
                        {
							for (Sakan s : sakan)
							{
								if(s.owner.name.equals(username))
								{

									String logMessage30 = String.format("%sThe Rent is=%s%d%s",
											specialColor2, resetColor, s.sakanD.getRentMonthly(), resetColor);

									logger.info(logMessage30);
								}
							}



						}
                        else if(choice2==5)
                        {

                        	for (Sakan s : sakan)
                           	{
                           		if(s.owner.name.equals(username))
                           		{

									String logMessage31 = String.format("%sContact Us-->Email:=%s%s%nPhone:%s%s",
											specialColor2, resetColor, owner.getEmailForContact(), resetColor, owner.getPhoneNumber());

									logger.info(logMessage31);
									String logMessage32 = String.format("%sDo you want to change-->%n%s1-%sEmail%n%s2-%sPhone%n%s3-%sNothing%s",
											specialColor, yellowColor, greenColor, yellowColor, greenColor, yellowColor, greenColor, resetColor);

									logger.info(logMessage32);
									while(true)
                                 	 {
                                 	 int ch=scanner.nextInt();
                                 	 if(ch==1)
                                 	 {
										 String logMessage33 = String.format("%sEnter the new email%s", specialColor, resetColor);

										 logger.info(logMessage33);
										 String Email=scanner.next();
                                 		 owner.setEmailForContact(Email);
										 logger.info(logMessageForDone);
										  break;
                                 	 }
                                 	 else if(ch==2)
                                 	 {
										 String logMessage34 = String.format("%sEnter the new No#%s", specialColor, resetColor);

										 logger.info(logMessage34);
										 String No=scanner.next();
                                		 scanner.close();
                                		 owner.setPhoneNumber(No);
                                     	 logger.info(logMessageForDone);
										  break;


                                 	 }
                                 	 else if(ch==3)
                                 	 {

                                 		 break;

                                 	 }
                                 	 else
                                 	 {
										 logger.info(logMessageForWrong);

                                 	 }

                                 	 }
                           		}
                           	}







                        }
						else if(choice2==6)
						{
							for (Sakan s : sakan)
							{
								if(s.owner.name.equals(username))
								{
									String logMessage35 = String.format("%sThe Number of Tenants is:-%s%d%s",
											specialColor2, resetColor, s.getTenant().size(), resetColor);

									logger.info(logMessage35);
									for(int i=0;i<s.getTenant().size();i++)
									{
										logger.info(specialColor2 +i+1+"-"+s.getTenant().get(i).getName()+ resetColor);
									}
									String logMessage36 = String.format("%sThe Number of Floor is:-%s%d%s",
											specialColor2, resetColor, s.getSakanD().getNumberOfFloor(), resetColor);

									logger.info(logMessage36);
									String logMessage37 = String.format("%sThe Number of Bedrooms is:-%s%d%s",
											specialColor2, resetColor, s.getSakanD().getNumberOfBedrooms(), resetColor);

									logger.info(logMessage37);
									String logMessage38 = String.format("%sThe Number of Bathrooms is:-%s%d%s",
											specialColor2, resetColor, s.getSakanD().getNumberOfBathrooms(), resetColor);

									logger.info(logMessage38);
									if(s.getSakanD().isHasBalcony())
									{
										String logMessage39 = String.format("%sThe Sakan of has Balcony%s", specialColor2, resetColor);

										logger.info(logMessage39);
									}
									else {
										String logMessage40 = String.format("%sThe Sakan does not contain Balcony%s", specialColor2, resetColor);

										logger.info(logMessage40);
									}

									break;
								}



							}

















						}

else {
logger.info(logMessageForWrong);
}





















            	  }
              }




              else   //It's Tenant
              {

            	  while(true)
            	  {
            		  Tenant tenant=(Tenant) u;
            	        logger.info(boldText+yellowColor+"1-"+greenColor+"View Available housing");
            	        logger.info(boldText+yellowColor+"2-"+greenColor+"view pictures of housing and know their prices, location,and services available in them");
            	        logger.info(boldText+yellowColor+"3-"+greenColor+"Book accommodation");
            	        logger.info(boldText+yellowColor+"4-"+greenColor+"Show Deitails about housing if your a student");
            	        logger.info(boldText+yellowColor+"5-"+greenColor+"Sell the furniture");
            	        logger.info(boldText+yellowColor+"6-"+greenColor+"Show All Deitails");
            	        logger.info(boldText+yellowColor+"7-"+greenColor+"Log out"+resetColor);
              		  int choice3=scanner.nextInt();


                         if(choice3==1)
                        {

                       	 logger.info(specialColor2+"The Available Sakans Are:- \n");

                        	for (Sakan s : sakan)
                        	{
                        		if(s.isAvailabel())
                        		{
                                  	logger.info(specialColor2+"Location:- "+s.sakanD.getLocation()+" Cost:- "+s.sakanD.getRentMonthly()+"\n"+resetColor);
                        		}
                        	}




                        }
                        else if(choice3==2)
                        {
                        	int num=0;
                        	for (Sakan s : sakan)
                        	{

								Desktop desktop = Desktop.getDesktop();
								for(int i=0;i<s.getPhotos().size();i++) {
									String path=s.getPhotos().get(i);
									File photoFile = new File(path);


									try {
										desktop.open(photoFile);
									} catch (IOException e) {
										throw new RuntimeException(e);
									}


								}
                             	 logger.info(specialColor2+(++num)+"- Location:- "+s.sakanD.getLocation()+"\nCost:- "+s.sakanD.getRentMonthly());
                             	 if(s.sakanD.isSakanElectricity())
                             	 {
                                 	 logger.info(specialColor2+"The Electrical is Available"+resetColor);
                             	 }
                             	 else
                             	 {
                                 	 logger.info(specialColor2+"The Electrical is not Available"+resetColor);
                             	 }
                             	 if(s.sakanD.isSakanWater())
                             	 {
                                 	 logger.info(specialColor2+"The Water is Available"+resetColor);

                             	 }
                             	 else
                             	 {
                                 	 logger.info(specialColor2+"The Water is not Available"+resetColor);
                             	 }
                        	}







                        }
                        else if(choice3==3)
                        {
							if(((Tenant) u).getS()!=null)
							{
								logger.info(redColor+"You already Signed in Sakan!"+resetColor);
								continue;


							}
                        	int number=0;
                        	for (Sakan s : sakan)
                        	{
                        		if(s.isAvailabel())
                        		{
                                  	 logger.info(specialColor2+(++number)+"-Location:- "+s.sakanD.getLocation()+" Cost:- "+s.sakanD.getRentMonthly()+"\n"+resetColor);
                        		}
                        	}
                         	 logger.info(specialColor+"Which one you need Sir?"+resetColor);
                         	 int choice2=scanner.nextInt();
                         	 if(choice2>number)
                         	 {
                               	 logger.info(redColor+"Wrong Choice!"+"\n"+"Try Again"+resetColor);
continue;
                         	 }
                        	 tenant.setS(sakan.get(choice2-1));
							sakan.get(choice2-1).setTenant(tenant);
							sakan.get(choice2-1).setAvailabel();
							logger.info(specialColor2+"Done!"+resetColor);






                        }
                        else if(choice3==4)
                        {
                        	int number=0;
                        	int flagForNoOne=1;
                        	if(tenant.isAStudent)
                        	{
                                for (Users us : dataBase) {
                                	if(us.getClass().getName().contains(tenantClassName))
                                			{
                                	Tenant t=(Tenant) us;
                                	if(t.isAStudent && !Objects.equals(t.getName(), tenant.getName()))
                                	{
                                		flagForNoOne=0;
                                     	 logger.info(specialColor2+(++number)+"-Name:- "+t.getName()+" Age:- "+t.getAge()+" Usivirsity Major:- "+t.getUniversityMajor()+resetColor);
                                	}

                                			}



                                }
if(flagForNoOne==1)
{
	 logger.info(specialColor2+"There is no other students in your Sakan!"+resetColor);
}


                        	}
                        	else
                        	{
                            	 logger.info(specialColor2+"Sorry Sir but this will acsess for the students only!");
                        	}

                        }
                        else if(choice3==5)
                        {
                         	logger.info(specialColor+"Are you Sure to sale the furniture for this Sakan?"+"\n"+yellowColor+"1-"+greenColor+"Yes"+"\n"+yellowColor+"2-"+greenColor+"No"+resetColor);
                        	int choice2=scanner.nextInt();
                        	if(choice2==1)
                        	{
								if(tenant.s.sakanD.isFurnitureSaled())
								{
									logger.info(specialColor2+"Already Saled!"+resetColor);

								}
								else {
									tenant.s.sakanD.setFurnitureSaled(true);
									logger.info(specialColor2 + "Done!" + resetColor);
								}

                        	}
                        	else if(choice2==2)
                        	{

                            	 logger.info(specialColor2+"Very Well!"+resetColor);

                        	}
                        	else {
                              	 logger.info("Wrong Choice!"+"\n"+"Try Again");
                        	}

                        }
                        else if(choice3==6)
                        {
                        	Owner o=new Owner();
                             for(Users user:dataBase)
                             {
                             	if(user.getClass().getName().contains(ownerClassName)&&tenant.getS().getOwner().equals(user))
                             	{

                                 		o=(Owner) user;
break;



                             	}


                             }
                        	 logger.info(specialColor2+"Name of Tenant:- "+tenant.getName()+"\nAge:- "+tenant.getAge()+"\nName of owner for this sakan:- "+o.getName()+"\nEmail of owner for contact:- "+o.getEmailForContact()+"\nThe rent is paid in:- "+tenant.getTimeForRent()+resetColor);



















                        }
                        else if(choice3==7)
                        {
                        	break;
                        }
                        else {
                       	 logger.info(redColor+"Wrong Choice!"+"\n"+"Try Again"+resetColor);
                        }

            	  }















              }





























































































            } else {
            	logger.info(specialColor2+italicText+"There is a wrong into username or your password sir!");
            }

        }
        else if(choice==9)
       {
    	   logger.info(italicText+greenColor+"Thank "+redColor+"You"+specialColor+"!");
           System.exit(0);
       }
        else
        {
          	 logger.info(redColor+"Wrong Choice!"+"\n"+"Try Again"+resetColor);
        }


        }
    }




}

