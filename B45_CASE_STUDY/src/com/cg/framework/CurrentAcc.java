package com.cg.framework;

public abstract class CurrentAcc extends BankAcc 
{

	private final float creditLimit;
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, creditLimit);
		this.creditLimit=creditLimit;
	}
	public float getCriditLimit() {
		return creditLimit;
	}
	
	public void withdraw(float creditLimit )
	{
		System.out.println("creditlimit is :" + creditLimit);
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
