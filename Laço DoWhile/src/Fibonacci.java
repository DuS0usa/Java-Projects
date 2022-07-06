import java.util.Scanner;
public class Fibonacci {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int i, n, anterior = 0, atual = 1, proximo;
		
		System.out.println("Digite o número de termos:");
		n = leia.nextInt();
		
		i = n;
		
		do {
			System.out.print(atual+", ");
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
			i--;
		} while (i > 0);
		
		leia.close();
		
	}
}
