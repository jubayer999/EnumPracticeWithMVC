package com.enumPractice.view;

import com.enumPractice.controller.GiantController;
import com.enumPractice.model.GiantModel;

public class GiantView {


	public void GiantView() {

	}
	
	public void displayGiant(GiantModel giantModel)
	{

			System.out.println(giantModel.getHealth());
			System.out.println(giantModel.getFatiqe());
			System.out.println(giantModel.getNaurishment());

	}

}
