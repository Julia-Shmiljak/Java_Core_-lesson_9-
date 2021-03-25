package ua.lviv.lds.myExseption;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws MyException {
		Scanner scanner = new Scanner(System.in);

		int a;
		int b;

		System.out.println("¬вед≥ть число 'a': ");

		if (scanner.hasNextInt()) {
			a = scanner.nextInt();

			System.out.println("¬вед≥ть число 'b': ");

			if (scanner.hasNextInt()) {
				b = scanner.nextInt();
				Methods calc = new Methods(a, b);

				Methods.countResult(calc.coutPlus());
				Methods.countResult(calc.counMinus());
				Methods.countResult(calc.countMultiply());
				Methods.countResult(calc.countDevide());
			} else
				System.out.println("¬вед≥ть число...");

		} else
			System.out.println("¬вед≥ть ц≥ле число");
	}

}
