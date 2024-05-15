import java.util.Scanner;
import java.util.Locale;

public class EstruturaPara {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroTeste;
        String alunos [] = {"FELIPE", "ALISSON", "RAYAN", "LEVI", "ELTHON"}; // Um array sempre começa do número 0.

        System.out.println("Digite um número menor do que 100: ");
            numeroTeste = scanner.nextInt();
        scanner.close();

        for ( ; numeroTeste <= 100; numeroTeste++){ // (Bloco de declaração da variável de inicialização; Expressão booleana de validação; Bloco de atualização)
            System.out.println("Contagem até 100 = " + numeroTeste + ".");
        }

            System.out.println();
        
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
        }

            System.out.println();

        for (String aluno : alunos) { // Cada execução a variável 'aluno' será atualizada com um novo valor do array 'alunos'.
            System.out.println("Nome do aluno: " + aluno + ".");
        }

    }
}
