package Config;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action implements Fuction {
	String nomedoIcon;
	int status;
	int valueAddition;
	int valueDecrease;

	public Action(String nome, int status, int addition, int decrease) {
		nomedoIcon = nome;
		this.status = status;
		valueAddition = addition;
		valueDecrease = decrease;
	}
	
	@Override
	public int decreaseStatus(Time b) {
		
		return 0;
	}

	@Override
	public int additionStatus(Botoes a) {
		a.right.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(Botoes.this, "Teste 2");
				status +=valueAddition;
			}
		});
		return 0;
	}

	@Override
	public int modifyValueDecrease(Time b) {
		// TODO Auto-generated method stub
		return 0;
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
