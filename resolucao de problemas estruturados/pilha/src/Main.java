public class Main {

    public static void main(String[] args) {
        pilha Pilha = new pilha();

        Pilha.push(10);
        Pilha.push(35);
        Pilha.push(44);

        System.out.println("pilha: " + Pilha.topo());

        System.out.println("Removendo elemento: " + Pilha.pop());

        System.out.println("pilha: " + Pilha.topo());
    }
}
