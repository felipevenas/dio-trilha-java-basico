import java.util.Scanner;
import java.util.Locale;

public class SistemaEscola {
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

        System.out.println();

        media = (nota1 + nota2) / 2;

        if (media >= 6.0) { // If sempre será a primeira estrutura.
            System.out.println("Média final: " + media + ".");
            System.out.println("Status do aluno: Aprovado.");
        } 
        else if (media >= 5.0 && media <= 5.9) { // Else if será a estrutura intermediária.
            System.out.println("Média final: " + media + ".");
            System.out.println("Status do aluno: Recuperação.");
        } 
        else { // Else sempre será a última estrutura.
            System.out.println("Média final: " + media + ".");
            System.out.println("Status do aluno: Reprovado");
        }
            
    }
}