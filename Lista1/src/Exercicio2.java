import java.util.Scanner;
public class Exercicio2 {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		double raio, area;
		
		System.out.println("Digite o raio:");
		raio = leia.nextDouble();
		
		area = 3.14*raio*raio;
		
		System.out.println("A área da circunferência é "+area);
		
		leia.close();
	}
}
