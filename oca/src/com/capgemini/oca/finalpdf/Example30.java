package com.capgemini.oca.finalpdf;

import java.util.ArrayList;

public class Example30 {

	public static void main(String[] args) {
		ArrayList myList=new ArrayList();
		String myArray[];
		try {
			while(true) {
				myList.add("my string");
			}
			
		} catch (RuntimeException e) {
			System.out.println("RUN ty exception");
		}
		catch (Exception e) {
			System.out.println("ex");
		}
        System.out.println("hhjjj");
		
	}

}
