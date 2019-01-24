package com.enumPractice.view;

import com.enumPractice.controller.GiantController;
import com.enumPractice.model.Fatiqe;
import com.enumPractice.model.GiantModel;
import com.enumPractice.model.Health;
import com.enumPractice.model.Nourishment;

public class TeastClass {
	
	
	
	

	
	public static void main (String[] args) {
		
		Health health=Health.DEAD;
		Fatiqe fatiqe=Fatiqe.SLEEPING;
		Nourishment nourishment=Nourishment.HUNGRY;
		
		
		GiantModel giantModel =new GiantModel(health,fatiqe,nourishment);
		
		GiantView giantView=new GiantView();
		
		GiantController giantController=new GiantController(giantModel, giantView);

		giantController.updateView();
		
		
	}
	
	
	
}
