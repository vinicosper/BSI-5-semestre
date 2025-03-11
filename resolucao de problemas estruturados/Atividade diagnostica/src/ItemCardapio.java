public class ItemCardapio {
    String nome;
    int preco;
    int numero;

    public ItemCardapio(String nome, int preco, int numero) {
        this.nome = nome;
        this.preco = preco;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getNumero() {
        return numero;
    }
}