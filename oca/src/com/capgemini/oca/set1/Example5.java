package com.capgemini.oca.set1;

public class Example5 {

	public static void main(String[] args) {
		int num1 []= {1,2,3};
		int num2 []= {1,2,3,4};
		num2=num1;
		for(int x:num2) {
			System.out.println(x);
		}
	}

}
