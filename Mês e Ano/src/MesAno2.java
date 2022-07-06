import java.util.Scanner;
public class MesAno2 {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		int a, m, d;
		
		System.out.println("Informe os dias a serem convertidos:");
		d = leia.nextInt();
		
		a = d / 365;
		m = d / 30;
		
		System.out.println(d+" dias convertidos em anos são: "+a+" ano(s) e convertido em meses são: "+m+" meses");
		
		leia.close();		
	}
}
