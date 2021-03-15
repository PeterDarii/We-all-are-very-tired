package com.class13;

public class BankApp {

	public static void main(String[] args) {
		
		Accaunt ghulamsAccount=new Accaunt();
		ghulamsAccount.accountNumber="123";
		ghulamsAccount.userName="Ghulam123";
		ghulamsAccount.password="pass123";
		ghulamsAccount.balance=1400;
		ghulamsAccount.login("Ghulam123", "pass123");
	}

}
