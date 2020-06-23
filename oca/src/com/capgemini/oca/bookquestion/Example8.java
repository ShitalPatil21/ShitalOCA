package com.capgemini.oca.bookquestion;

public class Example8 {
public static void main(String[] args) {
	String s1="abc";
	String s2=s1;
	s1 +="d";
	System.out.println(s1+""+s2+""+(s1==s2));
	
}
}
