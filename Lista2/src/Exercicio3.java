import java.util.Scanner;
public class Exercicio3 {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int n, r;
		
		System.out.println("Informe seu número:");
		n = leia.nextInt();
		
		r = n % 2;
		System.out.println("Seu número é "+n);
		
		if (r == 0) {
			System.out.println("Seu número é PAR!");
		} else {
			System.out.println("Seu número é ÍMPAR!");
		}
		
		leia.close();
	}
		

}
