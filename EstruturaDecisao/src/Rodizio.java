import javax.swing.JOptionPane;

public class Rodizio {
	public static void main(String args[]) {
		
		int finalP;
		finalP = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o �ltimo n�mero da sua placa: ","Rod�zio",JOptionPane.INFORMATION_MESSAGE));
		switch(finalP){
		
			case 0:
				JOptionPane.showMessageDialog(null,"O n�mero final da sua placa �: "+finalP+"\nVoc� n�o pode rodar na SEGUNDA-FEIRA!");			
					break;
			case 1:
				JOptionPane.showMessageDialog(null,"O n�mero final da sua placa �: "+finalP+"\nVoc� n�o pode rodar na SEGUNDA-FEIRA!");			
					break;
					
			case 2:
				JOptionPane.showMessageDialog(null,"O n�mero final da sua placa �: "+finalP+"\nVoc� n�o pode rodar na TER�A-FEIRA!");			
					break;
			case 3:
				JOptionPane.showMessageDialog(null,"O n�mero final da sua placa �: "+finalP+"\nVoc� n�o pode rodar na TER�A-FEIRA!");			
					break;
					
			case 4:
				JOptionPane.showMessageDialog(null,"O n�mero final da sua placa �: "+finalP+"\nVoc� n�o pode rodar na QUARTA-FEIRA!");			
					break;
			case 5:
				JOptionPane.showMessageDialog(null,"O n�mero final da sua placa �: "+finalP+"\nVoc� n�o pode rodar na QUARTA-FEIRA!");			
					break;
					
			case 6:
				JOptionPane.showMessageDialog(null,"O n�mero final da sua placa �: "+finalP+"\nVoc� n�o pode rodar na QUINTA-FEIRA!");			
					break;
			case 7:
				JOptionPane.showMessageDialog(null,"O n�mero final da sua placa �: "+finalP+"\nVoc� n�o pode rodar na QUINTA-FEIRA!");			
					break;
					
			case 8:
				JOptionPane.showMessageDialog(null,"O n�mero final da sua placa �: "+finalP+"\nVoc� n�o pode rodar na SEXTA-FEIRA!");			
					break;
			case 9:
				JOptionPane.showMessageDialog(null,"O n�mero final da sua placa �: "+finalP+"\nVoc� n�o pode rodar na SEXTA-FEIRA!");			
					break;
		}
		
	}
}
