import java.util.Scanner;
public class Exercicio3 {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int n, d, t ;
		
		System.out.println("Digite seu n�mero:");
		n = leia.nextInt();
		
		d = n*2;
		t = n*3;
		
		System.out.println("O seu n�mero � "+n+" o DOBRO dele � "+d+" e o TRIPLO � "+t);
		
		leia.close();
	}
}
