import java.util.Scanner;
import java.util.Locale;

public class EstruturaPara {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        String alunos [] = {"FELIPE", "ALISSON", "RAYAN", "LEVI", "ELTHON"}; // Um array sempre começa do número 0.

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
        }

            System.out.println();

        for (String aluno : alunos) { // Cada execução a variável 'aluno' será atualizada com um novo valor do array 'alunos'.
            System.out.println("Nome do aluno: " + aluno + ".");
        }

        scanner.close();
    }
}
