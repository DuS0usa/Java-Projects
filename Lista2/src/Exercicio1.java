import java.util.Scanner;
public class Exercicio1 {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		double salario, salMinimo;
		
		System.out.println("Informe seu salário: ");
		salario = leia.nextDouble();
		System.out.println("Informe o valor atual do Salário Mínimo:");
		salMinimo = leia.nextDouble();

		if (salario < salMinimo) {
			System.out.println("Seu salário é insuficiente com base no Salário Mínimo.");
		} else {
			System.out.println("Seu salário é suficiente com base no Salário Mínimo.");
		}
		
		leia.close();
	}

}
