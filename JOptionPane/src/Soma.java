import javax.swing.JOptionPane;

public class Soma {
	public static void main (String args[]) {
		
		double n1, n2, r;
		
		// ENTRADA DOS DADOS//
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o primeiro valor:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o segundo valor:"));
			
		// PROCESSAMENTO DOS DADOS//
		r = n1 + n2;
		
		//SAÍDA DOS DADOS//
		JOptionPane.showMessageDialog(null, "A soma dos valores é: "+r);
		
	}
}
