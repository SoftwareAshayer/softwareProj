package org.example;

import java.util.List;

public class AdministratorFeature {
	private AdministratorFeature() {
		//private constructor

	}
	public static boolean administratorFeatureOne(List<Users>dataBase, List<Users> dataBase2)
	{
		boolean flag=false;
     for(int i=1;i<dataBase.size();i++)
	 {
		 Users u1 = dataBase.get(i);
		 Users u2 = dataBase2.get(i);






		 if(!u1.equals(u2))
		 {
			 flag=true;
break;
		 }





	 }


		return flag;

	}
	public static boolean administratorFeatureOneForSakan(List<Sakan> dataBase, List<Sakan> dataBase2)
	{
		boolean flag=false;
		for(int i=0;i<dataBase.size();i++)
		{






			if(!dataBase.get(i).equals(dataBase2.get(i)))
			{
				flag=true;
				break;
			}





		}


		return flag;

	}
}



