
public class Somatoria {
	public static void main (String args[]) {
		
		int i = 1, soma = 0;
		
		while (i <= 100) {
			soma = i + soma;
			i++;
		}
		System.out.println("A soma dos n�meros d�: "+soma);
	}
}
