import java.util.Scanner;
public class FaixaEtaria {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int i, idade, f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0;
		
		for (i=1;i<=15;i++) {
			System.out.println("Informe a idade do "+i+"� usu�rio");
			idade = leia.nextInt();
			
			if (idade <= 15) {
				f1++;
			} else if (idade <= 30) {
				f2++;
				} else if (idade <= 45) {
					f3++;
					} else if (idade <= 60) {
						f4++;
					} else {
						f5++;
					}
		}
		
	
		System.out.println("1� Faixa Et�ria possu�: "+f1+" pessoas.\n2� Faixa Et�ria possu�: "+f2+" pessoas.\n3� Faixa Et�ria possu�: "+f3+" pessoas.\n4� Faixa Et�ria possu�: "+f4+" pessoas.\n5� Faixa Et�ria possu�: "+f5+" pessoas.");
		
		leia.close();
	}
}
