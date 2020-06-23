package com.capgemini.oca.corrected;

public class Tool {

	public void export() {
		// TODO Auto-generated method stub
		
	}

}

 class Extoll extends Tool{
	public void export() {
		System.out.println("Hiii");
	}
	public static void main(String[] args) {
		Tool aTool =new Extoll();
		Tool bTool=aTool;
		callExpert(aTool);
	}
	public static void callExpert(Tool aTool) {
		// TODO Auto-generated method stub
		aTool.export();
	}
}
