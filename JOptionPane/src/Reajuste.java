import javax.swing.JOptionPane;

public class Reajuste {
	public static void main(String args[]) {
		
		double salAntigo, salAtual, valReajuste;
		String nome;
		
		
		// ENTRADA DE DADOS//
		nome = JOptionPane.showInputDialog(null, "Informe seu nome:","Reajuste do Sal�rio",JOptionPane.QUESTION_MESSAGE);
		salAntigo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu sal�rio (Inteiro):","Reajuste do Sal�rio",JOptionPane.QUESTION_MESSAGE));
		
		
		// PROCESSAMENTO //
		valReajuste = (salAntigo / 100) * 10;
		salAtual = salAntigo + valReajuste;
		
		
		// SAIDA //
		JOptionPane.showMessageDialog(null, "Nome: "+nome+
											"\nSal�rio: "+salAntigo+
											"\nPercentual de Reajuste: 10%"+
											"\nValor do Reajuste: "+valReajuste+
											"\nSal�rio Reajustado: "+salAtual,"Resultado",JOptionPane.WARNING_MESSAGE);
	}
}



