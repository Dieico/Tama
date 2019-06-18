package Config;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Status {
	int idade;
	List<Action> status;

	public Status(Time b) {
		idade = b.dias;
		status = new ArrayList<Action>();
	}
	
	

	public void captuarStatus(Action a) {
		status.add(a);
	}

	public void mostraStatus() {
		for (Action a : status)
			a.getStatus();
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setStatus(List<Action> status) {
		this.status = status;
	}

	public int getIdade() {
		return idade;
	}

	public List<Action> getStatus() {
		return status;
	}

}
