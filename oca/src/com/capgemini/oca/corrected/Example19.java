package com.capgemini.oca.corrected;

public class Example19 {
     void readCard(int cardNo)throws Exception{
    	 System.out.println("Reading card");
     }
     void checkCard(int cardNo)throws RuntimeException{
    	 System.out.println("Checking card");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Example19 ex=new Example19();
      int cardNo=122;
      ex.checkCard(cardNo);
      //ex.readCard(cardNo);
	}

}
