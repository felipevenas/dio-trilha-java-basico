import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Locale;

public class EstruturaEnquanto {
    public static void main(String[] args) throws Exception {
           
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);    

        System.out.println("Informe o seu salário por hora: ");
            double salarioPorHora = scanner.nextDouble();
        scanner.close();

        while (salarioPorHora > 0) {
            double valorDoce = valorAleatorio();
                    System.out.println("Doce do valor: R$" + valorDoce + " adicionado no carrinho.");
                    salarioPorHora = salarioPorHora - valorDoce;
        }

            System.out.println();

        System.out.println("Salário atualizado: R$" + salarioPorHora + ".");
        System.out.println("Fulano gastou toda seu salário com doces.");

    }

    private static double valorAleatorio() { // Chamada de um método para criarmos valores para produtos aleatórios.
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}
