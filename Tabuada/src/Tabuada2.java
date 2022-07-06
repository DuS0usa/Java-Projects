import java.util.Scanner;
public class Tabuada2 {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int x, resultado;
		
		System.out.println("Digite o número que será multiplicado:");
		x = leia.nextInt();
		
		resultado = x * 1;
		System.out.println(x+" x 1 = "+resultado);
		
		resultado = x * 2;
		System.out.println(x+" x 2 = "+resultado);
		
		resultado = x * 3;
		System.out.println(x+" x 3 = "+resultado);
		
		resultado = x * 4;
		System.out.println(x+" x 4 = "+resultado);
		
		resultado = x * 5;
		System.out.println(x+" x 5 = "+resultado);
		
		resultado = x * 6;
		System.out.println(x+" x 6 = "+resultado);
		
		resultado = x * 7;
		System.out.println(x+" x 7 = "+resultado);
		
		resultado = x * 8;
		System.out.println(x+" x 8 = "+resultado);
		
		resultado = x * 9;
		System.out.println(x+" x 9 = "+resultado);
		
		resultado = x * 10;
		System.out.println(x+" x 10 = "+resultado);
		
		leia.close();
		
	}
}
