package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		
		SavingAcc sa=new MMSavingAcc(212, "savings", 5200, true, 5000);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		
		CurrentAcc ca=new MMCurrentAcc(112, "current", 23000, 4000);
		ca.withdraw(ca.getCriditLimit());
		ca.toString();
		
	}

}
