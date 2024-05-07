import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome, sobrenome;
        int idConta, idAgencia, idAgenciaDigito; 
        double saldo = 3000;

        System.out.println("Por favor, digite seu primeiro nome: ");
            nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
            sobrenome = scanner.nextLine();

        String nomeCompleto = (nome + " " + sobrenome);

        System.out.println("Agora, digite o número de sua conta | XXXX: ");   
            idConta = scanner.nextInt();
        
        System.out.println("Digite os três números da sua agência | XXX: ");
            idAgencia = scanner.nextInt();

        System.out.println("Dígito | " + idAgencia + "-?: ");
            idAgenciaDigito = scanner.nextInt();

            System.out.println();
            
        System.out.println("Olá " + nome + ", me chamo Eko, Assistente Virtual do uBank.");
        System.out.println("Gostaria de lhe dar boas-vindas para sua nova experiência financeira inovadora!");

            System.out.println();

        System.out.println("Esses são os seus dados da sua nova conta digital: ");
        System.out.println("Nome: " + nomeCompleto + ".");
        System.out.println("Conta: " + idConta + " | Agência: " + idAgencia + "-" + idAgenciaDigito + ".");
        System.out.println("Saldo disponível: R$" + saldo + ".");

            System.out.println();

        System.out.println("Avalie o nosso aplicativo em uma escala de 1-5: ");
            int avaliacaoApp = scanner.nextInt();

            System.out.println();
        
        System.out.println("Obrigado pela avaliação!");

        scanner.close();
    }
}
