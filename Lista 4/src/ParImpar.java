import java.util.Scanner;
public class ParImpar {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
			int a[], i, par = 0, impar = 0;	
			final int TAM = 10;
			a = new int [TAM];
			
			for(i=0;i<10;i++) {
				System.out.println("Digite o "+(i+1)+"º valor:");
				a[i] = leia.nextInt();
				
					if (a[i] % 2 == 0) {
						par++;
					} else {
						impar++;
					}
			}
			
			System.out.println("Possui "+impar+" números ímpares e "+par+" números pares.");
			
			leia.close();
	}

}
