package Config;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.LocalTime;
import java.awt.event.ActionEvent;

public class Tela {

	static Time tempo = new Time();
	static Action comida = new Action("food", 50, 1, 1);

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		tempo.armazenaltimoAcesso();
		tempo.decreaseStatus(comida);

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton darComida = new JButton("New button");
		darComida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comida.additionStatus();
			}
		});
		darComida.setBounds(31, 5, 89, 23);
		frame.getContentPane().add(darComida);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(tempo.horapassadas() + " " );
				
			}
		});
		btnNewButton.setBounds(125, 5, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(219, 5, 89, 23);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(313, 5, 89, 23);
		frame.getContentPane().add(btnNewButton_3);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(191, 128, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton left = new JButton("New button");
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setBackground(Color.BLUE);
			}
		});
		left.setBounds(31, 210, 89, 23);
		frame.getContentPane().add(left);
	}

}
