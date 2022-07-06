import java.util.Scanner;
public class Media2 {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int n1, n2, n3, media;
		
		System.out.println("Digite as 3 notas:");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		media = (n1+n2+n3)/3;

		System.out.println("A média é: "+media);
		
		leia.close();

		
		
	}
}
