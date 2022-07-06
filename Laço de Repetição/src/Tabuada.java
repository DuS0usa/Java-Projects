import java.util.Scanner;
public class Tabuada {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int i = 1, res, n;
		
		System.out.println("Informe o número:");
		n = leia.nextInt();

		while (i <= 10) {
			res = n * i;
			System.out.println(n+" X "+i+" = "+res);
			i++;
		}
		
		leia.close();
	}
}
