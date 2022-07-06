import java.util.Scanner;
public class Exercicio3 {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int n, d, t ;
		
		System.out.println("Digite seu número:");
		n = leia.nextInt();
		
		d = n*2;
		t = n*3;
		
		System.out.println("O seu número é "+n+" o DOBRO dele é "+d+" e o TRIPLO é "+t);
		
		leia.close();
	}
}
