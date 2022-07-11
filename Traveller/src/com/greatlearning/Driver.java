package com.greatlearning;

import java.util.Scanner;

import com.greatlearning.model.Currency;
import com.greatlearning.service.NotesCount;
import com.greatlearning.service.SortDenom;

public class Driver {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of currency denominations");
		int numberOfDenominations=sc.nextInt();
		int denominations[]=new int[numberOfDenominations];
		System.out.println("Enter the currency denomination values");
		for (int i = 0; i < denominations.length; i++) {
			denominations[i]=sc.nextInt();
		}
		System.out.println("Enter the amount which you want to pay");
		int amount=sc.nextInt();
		//to print the denominations in the given order
		for (int i : denominations) {
			System.out.println(i+" ");	
		}
		System.out.println();
		Currency currency=new Currency(denominations,numberOfDenominations);
		SortDenom.sort(currency.denominations, 0, numberOfDenominations-1);
		//to print the denominations in sorted order
		for(int i=0;i<numberOfDenominations;i++) {
			System.out.print(currency.denominations[i]+" ");
		}
		System.out.println();
		NotesCount.numberOfDenomination(currency.denominations, amount);
		
	}
}
