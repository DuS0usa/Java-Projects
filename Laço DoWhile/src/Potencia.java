import java.util.Scanner;
public class Potencia {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int base, expoente, resultado = 1, i;
		
		System.out.println("Informe a base:");
		base = leia.nextInt();
		System.out.println("Informe o expoente:");
		expoente = leia.nextInt();
		
		i = expoente;
		
		do {
			resultado = resultado * base;
			i--;
		} while (i > 0);
		System.out.println(resultado);
		
		leia.close();
	}
}
