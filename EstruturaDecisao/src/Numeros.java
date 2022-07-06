import javax.swing.JOptionPane;

public class Numeros {
	public static void main(String args[]) {
		
		double n1, n2;
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o 1º número","Brincando com Números",JOptionPane.INFORMATION_MESSAGE));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o 2º número","Brincando com Números",JOptionPane.INFORMATION_MESSAGE));
		
		
		if(n1 > n2) {
			JOptionPane.showMessageDialog(null, "O maior número digitado foi: "+n1+"\nO menor número digitado foi: "+n2,"Resposta",JOptionPane.WARNING_MESSAGE);
			
		}else if(n2 > n1) {
			JOptionPane.showMessageDialog(null, "O maior número digitado foi: "+n2+"\nO menor número digitado foi: "+n1,"Resposta",JOptionPane.WARNING_MESSAGE);
			
		} else {
			JOptionPane.showMessageDialog(null, "Os números são iguais.","Resposta",JOptionPane.WARNING_MESSAGE);
		}
		
	}
}
