package pt.dneves.exception;

import java.io.IOException;

public class CustomException extends IOException {

	private static final long serialVersionUID = -3309269026353335916L;

	public CustomException(String message, IOException exception) {
		super(message, exception);
	}

}
