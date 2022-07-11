package com.greatlearning.model;

import java.util.Scanner;

public class PayMoney {
	int arr[];
	Scanner sc=new Scanner(System.in);
	public PayMoney(int[] arr) {
		this.arr=arr;
		}

	public int achieveSteps() {
		int sum=0;
		System.out.println();
		System.out.println("Enter the target to be achieved");
		int target=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum>=target) {
				return i+1;
			}
			else {
				sum+=arr[i];
			}
		}
		return -1;
	}
}
