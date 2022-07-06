import java.util.Scanner;
public class DescontoINSS {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		double sal, desc;
		int i = 1;
		
		while (i <= 4) {
			System.out.println("Informe o salário:");
			sal = leia.nextDouble();
			
			if (sal >= 2000.00) {
				desc = sal * 11/ 100;
				System.out.printf("Seu desconto do INSS é de: R$%.2f\n",desc);
			} else {
				desc = sal * 8.5/ 100;
				System.out.printf("Seu desconto do INSS é de: R$%.2f\n",desc);
				}
			
			i++;

		}	
		leia.close();
		
		
	}
	

}
