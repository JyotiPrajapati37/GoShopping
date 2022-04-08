package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {

//Declaring fields
	private boolean isPrime=true;
	float charges;
	private static final float deliveryCharges=0.0f;
	
//Defining the method isPrime which return the whether isPrime is true or false	
	public boolean isPrime()
	{
		return isPrime;
	}
	//Declaring the Delivery Charges for the product
	public static float getDeliverycharges() {
		return deliveryCharges;
	}
	
	
//Constructor
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	
	//method for bookProduct
	@Override
	public void bookProduct(float x) {
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Dear Prime user, Your Product charges are: " +charges;
	}
	

	
}
