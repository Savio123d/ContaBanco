import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaTerminal conta1 = new ContaTerminal();

        System.out.println("Informe o número da conta (ex: 1021): ");
        conta1.setConta(scanner.nextInt());

        System.out.println("Informe a agência (ex: 067-8): ");
        conta1.setAgencia(scanner.next());

        System.out.println("Informe o nome: ");
        scanner.nextLine(); // Consumir quebra de linha pendente
        conta1.setNome(scanner.nextLine());

        System.out.println("Informe o saldo (use ponto para decimais, ex: 237.48): ");
        conta1.setSaldo(scanner.nextDouble()); // <- Sem conversão, direto como double

        conta1.exibir();
    }
}
