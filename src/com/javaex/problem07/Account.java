package com.javaex.problem07;

public class Account {

    private String accountNo;
    private int balance;
    
    public Account(String r) {
    	
    }
    //생성자 작성
    public void deposit(int money) {
    	balance+=money;
    }
    public void withdraw(int money) {
    	balance=balance-money;
    }
    public void showBalance() {
    	System.out.println(balance);
    }
    public void setAccountNo(String accountNo) {
    	this.accountNo=accountNo;
    }
    public void setBalance(int balance) {
    	this.balance=balance;
    }
    public String accountNo() {
    	return accountNo;
    }
    public int balance() {
    	return balance;
    }
    
    //필요한 메소드 작성

}
