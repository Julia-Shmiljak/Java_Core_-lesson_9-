package ua.lviv.lds.myExseption;

public class Methods {
	private static int a;
	private static int b;

	public Methods(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public final int getA() {
		return a;
	}

	public final int getB() {
		return b;
	}

	double coutPlus() throws MyException {
		Methods.checkNumber();
		return a + b;
	}

	double counMinus() throws MyException {
		Methods.checkNumber();
		;
		return a - b;
	}

	double countDevide() throws MyException {
		Methods.checkNumber();
		return a * b;
	}

	double countMultiply() throws MyException {
		Methods.checkNumber();
		return a / b;
	}

	public static void countResult(double result) {
		System.out.println("Result: " + result);
	}

	static void checkNumber() throws MyException {
		if ((a < 0) && (b < 0)) {
			throw new IllegalArgumentException();
		}

		if (((a == 0) && (b != 0)) || ((a != 0) && (b == 0))) {
			throw new ArithmeticException();
		}
		if ((a == 0) && (b == 0)) {
			throw new IllegalArgumentException();
		}
		if ((a > 0) && (b > 0)) {
			String message = "Oh, something went wrong";
			throw new MyException(message);
		}

	}
}
