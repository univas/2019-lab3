package br.edu.univas.exception;

public class MyException extends Exception {

	public MyException(String message) {
		super(message);
	}
	
	public MyException(String message, Throwable th) {
		super(message, th);
	}
	
}
