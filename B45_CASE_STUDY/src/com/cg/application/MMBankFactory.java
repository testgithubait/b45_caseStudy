package com.cg.application;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public abstract class MMBankFactory extends BankFactory {
	public SavingAcc geyNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary, float MINBAL)
	{
		MMSavingAcc mmsaving=new MMSavingAcc(accNo, accNm, accBal, isSalary, MINBAL);
		return mmsaving;
	}
	
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit)
	{
		MMCurrentAcc mmcurrent=new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return mmcurrent;
	}
}
