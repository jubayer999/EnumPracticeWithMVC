package com.enumPractice.controller;

import com.enumPractice.model.Fatiqe;
import com.enumPractice.model.GiantModel;
import com.enumPractice.model.Health;
import com.enumPractice.model.Nourishment;
import com.enumPractice.view.GiantView;

public class GiantController {
	
	GiantModel giantModel = new GiantModel();
	GiantView giantView = new GiantView();
	
	public GiantController(GiantModel giantModel, GiantView giantView) {
		
		this.giantModel = giantModel;
		this.giantView = giantView;
	}
	
	
	public void updateView() {
		
		
		giantView.displayGiant(giantModel);
	}
	//health=giantModel.getHealth();
	
	
	
	

	
	
	
}
