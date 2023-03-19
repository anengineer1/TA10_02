package custom_exceptions;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	public MyException() {
		System.out.println("Excepción capturada con mensaje: Esto es un objeto Exception");
	}
	@Override
	public String getMessage() {
		
		return "Programa terminado";
	}
}
