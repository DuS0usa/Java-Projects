import java.util.Scanner;
public class Imc {
	public static void main (String args []) {
		Scanner leia = new Scanner (System.in);
		
		double peso, altura, i;
		
		System.out.println("Informe seu PESO: ");
		peso = leia.nextDouble();
		System.out.println("Informe sua ALTURA: ");
		altura = leia.nextDouble();
		
		i = peso / (altura * altura);
		
		if (i <= 18.5) {
			System.out.printf("Seu IMC é %.2f. Você está com Excesso de Magreza!",i);
		} 	else if (i <= 25) {
			System.out.printf ("Seu IMC é %.2f. Você está com o Peso Normal!",i);
			}	else if (i <= 30) {
				System.out.printf("Seu IMC é %.2f. Você está com Excesso de Peso!",i);
				} 	else if (i <= 35) {
					System.out.printf("Seu IMC é %.2f. Você está com Obesidade Grau 1",i);
					} 	else if (i <= 40) {
						System.out.printf("Seu IMC é %.2f. Você está com Obesidade Grau 2",i);
						}	else {
							System.out.printf("Seu IMC é %.2f. Você está com Obesidade Grau 3",i);
							}
		
		leia.close();
		
	}
}
