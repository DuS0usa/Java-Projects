import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrimeiraTela extends JFrame {

	private JPanel contentPane;
	private JTextField cx1;
	private JTextField cx2;
	private JTextField cxresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraTela frame = new PrimeiraTela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrimeiraTela() {
		setTitle("Opera\u00E7\u00F5es B\u00E1sicas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite o 1\u00BA N\u00FAmero:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 55, 152, 28);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite o 2\u00BA Numero");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 94, 152, 28);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 156, 152, 28);
		panel.add(lblNewLabel_2);
		
		cx1 = new JTextField();
		cx1.setBounds(202, 55, 152, 20);
		panel.add(cx1);
		cx1.setColumns(10);
		
		cx2 = new JTextField();
		cx2.setBounds(202, 100, 152, 20);
		panel.add(cx2);
		cx2.setColumns(10);
		
		cxresultado = new JTextField();
		cxresultado.setEditable(false);
		cxresultado.setBounds(202, 162, 152, 20);
		panel.add(cxresultado);
		cxresultado.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double n1;
				double n2;
				double resultado;
				
				n1 = Double.parseDouble(cx1.getText());
				n2 = Double.parseDouble(cx2.getText());
				
				resultado = n1 + n2;	
				cxresultado.setText(String.valueOf(resultado));
			
			}
		});
		
		
		btnNewButton.setBounds(71, 216, 91, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cx1.setText(" ");
				cx2.setText(" ");
				cxresultado.setText(" ");
				
				cx1.requestFocus();
			}
		});
		
		
		btnNewButton_1.setBounds(252, 216, 91, 23);
		panel.add(btnNewButton_1);
	}
}
