import javax.swing.JOptionPane;

public class Rodizio {
	public static void main(String args[]) {
		
		int finalP;
		finalP = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o último número da sua placa: ","Rodízio",JOptionPane.INFORMATION_MESSAGE));
		switch(finalP){
		
			case 0:
				JOptionPane.showMessageDialog(null,"O número final da sua placa é: "+finalP+"\nVocê não pode rodar na SEGUNDA-FEIRA!");			
					break;
			case 1:
				JOptionPane.showMessageDialog(null,"O número final da sua placa é: "+finalP+"\nVocê não pode rodar na SEGUNDA-FEIRA!");			
					break;
					
			case 2:
				JOptionPane.showMessageDialog(null,"O número final da sua placa é: "+finalP+"\nVocê não pode rodar na TERÇA-FEIRA!");			
					break;
			case 3:
				JOptionPane.showMessageDialog(null,"O número final da sua placa é: "+finalP+"\nVocê não pode rodar na TERÇA-FEIRA!");			
					break;
					
			case 4:
				JOptionPane.showMessageDialog(null,"O número final da sua placa é: "+finalP+"\nVocê não pode rodar na QUARTA-FEIRA!");			
					break;
			case 5:
				JOptionPane.showMessageDialog(null,"O número final da sua placa é: "+finalP+"\nVocê não pode rodar na QUARTA-FEIRA!");			
					break;
					
			case 6:
				JOptionPane.showMessageDialog(null,"O número final da sua placa é: "+finalP+"\nVocê não pode rodar na QUINTA-FEIRA!");			
					break;
			case 7:
				JOptionPane.showMessageDialog(null,"O número final da sua placa é: "+finalP+"\nVocê não pode rodar na QUINTA-FEIRA!");			
					break;
					
			case 8:
				JOptionPane.showMessageDialog(null,"O número final da sua placa é: "+finalP+"\nVocê não pode rodar na SEXTA-FEIRA!");			
					break;
			case 9:
				JOptionPane.showMessageDialog(null,"O número final da sua placa é: "+finalP+"\nVocê não pode rodar na SEXTA-FEIRA!");			
					break;
		}
		
	}
}
