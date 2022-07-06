import javax.swing.JOptionPane;

public class Eleicao {
	public static void main(String[] args) {
		
		int i = 1, a = 0, b = 0, c = 0, num, voto;
		
		num = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe quantas pessoas irão votar:","QUANTIDADE DE ELEITORES",JOptionPane.QUESTION_MESSAGE));
		
		while(i <= num){
			
			voto = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número do seu Candidato:\n[1] - CANDIDATO A\n[2] - CANDIDATO B\n[3] - CANDIDATO C","VOTAÇÃO",JOptionPane.INFORMATION_MESSAGE));
												
			switch(voto){
				case 1:
					a++;
					JOptionPane.showMessageDialog(null,"Eleitor Nº: "+i+"\nSeu voto foi computado!","OBRIGADO!",JOptionPane.WARNING_MESSAGE);
					break;
				
				case 2:
					b++;
					JOptionPane.showMessageDialog(null,"Eleitor Nº: "+i+"\nSeu voto foi computado!","OBRIGADO!",JOptionPane.WARNING_MESSAGE);
					break;
					
				case 3:
					c++;
					JOptionPane.showMessageDialog(null,"Eleitor Nº: "+i+"\nSeu voto foi computado!","OBRIGADO!",JOptionPane.WARNING_MESSAGE);
					break;
					
				default:
					JOptionPane.showMessageDialog(null,"Opção Inválida!\nVote novamente.","ERROR",JOptionPane.ERROR_MESSAGE);
					i--;
					break;
			}
			i++;
		}
		
		JOptionPane.showMessageDialog(null, "CANDIDATO A: "+a+
											"\nCANDIDATO B: "+b+
											"\nCANDIDATO C: "+c,"QUANDIDADE DE VOTOS",JOptionPane.WARNING_MESSAGE);
		
	}
}



