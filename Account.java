package com.git;

import java.util.Scanner;

public class Account {
		String cname;
		int cid;
		int balance;
		int privioustransaction;
		
		public Account(String name,int id) {
			cname=name;
			cid=id;
		}
		
		
public void deposit(int amount) {
	if(amount!=0) {
	balance+=amount;
	privioustransaction+=amount;
}}


public void withdraw(int amount) {
	if(amount!=0) {
	balance-=amount;
	privioustransaction=amount;
}}


void getprivioustrancation() {
	System.out.println("Withdrawn is :" + privioustransaction);
	/*if(privioustransaction>0) {
		System.out.println("diposited :" + privioustransaction);
	}
	else if(privioustransaction<0) {
		System.out.println("withdrawn :" + Math.abs(privioustransaction));
	}*/
}
 

void showmenu() {
	char a ='\0';
Scanner sc=new Scanner(System.in);
System.out.println("---------------------------------------------");
System.out.println("A : check balance ");
System.out.println("B : diposite ");
System.out.println("C : withdraw ");
System.out.println("D : privioustransaction ");
System.out.println("E : exit ");
System.out.println("---------------------------------------------");

do{
	System.out.println("enter option :");
	a=sc.next().charAt(0);

switch(a)
{
case 'A':
	System.out.println("balance :" + balance);
	break;
case 'B':
	System.out.println("enter an amount to deposit");
	 int amount=sc.nextInt();
	 deposit(amount);
	 break;
case 'C':
	System.out.println("enter an amount to withdraw ");
	int amount2=sc.nextInt();
	if(balance>=amount2) {  //Amount checking for transaction (comparing balance to withdraw) otherwise prints else part
	withdraw(amount2);}
	else {
		System.out.println("No sufficient Amount");
	}
	break;
case 'D':
	getprivioustrancation();
	break;
case 'E':
	break;
default :
	System.out.println("invalid ! please enter again");
	break;
}
}while(a!='E');
System.out.println("thank you for using our service ");

}}
