import java.util.Scanner;
public class AreaTriangulo2 {
	public static void main (String args[]) {
	Scanner leia =new Scanner (System.in);
	
	double a, b, area;
	
	System.out.println("Digite a altura:");
	a = leia.nextDouble();
	
	System.out.println("Digite a base:");
	b = leia.nextDouble();
	
	area = (b*a)/2;
	
	System.out.println("Sua área é "+area);
	
	leia.close();
	
	
	
	}
	
}
