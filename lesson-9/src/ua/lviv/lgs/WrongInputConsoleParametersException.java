package ua.lviv.lgs;

public class WrongInputConsoleParametersException extends Exception {

	private String description;

	public WrongInputConsoleParametersException(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	

}
