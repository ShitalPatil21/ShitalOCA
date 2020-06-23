package com.capgemini.oca.corrected;

public class Example129 {

	int x;
	int y;
	public Example129(int x,int y) {
	intialize(x,y);
	}
	public void intialize(int x,int y) {
		this.x=x*x;
		System.out.println(this.x=x*x);
		this.y=y*y;
	}
	
	public static void main(String[] args) {
		int x=3,y=5;
		Example129 ex=new Example129(x, y);
		System.out.println(x+""+y);

	}

}
