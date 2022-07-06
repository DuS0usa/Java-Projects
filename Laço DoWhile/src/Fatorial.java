import java.util.Scanner;
public class Fatorial {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int n, i , resultado = 1;
		
		System.out.println("Informe o número:");
		n = leia.nextInt();
		i = n;
		
		do {
			resultado = resultado * n;
			n = n - 1;
			i--;
		} while (i >= 1);
		System.out.println("O fatorial é "+resultado);
		
		leia.close();
	}
}
