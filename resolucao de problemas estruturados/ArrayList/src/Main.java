

public class Main extends Arraylist {

    public static void main(String[] args) {
        Arraylist<Integer> lista = new Arraylist<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(1,15);


        System.out.println("Elemento na posição 1: " + lista.get(1));
        System.out.println("A lista contém 20? " + lista.contains(20));

        System.out.println("Elemento na posição 2: " + lista.get(2));
        lista.remove(2);
        System.out.println("Elemento removido com sucesso.\n Índice 2 agora: " + lista.get(2));

        lista.set(1, 50);
        System.out.println("Novo valor no índice 1: " + lista.get(1));
    }
}