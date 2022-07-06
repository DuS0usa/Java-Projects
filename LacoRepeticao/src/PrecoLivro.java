import javax.swing.JOptionPane;

public class PrecoLivro {
	public static void main(String args[]) {
	
		int n, op = 1;
		
		while(op == 1){
			n = Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE O NÚMERO DO LIVRO QUE QUEIRA SABER O PREÇO:\n"
																 +"[1] - JAVA\n[2] - Android\n[3] - C#\n[4] - PHP\n[0] - Encerrar/Cancelar\n","Preço dos Livros",JOptionPane.QUESTION_MESSAGE));
			
			switch(n){
				case 0:
					JOptionPane.showMessageDialog(null,"Você escolheu a opção: 0 - Encerrar o programa\nATÉ A PRÓXIMA!","Preço dos Livros",JOptionPane.WARNING_MESSAGE);
					op = 2;
					break;
			
				case 1: 
					JOptionPane.showMessageDialog(null,"Você escolheu a opção: 1 - JAVA\nSeu preço é de R$100,00","Preço dos Livros",JOptionPane.WARNING_MESSAGE);
					 op = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja continuar?\n1 - SIM  |  2 - NÃO","Continuar?",JOptionPane.QUESTION_MESSAGE));
					break;
					
				case 2:
					JOptionPane.showMessageDialog(null,"Você escolheu a opção: 2 - Android\nSeu preço é de R$180,00","Preço dos Livros",JOptionPane.WARNING_MESSAGE);
					 op = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja continuar?\n1 - SIM  |  2 - NÃO","Continuar?",JOptionPane.QUESTION_MESSAGE));
					break;
					
				case 3:
					JOptionPane.showMessageDialog(null,"Você escolheu a opção: 3 - C#\nSeu preço é de R$80,00","Preço dos Livros",JOptionPane.WARNING_MESSAGE);
					 op = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja continuar?\n1 - SIM  |  2 - NÃO","Continuar?",JOptionPane.QUESTION_MESSAGE));
					break;
					
				case 4:
					JOptionPane.showMessageDialog(null,"Você escolheu a opção: 4 - PHP\nSeu preço é de R$60,00","Preço dos Livros",JOptionPane.WARNING_MESSAGE);
					 op = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja continuar?\n1 - SIM  |  2 - NÃO","Continuar?",JOptionPane.QUESTION_MESSAGE));
					break;
				
				default:
					JOptionPane.showMessageDialog(null,"ESSA OPÇÃO É INVÁLIDA!\nTENTE NOVAMENTE.","ERROR",JOptionPane.ERROR_MESSAGE);
					break;
			}
		}
		JOptionPane.showMessageDialog(null,"O programa foi encerrado, obrigado por usá-lo!\nAté a próxima ;)","Finalizando Sistema",JOptionPane.INFORMATION_MESSAGE);
	}
}
