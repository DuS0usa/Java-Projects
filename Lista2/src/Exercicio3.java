import java.util.Scanner;
public class Exercicio3 {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int n, r;
		
		System.out.println("Informe seu n�mero:");
		n = leia.nextInt();
		
		r = n % 2;
		System.out.println("Seu n�mero � "+n);
		
		if (r == 0) {
			System.out.println("Seu n�mero � PAR!");
		} else {
			System.out.println("Seu n�mero � �MPAR!");
		}
		
		leia.close();
	}
		

}
