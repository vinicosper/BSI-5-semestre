public class Pedido extends Cardapio {
    double taxa;
    double valor_total;

    public Pedido(String nome, String comida, int preco, int numero, double valor_total) {
        super(nome, comida, preco, numero);
        this.valor_total = valor_total;
        setTaxa(valor_total);
    }

    public void setTaxa(double valor_total) {
        this.taxa = valor_total * 0.10;
    }

    public void mostrarPedido() {
        System.out.println("Cliente: " + nome);
        System.out.println("Comida: " + comida);
        System.out.println("Preço: R$" + preco);
        System.out.println("Taxa de Serviço (10%): R$" + taxa);
        System.out.println("Valor Total: R$" + valor_total + taxa);
    }
}
