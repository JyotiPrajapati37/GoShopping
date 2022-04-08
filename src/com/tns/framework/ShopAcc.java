package com.tns.framework;

public abstract class ShopAcc {
	
//Declaring fields
	private int accNo;
	private String accNm;
	private float charges;

//	Getting Account number
	public int getAccNo() {
		return accNo;
	}

//Getting Account Name	
	public String getAccNm() {
		return accNm;
	}
//Setting Account Name	
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

//Getting charges for shopping	
	public float getCharges() {
		return charges;
	}
//Constructor

public ShopAcc(int accNo, String accNm, float charges) {
	super();
	this.accNo = accNo;
	this.accNm = accNm;
	this.charges = charges;
}

//Methods
	public void bookProduct(float a)
	{
		
	}
	
	public void items(float y)
	{
		System.out.println("Moile: 25000\n");
		System.out.println("Laptop: 50000\n");
		System.out.println("Shirt: 1000\n");
	}

	@Override
	public String toString() {
		return accNm;
	}
	


	

}
