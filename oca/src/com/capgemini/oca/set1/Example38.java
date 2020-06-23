package com.capgemini.oca.set1;

public class Example38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str1="Java";
      String str2[]= {"J","a","v","a"};
      String str3="";
      for (String str4 : str2) {
		str3=str3+str4;
	}
      boolean b1=(str1.equals(str3));
      boolean b2=(str1==str3);
      System.out.println(b1);
       System.out.println(b2);
	}

}
