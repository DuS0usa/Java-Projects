package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TelaInfo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInfo frame = new TelaInfo();
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
	public TelaInfo() {
		setResizable(false);
		setTitle("Informa\u00E7\u00F5es");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 444, 331);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("O Quiz foi criado com o tema direcionado ao jogo Minecraft.");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(75, 0, 130));
		lblNewLabel.setBounds(10, 176, 424, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Selecione apenas uma alternativa em cada quest\u00E3o.");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(75, 0, 130));
		lblNewLabel_1.setBounds(36, 201, 398, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ao final do Quiz, voc\u00EA saber\u00E1 seu desempenho.");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(75, 0, 130));
		lblNewLabel_2.setBounds(46, 227, 348, 30);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(75, 0, 130));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicio janela = new TelaInicio();
				TelaInfo.this.dispose();
				janela.setVisible(true);
			}
		});
		btnNewButton.setBounds(167, 283, 104, 29);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(TelaInfo.class.getResource("/img/info.png")));
		lblNewLabel_3.setBounds(47, 1, 351, 130);
		panel.add(lblNewLabel_3);
	}
}
