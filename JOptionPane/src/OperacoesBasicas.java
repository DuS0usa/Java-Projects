import javax.swing.JOptionPane;

public class OperacoesBasicas {
	public static void main(String args[]) {
		
		double n1, n2, soma, divi, multi, sub;
		
		// ENTRADA DOS DADOS//
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro valor:","Opera��es B�sicas",JOptionPane.QUESTION_MESSAGE));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo valor:","Opera��es B�sicas",JOptionPane.QUESTION_MESSAGE));
		
		
		// PROCESSAMENTO DOS DADOS//
		soma = n1 + n2;
		sub = n1 - n2;
		multi = n1 * n2;
		divi = n1 / n2;
		
		
		//SA�DA DE DADOS//
		JOptionPane.showMessageDialog(null, "A SOMA dos valores �: "+soma+
											"\nA SUBTRA��O dos valores �: "+sub+
											"\nA MULTIPLICA��O dos valores �: "+multi+
											"\nA DIVIS�O dos valores �: "+divi,"Resultado",JOptionPane.WARNING_MESSAGE);
		
	}
}




