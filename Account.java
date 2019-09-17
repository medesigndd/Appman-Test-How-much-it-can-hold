package Ass12;

import java.util.Date;

public class Account {
	protected String name = "";
	protected int id = 0;
	protected double balance = 0.0;
	protected double annualInterestRate = 0;
	protected Date dateCreated;
	
	public Account() {
		dateCreated = new Date();
	}
	
	public Account(String name, int id, double balance, double annualInterestRate) {
		this.name = name;
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = new Date();
	}
	
	public int  getId() {
		return id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}

	public double withdraw(double amount) {
		double withdrawAmount = amount;
		if (balance >= amount) {
			balance -= amount;
		} else {
			withdrawAmount = balance;
			balance = 0;
		}
		return withdrawAmount;
	}
	
	public double deposit(double amount) {
		balance += amount;
		
		return balance;
	}
	public String getName() {
		return name;
	}
	
	public  String toString() {
		String str = "Name: " + name + " Account id: " + id + " Balance = " + balance + " Annual Interest Rate = " + annualInterestRate + "% " + "Date Created = " + dateCreated;
		return str;
	}
}
