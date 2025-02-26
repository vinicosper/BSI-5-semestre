public class Cardapio extends Cliente {
    String comida;
    int preco;
    int numero;

    public Cardapio(String nome, String comida, int preco, int numero) {
        super(nome); // Chama o construtor da classe Cliente
        this.comida = comida;
        this.preco = preco;
        this.numero = numero;
    }

    public void mostrarCardapio() {
        System.out.println("Aqui está o cardápio:");
        System.out.println("Número: " + numero + " | Comida: " + comida + " | Preço: R$" + preco);
    }
}
