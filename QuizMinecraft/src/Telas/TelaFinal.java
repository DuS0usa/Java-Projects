package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaFinal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFinal frame = new TelaFinal();
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
	public TelaFinal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbAcertos = new JLabel("New label");
		lbAcertos.setBounds(174, 101, 46, 14);
		panel.add(lbAcertos);
		
		JLabel lbErros = new JLabel("New label");
		lbErros.setBounds(135, 126, 131, 54);
		panel.add(lbErros);
		lbErros.setText("");
		
		JButton btnNewButton = new JButton("In\u00EDcio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicio janela = new TelaInicio();
				TelaFinal.this.dispose();
				janela.setVisible(true);
			}
		});
		btnNewButton.setBounds(156, 256, 91, 23);
		panel.add(btnNewButton);
	}

}
