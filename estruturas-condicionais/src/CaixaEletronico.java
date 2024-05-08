import java.util.Scanner;
import java.util.Locale;

public class CaixaEletronico {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nomeAluno;
        double nota1, nota2, media;

        System.out.println("Digite o nome do aluno: ");
            nomeAluno = scanner.nextLine();
        
        System.out.println("Digite a primeira nota: ");
            nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
            nota2 = scanner.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 6.0) {
            System.out.println("Média final: " + media + ".");
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Média final: " + media + ".");
            System.out.println("Aluno reprovado.");
        }
            

    }
}