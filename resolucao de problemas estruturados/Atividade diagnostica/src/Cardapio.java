import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    List<ItemCardapio> itens;

    public Cardapio() {
        itens = new ArrayList<>();
        // Adicionando itens ao cardápio
        itens.add(new ItemCardapio("Pizza", 50, 1));
        itens.add(new ItemCardapio("Hambúrguer", 30, 2));
        itens.add(new ItemCardapio("Salada", 20, 3));
        itens.add(new ItemCardapio("Sushi", 60, 4));
    }

    public void mostrarCardapio() {
        System.out.println("Aqui está o cardápio:");
        for (ItemCardapio item : itens) {
            System.out.println("Número: " + item.getNumero() + " | Comida: " + item.getNome() + " | Preço: R$" + item.getPreco());
        }
    }

    public ItemCardapio getItemPorNumero(int numero) {
        for (ItemCardapio item : itens) {
            if (item.getNumero() == numero) {
                return item;
            }
        }
        return null;
    }
}