import java.util.Scanner;
public class Exercicio1 {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		double salario, salMinimo;
		
		System.out.println("Informe seu sal�rio: ");
		salario = leia.nextDouble();
		System.out.println("Informe o valor atual do Sal�rio M�nimo:");
		salMinimo = leia.nextDouble();

		if (salario < salMinimo) {
			System.out.println("Seu sal�rio � insuficiente com base no Sal�rio M�nimo.");
		} else {
			System.out.println("Seu sal�rio � suficiente com base no Sal�rio M�nimo.");
		}
		
		leia.close();
	}

}
