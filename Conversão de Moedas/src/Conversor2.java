import java.util.Scanner;
public class Conversor2 {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		double real, dolar, euro, d, e;
		
		System.out.println("Digite o valor em Real:");
		real = leia.nextDouble();
		
		System.out.println("Informe a cotação do Dólar:");
		dolar = leia.nextDouble();

		System.out.println("Informe a cotação do Euro:");
		euro = leia.nextDouble();
		
		d = real / dolar;
		e = real / euro;
		
		System.out.println("Seu valor em REAl é: "+real+" o valor convertido em DÓLAR é: "+d+" dólares e o valor convertido em EURO é: "+e+" euros!");
			
		leia.close();	
	}
}
