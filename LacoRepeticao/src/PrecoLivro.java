import javax.swing.JOptionPane;

public class PrecoLivro {
	public static void main(String args[]) {
	
		int n, op = 1;
		
		while(op == 1){
			n = Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE O N�MERO DO LIVRO QUE QUEIRA SABER O PRE�O:\n"
																 +"[1] - JAVA\n[2] - Android\n[3] - C#\n[4] - PHP\n[0] - Encerrar/Cancelar\n","Pre�o dos Livros",JOptionPane.QUESTION_MESSAGE));
			
			switch(n){
				case 0:
					JOptionPane.showMessageDialog(null,"Voc� escolheu a op��o: 0 - Encerrar o programa\nAT� A PR�XIMA!","Pre�o dos Livros",JOptionPane.WARNING_MESSAGE);
					op = 2;
					break;
			
				case 1: 
					JOptionPane.showMessageDialog(null,"Voc� escolheu a op��o: 1 - JAVA\nSeu pre�o � de R$100,00","Pre�o dos Livros",JOptionPane.WARNING_MESSAGE);
					 op = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja continuar?\n1 - SIM  |  2 - N�O","Continuar?",JOptionPane.QUESTION_MESSAGE));
					break;
					
				case 2:
					JOptionPane.showMessageDialog(null,"Voc� escolheu a op��o: 2 - Android\nSeu pre�o � de R$180,00","Pre�o dos Livros",JOptionPane.WARNING_MESSAGE);
					 op = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja continuar?\n1 - SIM  |  2 - N�O","Continuar?",JOptionPane.QUESTION_MESSAGE));
					break;
					
				case 3:
					JOptionPane.showMessageDialog(null,"Voc� escolheu a op��o: 3 - C#\nSeu pre�o � de R$80,00","Pre�o dos Livros",JOptionPane.WARNING_MESSAGE);
					 op = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja continuar?\n1 - SIM  |  2 - N�O","Continuar?",JOptionPane.QUESTION_MESSAGE));
					break;
					
				case 4:
					JOptionPane.showMessageDialog(null,"Voc� escolheu a op��o: 4 - PHP\nSeu pre�o � de R$60,00","Pre�o dos Livros",JOptionPane.WARNING_MESSAGE);
					 op = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja continuar?\n1 - SIM  |  2 - N�O","Continuar?",JOptionPane.QUESTION_MESSAGE));
					break;
				
				default:
					JOptionPane.showMessageDialog(null,"ESSA OP��O � INV�LIDA!\nTENTE NOVAMENTE.","ERROR",JOptionPane.ERROR_MESSAGE);
					break;
			}
		}
		JOptionPane.showMessageDialog(null,"O programa foi encerrado, obrigado por us�-lo!\nAt� a pr�xima ;)","Finalizando Sistema",JOptionPane.INFORMATION_MESSAGE);
	}
}
