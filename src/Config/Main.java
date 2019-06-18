package Config;

import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		Tela carrega = new Tela();
		carrega.getTempo().decreaseStatus(carrega.getComida());
		carrega.getTempo().decreaseStatus(carrega.getSaude());
		carrega.getTempo().decreaseStatus(carrega.getEmocional());
		carrega.getTempo().decreaseStatus(carrega.getSono());

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {

				carrega.getStatusComida().setText("Fome: " + carrega.getComida().getStatus());
				carrega.getStatusSaude().setText("Saude: " + carrega.getSaude().getStatus());
				carrega.getStatusEmocao().setText("felicidade: " + carrega.getEmocional().getStatus());
				carrega.getStatusSono().setText("Cansaço: " + carrega.getSono().getStatus());
			}
		}, 1000, 1000);

		EventQueue.invokeLater(new Runnable() {
			public void run() {
//				carrega.statusComida.setText(" Status de Fome " + Integer.toString(carrega.getComida().getStatus()));
				try {
					carrega.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}