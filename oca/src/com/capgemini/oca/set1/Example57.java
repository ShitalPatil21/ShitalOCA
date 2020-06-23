package com.capgemini.oca.set1;

public class Example57 {

	public static void main(String[] args) {
      int x=6;
      while(isAvilable(x)) {
    	  System.out.println(--x);
    	  
      }
	}

	private static boolean isAvilable(int x) {
		// TODO Auto-generated method stub
		return --x>0?true:false;
	}

}
