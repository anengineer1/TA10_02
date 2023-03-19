package custom_exceptions;

public class MyException extends Exception {

	public MyException() {
		super();
	}
	@Override
	public String getMessage() {
		
		System.out.println();
		
		return super.getMessage();
	}
}
