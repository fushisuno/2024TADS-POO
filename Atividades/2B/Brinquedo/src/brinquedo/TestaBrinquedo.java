package brinquedo;

public class TestaBrinquedo {
  public static void main(String[] args) {
    // Teste 1: Criar um brinquedo com valores válidos
    
    Brinquedo bb = new Brinquedo("null");
    
    //Brinquedo brinquedo11 = new Brinquedo("Carinho", "3 a 5", 29.90f);

    //Brinquedo brinquedo1 = new Brinquedo("Carrinho", "3 a 5", 29.90f);
    System.out.println(bb.mostrar());
    
    /*// Teste 2: Testar a validação de faixa etária
    Brinquedo brinquedo2 = new Brinquedo("Boneca");
    brinquedo2.setFaixaEtaria("6 a 10");
    brinquedo2.setPreco(49.90f);
    System.out.println(brinquedo2.mostrar());

    // Teste 3: Testar a faixa etária inválida
    brinquedo2.setFaixaEtaria("10 a 15"); // Deve disparar a mensagem de erro
    System.out.println(brinquedo2.mostrar());

    // Teste 4: Testar o setter de preço
    brinquedo1.setPreco(35.00f);
    System.out.println("Novo preço do brinquedo 1: R$" + brinquedo1.getPreco());
    */
  }
}