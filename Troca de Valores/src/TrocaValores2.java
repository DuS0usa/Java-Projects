import java.util.Scanner;
public class TrocaValores2 {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int a, b, c;
		
		System.out.println("Digite os valores a ser invertidos:");
		a = leia.nextInt();
		b = leia.nextInt();

		c = a;
		a = b;
		b = c;
		
		System.out.println("Seus valores s�o A = "+a+" e B = "+b+", os valores est�o invertidos!");
		
		leia.close();
	}
}
