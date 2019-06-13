package Config;

public class Action{
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

	public void additionStatus() {
		status += valueAddition;
		 System.out.print(status);
	}

	public void modifyValueDecrease(Time b) {
		if (b.horapassadas() > 10)
			valueDecrease = 2;
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
