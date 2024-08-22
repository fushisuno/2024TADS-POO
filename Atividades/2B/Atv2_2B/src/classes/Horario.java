package classes;

public class Horario extends Tempo{
	private int hora;
	private int minuto;
	private int segundo;
	
	public Horario() {
	}

	public Horario(int in_hora, int in_minuto, int in_segundo){
		this.hora = in_hora;
		this.minuto = in_minuto;
		this.segundo = in_segundo;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public int getHora() {
		return this.hora;
	}

	public int getMinuto() {
		return this.minuto;
	}

	public int getSegundo() {
		return this.segundo;
	}

	@Override
	public long quantidade(){
		return  (this.hora * 3600 + this.minuto * 60 + this.segundo);
	}

	@Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
