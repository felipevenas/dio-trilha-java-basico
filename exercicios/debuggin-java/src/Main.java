import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int siglaLogin = 0; int siglaPosLogin = 0;
        String loginUsuario = " "; String loginSenha = " ";
        String registrarNome = " "; String registrarSobrenome = " ";
        String registrarUsuario = " "; String registrarSenha = " ";
        String registrarCpf = " "; String registrarEmail = " ";


        System.out.println("Você é novo por aqui?");
        System.out.println("1. Fazer login | 2. Registre-se");
            siglaLogin = scanner.nextInt();

        System.out.println();

        switch (siglaLogin) {
            case 1:{
                System.out.println("Nome de usuário: ");
                    loginUsuario = scanner.nextLine();
                System.out.println("Informe sua senha: ");
                    loginSenha = scanner.nextLine();
                break;
            }
            case 2: {
                System.out.println("Digite seu primeiro nome: ");
                    registrarNome = scanner.nextLine();
                System.out.println("Digite seu sobrenome: ");
                    registrarSobrenome = scanner.nextLine();
                System.out.println("Digite seu CPF: ");
                    registrarCpf = scanner.nextLine();
                System.out.println("Digite seu email: ");
                    registrarEmail = scanner.nextLine();
                System.out.println("Crie seu nome de usuário: ");
                    registrarUsuario = scanner.nextLine();
                System.out.println("Crie sua senha: ");
                   registrarSenha = scanner.nextLine();
                System.out.println("Cadastro realizado com sucesso!");
                break;
            }
            default: {
                System.out.println("Número inválido.");
                return;
            }
        }

        System.out.println();

        System.out.println("========= Bem vindo ao eShop =========");
        System.out.println("O que você deseja fazer?");
        System.out.println("1. Comprar produtos | 2. Acessar meu Marketplace | 3. Acessar perfil");
            siglaPosLogin = scanner.nextInt();

        switch (siglaPosLogin) {
            case 1:{
                System.out.println("y");
                break;
            }
            case 2: {
                System.out.println("x");
                break;
            }
            case 3: {
                System.out.println("========= Dados pessoais =========");
                System.out.println("Nome completo: " + registrarNome.toUpperCase() + " " + registrarSobrenome.toUpperCase() + ".");
                System.out.println("CPF: " + registrarCpf + ".");
                break;
            }
            default: {
                System.out.println("Número inválido.");
                return;
            }
        }

    }
}