package Config;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Timer;
import java.util.TimerTask;

public class Time {
	LocalDate nascimento;
	int dias;
	LocalTime ultimoAcesso;
	int descaso;

	public Time() {
	}

	public int verificaIdade() {
		long days = ChronoUnit.DAYS.between(nascimento, LocalDate.now());
		return dias = (int) days;
	}

	public LocalTime verificahora() {
		return LocalTime.now();
	}

	public int horapassadas() {
		return descaso = (int) (Duration.between(ultimoAcesso, LocalTime.now()).getSeconds());
	}

	public LocalTime armazenaltimoAcesso() {
		return ultimoAcesso = LocalTime.now();
	}

	public void decreaseStatus(Action b) {
		int delay = 2000; // tempo de espera antes da 1ª execução da tarefa.
		int interval = 3000; // intervalo no qual a tarefa será executada.
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				b.status -= b.valueDecrease;
//				
			}
		}, delay, interval);
	}

	////////////////// Sets e Gets /////////////////

	public LocalDate getNascimento() {
		return nascimento;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public int getDescaso() {
		return descaso;
	}

	public void setDescaso(int descaso) {
		this.descaso = descaso;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public void setUltimoAcesso(LocalTime ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}

	public LocalTime getUltimoAcesso() {
		return ultimoAcesso;
	}

	@Override
	public String toString() {
		return "Time [nascimento=" + nascimento + ", dias=" + dias + ", ultimoAcesso=" + ultimoAcesso + ", descaso="
				+ descaso + "]";
	}

}
