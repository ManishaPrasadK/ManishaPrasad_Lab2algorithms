package com.greatlearning;

import java.util.Scanner;

import com.greatlearning.model.PayMoney;

public class Driver {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the transaction");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Transaction of day"+(i+1));
			arr[i]=sc.nextInt();
		}
		displayTransaction(arr);
		System.out.println();
		System.out.println("Enter the total number of targets that need to acheived");
		int totalTrans=sc.nextInt();
		for(int j=0;j<totalTrans;j++) {
			PayMoney pm=new PayMoney(arr);
			int result=pm.achieveSteps();
			if(result==-1) {
				System.out.println("Given target not achieved");
			}
			else {
				System.out.printf("Target achieved after %d transactions",result);
			}
		}
	}
		public static void displayTransaction(int arr[]) {
			for (int i = 0; i < arr.length; i++) {
				System.out.printf(arr[i]+" ");
			}
		}
		
}
