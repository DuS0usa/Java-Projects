import java.util.Scanner;
public class Conversor2 {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		double real, dolar, euro, d, e;
		
		System.out.println("Digite o valor em Real:");
		real = leia.nextDouble();
		
		System.out.println("Informe a cota��o do D�lar:");
		dolar = leia.nextDouble();

		System.out.println("Informe a cota��o do Euro:");
		euro = leia.nextDouble();
		
		d = real / dolar;
		e = real / euro;
		
		System.out.println("Seu valor em REAl �: "+real+" o valor convertido em D�LAR �: "+d+" d�lares e o valor convertido em EURO �: "+e+" euros!");
			
		leia.close();	
	}
}
