import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemCardapio> itens;
    private double taxa;
    private double valorTotal;

    public Pedido() {
        itens = new ArrayList<>();
        taxa = 0.0;
        valorTotal = 0.0;
    }

    public void adicionarItem(ItemCardapio item) {
        itens.add(item);
        valorTotal += item.getPreco();
        taxa = valorTotal * 0.10;
    }

    public void mostrarPedido() {
        System.out.println("Itens do pedido:");
        for (ItemCardapio item : itens) {
            System.out.println("Comida: " + item.getNome() + " | Preço: R$" + item.getPreco());
        }
        System.out.println("Taxa de Serviço (10%): R$" + taxa);
        System.out.println("Valor Total: R$" + (valorTotal + taxa));
    }

    public double getValorTotal() {
        return valorTotal + taxa;
    }
}