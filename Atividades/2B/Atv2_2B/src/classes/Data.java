package classes;

public class Data extends Tempo{
  private long  dia;
  private long mes;
  private long ano;

  public Data() {
  }

  public Data(long dia, long mes, long ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  public long getDia() {
    return this.dia;
  }

  public long getMes() {
    return this.mes;
  }

  public long getAno() {
    return this.ano;
  }

  public void setDia(long dia) {
    this.dia = dia;
  }

  public void setMes(long mes) {
    this.mes = mes;
  }

  public void setAno(long ano) {
    this.ano = ano;
  }

  @Override
	public long quantidade(){
    long sano = (this.ano * 31104000);
    long smes = (this.mes * 2592000);
    long sdia = (this.dia * 86400);

		return ((this.ano * 31104000) + (this.mes * 2592000) + (this.dia * 86400));
	}

  @Override
  public String toString() {
      return String.format("%02d/%02d/%04d", dia, mes, ano);
  }

}
