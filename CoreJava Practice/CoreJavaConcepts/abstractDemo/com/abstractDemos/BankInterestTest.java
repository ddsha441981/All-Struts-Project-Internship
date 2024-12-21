package com.abstractDemos;

public class BankInterestTest {

	public static void main(String[] args) {
		
		PnbBank pnb = new PnbBank();
		SbiBank sbi = new SbiBank();
		HdfcBank hdfc = new HdfcBank();
		
		pnb.bankInteresrt();
		sbi.bankInteresrt();
		hdfc.bankInteresrt();
	}
}
