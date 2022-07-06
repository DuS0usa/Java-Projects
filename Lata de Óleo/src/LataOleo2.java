import java.util.Scanner;
public class LataOleo2 {
	public static void main (String args[]){
		Scanner leia = new Scanner (System.in);
		
		double a, r, v;
		
		System.out.println("Informe a altura da Lata:");
		a = leia.nextDouble();
		
		System.out.println("Informe o raio da Lata:");
		r = leia.nextDouble();
		
		v = 3.14*r*r*a;
		
		System.out.println("O volume da lata é: "+v);
		
		leia.close();
	}
}
