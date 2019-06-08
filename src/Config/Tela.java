package Config;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.Button;

public class Tela {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addKeyListener(new KeyAdapter() {
			 @Override
			public void keyPressed(KeyEvent arg0) {
			}
		});
		lblNewLabel.setBounds(10, 11, 32, 32);
		lblNewLabel.setIcon(new ImageIcon(Tela.class.getResource("/imagens/rQev9.jpg")));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Tela.class.getResource("/imagens/rQev9.jpg")));
		label.setBounds(52, 11, 32, 32);
		frame.getContentPane().add(label);
		
		Button button = new Button("New button");
		button.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				
			}
		});
		button.setBackground(Color.GRAY);
		button.setBounds(92, 178, 70, 22);
		frame.getContentPane().add(button);
	}
}
