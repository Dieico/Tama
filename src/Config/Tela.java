package Config;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Tela {

	JFrame frame;
	private Time tempo;
	private Action comida;
	private Action saude;
	private Action emocional;
	private Action sono;
	private JLabel statusComida;
	private JLabel statusSaude;
	private JLabel statusEmocao;
	private JLabel statusSono;
	int trocador;

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

		tempo = new Time();
		comida = new Action("food", 50, 1, 1);
		saude = new Action("life", 50, 1, 1);
		emocional = new Action("emo", 50, 1, 1);
		sono = new Action("sono", 50, 1, 1);
		trocador = 0;

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				tempo.armazenaltimoAcesso();
			}
		});

		frame.getContentPane().setLayout(null);

		JLabel darComida = new JLabel("");
		darComida.setIcon(new ImageIcon(Tela.class.getResource("/imagens/play-button.png")));
		darComida.setBounds(54, 11, 24, 24);
		frame.getContentPane().add(darComida);

		JLabel darSaude = new JLabel("");
		darSaude.setIcon(new ImageIcon(Tela.class.getResource("/imagens/play-button.png")));
		darSaude.setBounds(91, 11, 24, 24);
		frame.getContentPane().add(darSaude);

		JLabel darLove = new JLabel("");
		darLove.setIcon(new ImageIcon(Tela.class.getResource("/imagens/play-button.png")));
		darLove.setBounds(125, 11, 24, 24);
		frame.getContentPane().add(darLove);

		JLabel darDescanso = new JLabel("");
		darDescanso.setIcon(new ImageIcon(Tela.class.getResource("/imagens/play-button.png")));
		darDescanso.setBounds(159, 11, 24, 24);
		frame.getContentPane().add(darDescanso);

		JButton passar = new JButton("");
		passar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				switch (trocador) {
				case 0:
					comida.tradeIcon(comida, darComida);
					trocador = 1;
					break;

				case 1:
					comida.tradeIcon(comida, darComida);
					saude.tradeIcon(saude, darSaude);
					trocador = 2;
					break;
				case 2:
					saude.tradeIcon(saude, darSaude);
					emocional.tradeIcon(emocional, darLove);
					trocador = 3;
					break;
				case 3:
					emocional.tradeIcon(emocional, darLove);
					sono.tradeIcon(sono, darDescanso);
					trocador = 4;
					break;

				default:
					sono.tradeIcon(sono, darDescanso);
					trocador = 0;
					break;
				}
			}
		});

		passar.setIcon(new ImageIcon(Tela.class.getResource("/imagens/play-button.png")));
		passar.setBounds(54, 178, 46, 33);
		frame.getContentPane().add(passar);

		JButton selecionar = new JButton("");
		selecionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (comida.chaveIcon)
					comida.additionStatus();

				if (saude.chaveIcon)
					saude.additionStatus();

				if (emocional.chaveIcon)
					emocional.additionStatus();

				if (sono.chaveIcon)
					sono.additionStatus();

			}

		});
		selecionar.setBounds(137, 178, 46, 33);
		frame.getContentPane().add(selecionar);

		JLabel tela = new JLabel("New label");
		tela.setIcon(new ImageIcon(Tela.class.getResource("/imagens/Tama.gif")));
		tela.setBounds(57, 71, 99, 83);
		frame.getContentPane().add(tela);

		statusComida = new JLabel("");
		statusComida.setBounds(265, 44, 123, 33);
		frame.getContentPane().add(statusComida);
		
		statusSaude = new JLabel("");
		statusSaude.setBounds(265, 84, 123, 33);
		frame.getContentPane().add(statusSaude);
		
		statusEmocao = new JLabel("");
		statusEmocao.setBounds(265, 121, 123, 33);
		frame.getContentPane().add(statusEmocao);
		
		statusSono = new JLabel("");
		statusSono.setBounds(265, 164, 123, 33);
		frame.getContentPane().add(statusSono);		

	}
	
	
	
	public JLabel getStatusSaude() {
		return statusSaude;
	}

	public void setStatusSaude(JLabel statusSaude) {
		this.statusSaude = statusSaude;
	}

	public JLabel getStatusEmocao() {
		return statusEmocao;
	}

	public void setStatusEmocao(JLabel statusEmocao) {
		this.statusEmocao = statusEmocao;
	}

	public JLabel getStatusSono() {
		return statusSono;
	}

	public void setStatusSono(JLabel statusSono) {
		this.statusSono = statusSono;
	}

	public void setStatusComida(JLabel statusComida) {
		this.statusComida = statusComida;
	}

	public JLabel getStatusComida() {
		return statusComida;
	}

	public JFrame getFrame() {
		return frame;
	}

	public Time getTempo() {
		return tempo;
	}

	public void setTempo(Time tempo) {
		this.tempo = tempo;
	}

	public void setComida(Action comida) {
		this.comida = comida;
	}

	public Action getSaude() {
		return saude;
	}

	public void setSaude(Action saude) {
		this.saude = saude;
	}

	public Action getEmocional() {
		return emocional;
	}

	public void setEmocional(Action emocional) {
		this.emocional = emocional;
	}

	public Action getSono() {
		return sono;
	}

	public void setSono(Action sono) {
		this.sono = sono;
	}

	public Action getComida() {
		return comida;
	}
}
