package Config;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Time {
	LocalDate nascimento;
	int dias;
	LocalTime ultimoAcesso;
	int descaso;

	public Time() {
		if (nascimento == null)
			nascimento = LocalDate.now();

	}

	public int verificaIdade() {
		long days = ChronoUnit.DAYS.between(nascimento, LocalDate.now());
		return dias = (int) days;
	}

	public LocalTime verificahora() {
		return LocalTime.now();
	}

	public int horapassadas() {
		ultimoAcesso = verificahora();
		Duration horapassada = Duration.between(ultimoAcesso, LocalTime.now());
		return (descaso = (int) (horapassada.getSeconds() / 60));
	}

	////////////////// Sets e Gets /////////////////
	
	public LocalDate getNascimento() {
		return nascimento;
	}
	
	public LocalTime getUltimoAcesso() {
		return ultimoAcesso;
	}
	
	@Override
	public String toString() {
		return "Time [nascimento=" + nascimento + ", dias=" + dias + ", ultimoAcesso=" + ultimoAcesso + ", descaso="
				+ descaso + "]";
	}

	public static void main(String[] args) {
		Time days = new Time();
//		System.out.print(days.verificaIdade());		
//		System.out.print(days.toString());
		System.out.print(days.horapassadas());
	}

}
