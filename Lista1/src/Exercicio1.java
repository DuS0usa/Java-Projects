import java.util.Scanner;
public class Exercicio1 {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		double sal, vale;
		
		System.out.println("Digite o salário bruto:");
		sal = leia.nextDouble();
		
		vale = sal/100*6;
		
		System.out.println("O desconto é de "+vale);
		
		leia.close();
	}
}
