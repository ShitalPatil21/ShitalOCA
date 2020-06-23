package com.capgemini.oca.set1;

public class Example42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String strs []= {"A","B"};
    int idx=0;
    for(String s:strs) {
    	strs[idx].concat("element"+idx);
    	idx++;
    }
    for ( idx = 0; idx < strs.length; idx++) {
		System.out.println(strs[idx]);
	}
	}

}
