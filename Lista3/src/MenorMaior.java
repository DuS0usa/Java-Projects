import java.util.Scanner;
public class MenorMaior {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int a, b, c;
		
		System.out.println("Informe o valor do A:");
		a = leia.nextInt();
		System.out.println("Informe o valor do B:");
		b = leia.nextInt();
		System.out.println("Informe o valor do C:");
		c = leia.nextInt();
		
		if (a < b && a < c && b < c) {
			System.out.println("Seus valores em forma crescente é "+a+", "+b+", "+c);
		} else if (a > b && b < c && a < c){
			System.out.println("Seus valores em forma crescente é "+b+", "+a+", "+c);
			} else if (a > c && b > c && b < a) {
				System.out.println("Seus valores em forma crescente é "+c+", "+b+", "+a);
				} else if (a < b && b > c && c < a){
					System.out.println("Seus valorres em forma crescente é "+c+", "+a+", "+b);
					} else if (a < b && a < c && b > c) {
						System.out.println("Seus valores em forma crescente é "+a+", "+c+", "+b);
						} else {
							System.out.println("Seus valores em forma crescente é "+b+", "+c+", "+a);
							}
		leia.close();
	}
}
