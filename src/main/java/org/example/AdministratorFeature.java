package org.example;

import java.util.List;

public class AdministratorFeature {

	public static boolean administratorFeatureOne(List<Users> DB, List<Users> DB2)
	{
		boolean flag=false;
     for(int i=1;i<DB.size();i++)
	 {
		 Users u1 = DB.get(i);
		 Users u2 = DB2.get(i);






		 if(!u1.equals(u2))
		 {
			 flag=true;
break;
		 }





	 }


		return flag;

	}
	public static boolean administratorFeatureOneForSakan(List<Sakan> DB, List<Sakan> DB2)
	{
		boolean flag=false;
		for(int i=0;i<DB.size();i++)
		{






			if(!DB.get(i).equals(DB2.get(i)))
			{
				flag=true;
				break;
			}





		}


		return flag;

	}
}



