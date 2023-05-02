package com.cg.framework;

public abstract class SavingAcc extends BankAcc {

	private boolean isSalaried;
	public static final float MINBAL=500;
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried, float MINBAL ) {
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
	}
	
	public void withdraw(float accBal)
	{
		System.out.println("account balance is :" + accBal);
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
