package com.tns.framework;

public abstract class ShopFactory {

	public abstract PrimeAcc getPrimeAccount(int accNo, String accNm, float charges, boolean isPrime);
	public abstract NormalAcc getNormalAccount(int accNo, String accNm, float charges, boolean isPrime);
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		return null;
	}
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		return null;
	}
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		return null;
	}
}
