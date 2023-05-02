package com.cg.application;

import com.cg.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float creditLimit)
	{
		System.out.println("dear current account user, after withdraw your account balance : " +getAccBal()+ "and credit limit is" +creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
