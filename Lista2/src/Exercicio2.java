import java.util.Scanner;
public class Exercicio2 {
	public static void main (String args[]) {
	Scanner leia = new Scanner (System.in);
	
	double a, l, area;
	
	System.out.println("Informe a Altura do campo:");
	a = leia.nextDouble();
	System.out.println("Informe a Largura do campo:");
	l = leia.nextDouble();

	area = l * a;
	System.out.println("A �rea � "+area+" metros");
	
	if (area < 110*110) {
		System.out.println("O campo n�o est� no padr�o FIFA");
	} else {
		System.out.println("O campo est� no padr�o FIFA");
	}
	
	leia.close();
	
	}
}
