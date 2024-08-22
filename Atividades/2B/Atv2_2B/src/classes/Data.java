package classes;

public class Data extends Tempo{
  private int dia;
  private int mes;
  private int ano;

  public Data() {
  }

  public Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  public int getDia() {
    return this.dia;
  }

  public int getMes() {
    return this.mes;
  }

  public int getAno() {
    return this.ano;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  @Override
	public long quantidade(){
		return (this.ano * 31104000 + this.mes * 2592000 + this.dia * 86400);
	}

  @Override
  public String toString() {
      return String.format("%02d/%02d/%04d", dia, mes, ano);
  }

}
