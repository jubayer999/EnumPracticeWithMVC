package com.enumPractice.model;

public class GiantModel {
	
	Health health;
	Fatiqe fatiqe;
	Nourishment naurishment;
	
	
	
	public GiantModel() {
		// TODO Auto-generated constructor stub
	}
	public GiantModel(Health health, Fatiqe fatiqe, Nourishment naurishment) {
		
		this.health = health;
		this.fatiqe = fatiqe;
		this.naurishment = naurishment;
	}
	public Health getHealth() {
		return health;
	}
	public void setHealth(Health health) {
		this.health = health;
	}
	public Fatiqe getFatiqe() {
		return fatiqe;
	}
	public void setFatiqe(Fatiqe fatiqe) {
		this.fatiqe = fatiqe;
	}
	public Nourishment getNaurishment() {
		return naurishment;
	}
	public void setNaurishment(Nourishment naurishment) {
		this.naurishment = naurishment;
	}
	@Override
	public String toString() {
		return "GiantModel [health=" + health + ", fatiqe=" + fatiqe + ", naurishment=" + naurishment + "]";
	}
	
	
	
	
//	public void giantModel(Health h,Fatiqe f,Nourishment n) {
//
//	}
//	
	
	
	
	

}
