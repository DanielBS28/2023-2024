package examendanielbaldazosanchez;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double salariobruto;
		double salarioneto;
		char contrato;

		do {
			System.out.println("Dime que tipo de contrato tienes");
			contrato = teclado.next().charAt(0);

			if (contrato == 'A' || contrato == 'a') {
				System.out.println("Has elegido el tipo de contrato A");
				System.out.println("Dime cual es tu salario bruto para calcular tu salario neto");
				salariobruto = teclado.nextDouble();
				salarioneto = salariobruto - (salariobruto * 0.15) - (salariobruto * 0.10);
				System.out.printf("Tu salario neto es: %.2f", salarioneto);
				System.out.print("€");

			} else if (contrato == 'B' || contrato == 'b') {
				System.out.println("Has elegido el tipo de contrato B");
				System.out.println("Dime cual es tu salario bruto para calcular tu salario neto");
				salariobruto = teclado.nextDouble();
				if (salariobruto < 1000) {
					salarioneto = salariobruto - (salariobruto * 0.05) - (salariobruto * 0.10);
					System.out.printf("Tu salario neto es: %.2f", salarioneto);
					System.out.print("€");
				} else if (salariobruto >= 1000 && salariobruto <= 2000) {
					salarioneto = salariobruto - (salariobruto * 0.10) - (salariobruto * 0.10);
					System.out.printf("Tu salario neto es: %.2f", salarioneto);
					System.out.print("€");
				} else if (salariobruto > 2000) {
					salarioneto = salariobruto - (salariobruto * 0.20) - (salariobruto * 0.10);
					System.out.printf("Tu salario neto es: %.2f", salarioneto);
					System.out.print("€");
				}

			} else if (contrato == 'C' || contrato == 'c') {
				System.out.println("Has elegido el tipo de contrato C");
				System.out.println("Dime cual es tu salario bruto para calcular tu salario neto");
				salariobruto = teclado.nextDouble();
				if (salariobruto < 1500) {
					salarioneto = salariobruto - (salariobruto * 0.10) - (salariobruto * 0.05);
					System.out.printf("Tu salario neto es: %.2f", salarioneto);
					System.out.print("€");
				} else if (salariobruto >= 1500 && salariobruto <= 4000) {
					salarioneto = salariobruto - (salariobruto * 0.10) - (salariobruto * 0.15);
					System.out.printf("Tu salario neto es: %.2f", salarioneto);
					System.out.print("€");
				} else if (salariobruto > 4000 && salariobruto <= 10000) {
					salarioneto = salariobruto - (salariobruto * 0.10) - (salariobruto * 0.20);
					System.out.printf("Tu salario neto es: %.2f", salarioneto);
					System.out.print("€");
				} else {
					salarioneto = salariobruto - (salariobruto * 0.10) - (salariobruto * 0.25);
					System.out.printf("Tu salario neto es: %.2f", salarioneto);
					System.out.print("€");
				}
			} else
				System.out.println("Has elegido un tipo de contrato erroneo ");
		} while (contrato != 'A' && contrato != 'a' && contrato != 'B' && contrato != 'b' && contrato != 'C'
				&& contrato != 'c');
	}

}
