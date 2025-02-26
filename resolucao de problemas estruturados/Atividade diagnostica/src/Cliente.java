import java.util.Scanner;

public class Cliente {
     String nome;

    public void capturarNome() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        this.nome = scanner.nextLine();

        System.out.println("Olá, " + nome + "! Seja bem-vindo!");

        scanner.close();
    }

    public String getNome() {
        return nome;
    }
}
