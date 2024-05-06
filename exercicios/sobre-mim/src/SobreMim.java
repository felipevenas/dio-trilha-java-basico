import java.util.Scanner;
import java.util.Locale;

public class SobreMim {
    public static void main(String[] args) throws Exception {

        String nome, sobrenome;
        int idade;
        double altura;

        // Criando o objeto "scanner":
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
            nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
            sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
            altura = scanner.nextDouble();
        
        System.out.println("\nNome completo: " + nome + " " + sobrenome + ".");
        System.out.println("Idade: " + idade + ".");
        System.out.println("Altura computada: " + altura + "cm.");

        scanner.close(); // Encerrando o "scanner".

    }
}
