package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor do salário para obter o valor do imposto: ");

		double salary = sc.nextDouble();
		double tax;

		if (salary < 2000.0) {
			tax = 0.0;
		} else if (salary < 3000.0) {
			tax = (salary - 2000) * 0.08;
		} else if (salary < 4500.0) {
			tax = (salary - 3000.0) * 0.18 + 1000 * 0.08;
		} else {
			tax = (salary - 4500.0) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}
		if (tax == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f", tax);
		}

		sc.close();

	}

}
