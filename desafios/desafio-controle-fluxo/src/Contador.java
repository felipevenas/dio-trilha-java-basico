import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDepositado = scanner.nextDouble();

                    saldo = saldo + valorDepositado;

                    break;

                case 2:
                    System.out.println("Saldo atual: R$" + saldo);

                    System.out.println("Digite o valor a ser sacado: ");
                    double valorSacar = scanner.nextDouble();

                    if (valorSacar > saldo) {
                        System.out.println("Saldo insuficiente.");
                    }

                    break;

                case 3:
                    System.out.println("Saldo disponível: R$" + saldo);

                    break;

                case 0:
                    System.out.println("Programa encerrado.");

                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}