import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Seja bem-vindo!\nSelecione o número desejado:");
            System.out.println("(1) Fazer pedido!");
            System.out.println("(2) Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                Cliente cliente = new Cliente();
                cliente.capturarNome(scanner);

                Cardapio cardapio = new Cardapio();
                cardapio.mostrarCardapio();

                Pedido pedido = new Pedido();
                int escolha;

                do {
                    System.out.print("Digite o número do item (ou 0 para finalizar): ");
                    escolha = scanner.nextInt();

                    if (escolha != 0) {
                        ItemCardapio item = cardapio.getItemPorNumero(escolha);
                        if (item != null) {
                            pedido.adicionarItem(item);
                            System.out.println(item.getNome() + " adicionado ao pedido.");
                        } else {
                            System.out.println("Item não encontrado. Tente novamente.");
                        }
                    }
                } while (escolha != 0);

                pedido.mostrarPedido();

                System.out.print("Digite o valor recebido em dinheiro: ");
                double valorRecebido = scanner.nextDouble();
                double troco = valorRecebido - pedido.getValorTotal();
                System.out.println("Troco: R$" + troco);

            } else if (opcao == 2) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 2);

        scanner.close();
    }
}