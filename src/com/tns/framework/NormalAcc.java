package com.tns.framework;

	public abstract class NormalAcc extends ShopAcc {
//Declaring fields
	private final float deliveryCharges=50;
	float charges;
	
	
// getting deliveryCharges values
	public float getDeliveryCharges() {
		return deliveryCharges;
	}

//Constructor	
public NormalAcc(int accNo, String accNm, float charges, float charges2) {
	super(accNo, accNm, charges);
	this.charges=charges;
}

@Override
public void bookProduct(float f1) {
	
	System.out.println();
}

@Override
public String toString() {
	return "Dear Normal user, Your charges are:" +charges+" with Delivery Charges is: "+ deliveryCharges;
	//return "Dear Normal user, Your charges are: " +charges+ " with Delivery Charges is : "+ deliveyCharges ;
}	
	
}
