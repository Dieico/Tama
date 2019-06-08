package Config;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Botoes extends JButton{

	public JButton right;
	public JButton left;
	public JButton seletc;
	public JButton back;

	public Botoes() {
		right = new JButton("!");		
		right.setBounds(109, 07, 106, 23);		
		left = new JButton(	);
		left.setText("Botão 12");
//		left.setBounds(19, 90, 106, 2)
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("teste11");
			}
		});

	}

	public JButton getright() {
		return right;
	}

	public JButton getleft() {
		return left;
	}

	private static final long serialVersionUID = 1L;

}
