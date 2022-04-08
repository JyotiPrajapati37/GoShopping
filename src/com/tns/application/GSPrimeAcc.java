package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

//fields
	private static final float charges=0;
//getting the method of Charges	
	public float getCharges() {
		return charges;
	}

	//Constructor
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookProduct(float f) {
		// TODO Auto-generated method stub
		super.bookProduct(f);
	}

	@Override
	public String toString() {
		
		return super.toString();
	}
	

	
}

