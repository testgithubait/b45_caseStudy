package com.cg.application;

import com.cg.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried, float MINBAL) {
		super(accNo, accNm, accBal, isSalaried, MINBAL);
		// TODO Auto-generated constructor stub
	}

	private static final float MINBAL=500;
	

	

	
	




	public void withdraw(float accBal)
	{
		System.out.println("dear saving account user, after withdrawing your balance account is :" +accBal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
