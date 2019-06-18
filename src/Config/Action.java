package Config;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Action {
	String nomedoIcon;
	boolean chaveIcon;
	int status;
	int valueAddition;
	int valueDecrease;

	public Action(String nome, int status, int addition, int decrease) {
		nomedoIcon = nome;
		this.status = status;
		valueAddition = addition;
		valueDecrease = decrease;
		chaveIcon = false;
	}

	public void additionStatus() {
		status += valueAddition;
		System.out.print(status);
	}

//	private void modifyValueDecrease(Time b) {
//		if (b.horapassadas() > 10)
//			valueDecrease = 2;
//	}

	public void tradeIcon(Action a, JLabel b) {
		ligaIcon();
		if (a.chaveIcon == true)
			b.setIcon(new ImageIcon(Tela.class.getResource("/imagens/play-button_ON.png")));
		else
			b.setIcon(new ImageIcon(Tela.class.getResource("/imagens/play-button.png")));

	}

	public boolean ligaIcon() {
		if (chaveIcon == false)
			return chaveIcon = true;
		else
			return chaveIcon = false;

	}

	//////////////////// Gets e Sets//////////////////////////////

	public void setNomedoIcon(String nomedoIcon) {
		this.nomedoIcon = nomedoIcon;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setValueAddition(int valueAddition) {
		this.valueAddition = valueAddition;
	}

	public void setValueDecrease(int valueDecrease) {
		this.valueDecrease = valueDecrease;
	}

	public String getNomedoIcon() {
		return nomedoIcon;
	}

	public int getStatus() {
		return status;
	}

	public int getValueAddition() {
		return valueAddition;
	}

	public int getValueDecrease() {
		return valueDecrease;
	}
}
