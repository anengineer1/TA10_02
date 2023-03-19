package main;

import custom_exceptions.MyException;

public class TA10_02_App {

	public static void main(String[] args) {
		
		try {
			System.out.println("Mensaje mostrado por pantalla");
			throw new MyException();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
