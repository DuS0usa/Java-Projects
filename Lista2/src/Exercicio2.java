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
	System.out.println("A área é "+area+" metros");
	
	if (area < 110*110) {
		System.out.println("O campo não está no padrão FIFA");
	} else {
		System.out.println("O campo está no padrão FIFA");
	}
	
	leia.close();
	
	}
}
