package com.sridharjammalamadaka;

public class DivideByZeroException extends ArithmeticException {

	private static final long serialVersionUID = -1928865110738573752L;

	public DivideByZeroException(String string) {
		super(string);
	}
	
	public DivideByZeroException() {
		super();
	}

}
