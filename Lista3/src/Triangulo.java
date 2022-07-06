import java.util.Scanner;
public class Triangulo {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int a, b, c;
		
		System.out.println("Informe a medida do valor A:");
		a = leia.nextInt();
		System.out.println("Informe a medida do valor B:");
		b = leia.nextInt();
		System.out.println("Informe a medida do valor C:");
		c = leia.nextInt();

		if (a > b + c || b > c + a || c > b + a) {
			System.out.println("Esse n�o � um tri�ngulo!");
			} else if (a != b && a != c && b != c) {
				System.out.println("Seu tri�ngulo � Escaleno, ou seja, os tr�s lados s�o diferentes!");
				} else if (a == b && b == c) {
					System.out.println("Seu tri�ngulo � Equil�tero, ou seja, possui todos lados iguais.");
					} else {
						System.out.println("Seu tri�ngulo � Is�sceles, ou seja, possui dois lados iguais e um diferente.");
						}
		
		leia.close();											
	}
}
