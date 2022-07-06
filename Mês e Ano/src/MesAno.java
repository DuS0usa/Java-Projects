
public class MesAno {
	public static void main (String args[]) {
		
		int d, a, m, valorMes, valorAno;
		
		d = 730;
		valorMes = 30;
		valorAno = 365;
		
		m = d / valorMes;
		a = d / valorAno;
		
		System.out.println(m+" Meses e "+a+" Anos.");
	}
}
