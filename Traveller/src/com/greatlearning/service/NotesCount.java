package com.greatlearning.service;

public class NotesCount {
	//to count the notes
	public static void numberOfDenomination(int notes[],int amount) {
		int[] notesCounter=new int[notes.length];
		try {
			for(int i=0;i<notes.length;i++) {
				if(amount>=notes[i]) {
					notesCounter[i]=amount/notes[i];
					amount=amount-notes[i]*notesCounter[i];
				}
			}
			if(amount>0) {
				System.out.println("Exact amount cannot be given with highest denomination");
			}
			else {
				System.out.println("Your payment approach inorder to give minimum number of notes:");
				for (int i = 0; i < notesCounter.length; i++) {
					if(notesCounter[i]!=0) {
						//to print the notes and number of notes
						System.out.println(notes[i]+ " : "+notesCounter[i]);
					}
				}
			}
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println("Arithmetic Exception occured "+e);
			
		}
		catch(Exception e) {
			System.err.println("Exception occured "+e);
		}
	}
}
