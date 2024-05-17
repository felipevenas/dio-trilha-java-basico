import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class EstruturaTryCatch {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       try {
            
            System.out.println("Digite seu pirmeiro nome: ");
            String nome = scanner.nextLine();
            
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            int altura = scanner.nextInt();

            scanner.close();

            System.out.println();

            System.out.println("Nome: " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ".");
            System.out.println("Idade: " + idade + " anos.");
            System.out.println("Altura: " + altura + "cm.");

        } catch (InputMismatchException e) { // (Exceção/Erro nomeDesejado) - No bloco de código, colocamos o alerta para solução daquele problema.
            System.out.println("Os campos 'idade' e 'altura' precisam ser escritos c/ números.");
        } 

    }
}
