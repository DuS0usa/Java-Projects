import java.util.Scanner;
import java.lang.Math;

public class Equacao {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		double a, b, c, delta, raiz1, raiz2;
		
		System.out.println("Informe o valor de A:");
		a = leia.nextDouble();
		System.out.println("Informe o valor de B:");
		b = leia.nextDouble();
		System.out.println("Informe o valor de C:");
		c = leia.nextDouble();

		delta = (b*b) - 4 * a * c;
		System.out.println("Seu delta é: "+delta);
		
		if (delta < 0) {
			System.out.println("Não existem raízes reais para a equação.");
		} else if (delta == 0) {
			raiz1 = -b / (2*a);
			System.out.println("Existe apenas uma raiz para a equação, sendo ela: "+raiz1);
			} else {
				raiz1 = (-b + Math.sqrt(delta)) / 2*a;
				raiz2 = (-b - Math.sqrt(delta)) / 2*a;
				System.out.printf("Existe duas raízes reais, sendo elas: "+raiz1+ " e "+raiz2);
				}
		
		leia.close();
	}

}
