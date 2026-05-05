import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do profissional: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o cargo ocupado: ");
        String cargo = scanner.nextLine();

        System.out.print("Digite o nível de acesso (1-10): ");
        int nivelAcesso = scanner.nextInt();

        System.out.print("Digite o nível de sigilo da área (1-10): ");
        int nivelSigilo = scanner.nextInt();

        if (nivelAcesso < 1 || nivelAcesso > 10) {
            System.out.println("Erro: Nível de acesso inválido.");
        } else {
            if (nivelAcesso >= nivelSigilo) {
                System.out.println("===== ACESSO PERMITIDO =====");
                System.out.println("Nome: " + nome);
                System.out.println("Cargo: " + cargo);
                System.out.println("Saldo de autoridade: " + (nivelAcesso - nivelSigilo));
            } else {
                System.out.println("===== ACESSO NEGADO =====");
                System.out.println("ALERTA: Tentativa de acesso indevida detectada!");
                System.out.println("Nome: " + nome);
                System.out.println("Cargo: " + cargo);
                System.out.println("Autoridade Insuficiente" );

            }
        }
        scanner.close();
    }
}
