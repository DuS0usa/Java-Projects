import java.util.Scanner;
public class Fatorial {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int i, n, resultado = 1;
		
		System.out.println("Informe o número:");
		n = leia.nextInt();
		i = n;

		while  (i > 0) {
		resultado = n * resultado;
		n = n - 1;
		i--;
		}
		System.out.println(resultado);
		
		leia.close();
	}
}
