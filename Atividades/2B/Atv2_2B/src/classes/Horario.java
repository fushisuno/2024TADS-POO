package classes;

public class Horario extends Tempo{
	private long hora;
	private long minuto;
	private long segundo;
	
	public Horario() {
	}

	public Horario(long in_hora, long in_minuto, long in_segundo){
		this.hora = in_hora;
		this.minuto = in_minuto;
		this.segundo = in_segundo;
	}
	
	public void setHora(long hora) {
		this.hora = hora;
	}

	public void setMinuto(long minuto) {
		this.minuto = minuto;
	}

	public void setSegundo(long segundo) {
		this.segundo = segundo;
	}

	public long getHora() {
		return this.hora;
	}

	public long getMinuto() {
		return this.minuto;
	}

	public long getSegundo() {
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
