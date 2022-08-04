package com.abbas.SpringFirst;

public class ServiceProvider
{
	Bulb bulb;
	
   public Bulb getBulb() {
		return bulb;
	}

	public void setBulb(Bulb bulb) {
		this.bulb = bulb;
	}

public String askForBulb()
   {
	   return bulb.getBulb();
   }
}
