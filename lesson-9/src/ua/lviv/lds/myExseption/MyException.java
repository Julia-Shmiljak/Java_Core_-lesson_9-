package ua.lviv.lds.myExseption;

public class MyException extends Exception {

	private String message;

	public MyException(String message) {
		super();
		this.message = message;
	}

	public final String getMessage() {
		return message;
	}

}
