package com.capgemini.oca.finalpdf;

import java.io.IOException;
import java.nio.CharBuffer;

public interface Readble extends Downloadble {

	public void readBook();
}
abstract class Book implements Readable{
	public void readBook() {
		System.out.println("ReadBook");
	}
}
abstract class EBook extends Book{

	public void readBook() {
		
	}
	
}
