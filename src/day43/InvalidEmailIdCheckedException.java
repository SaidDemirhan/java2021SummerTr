package day43;

public class InvalidEmailIdCheckedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidEmailIdCheckedException(String message) {// parametreli const creat ettik ki bu class ta olusan
		// object ile class tan ve parent inden fiel ve variable call edebilelim.

		super(message);
	}

}
