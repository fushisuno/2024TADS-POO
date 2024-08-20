package brinquedo;

public class Brinquedo {
  private String nome;
  private String faixaEtaria;
  private float preco;

  public Brinquedo(String nome, String faixaEtaria, float preco){
      this.nome = nome;
      this.faixaEtaria = faixaEtaria;
      this.preco = preco;
  }

  public Brinquedo(String nome){
      this.nome = nome;
  }

  public Brinquedo(String nome, float preco){
      this.nome = nome;
      this.preco = preco;
  }

  public String mostrar(){
      return "Nome: " + this.nome + 
      "\nFaixa etaria: " + this.faixaEtaria + 
      "\nPreço: R$" + this.preco;
  }

  public void setNome(String nome){
      this.nome = nome;
  }

  public void setFaixaEtaria(String faixaEtaria){
    // Validação da faixa etária
    if ("0 a 2".equals(faixaEtaria) || "3 a 5".equals(faixaEtaria) || "6 a 10".equals(faixaEtaria) || "acima de 10".equals(faixaEtaria)) {
      this.faixaEtaria = faixaEtaria;
    } else {
        System.out.println("Faixa etária inválida! Não foi possível armazenar o valor: " + faixaEtaria);
    }
  }

  public void setPreco(float preco){
      this.preco = preco;
  }

  public String getNome(){
      return this.nome;
  }

  public String getFaixaEtaria(){
      return this.faixaEtaria;
  }

  public float getPreco(){
      return this.preco;
  }

}