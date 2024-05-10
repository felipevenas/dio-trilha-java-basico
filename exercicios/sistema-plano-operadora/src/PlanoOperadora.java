import java.util.Scanner;
import java.util.Locale;

public class PlanoOperadora {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String plano;

        System.out.println("Bem-vindo à Central de Vendas da Vivo.");
        
            Thread.sleep(1000); // Adiciona um delay para a mensagem aparecer na tela.
        System.out.println("Escolha o número que representa os nossos pacotes disponíveis: ");
            Thread.sleep(1000);
        System.out.println("1. Plano Básico | 2. Plano Padrão | 3. Plano Ultra");
            plano = scanner.nextLine();
        
        scanner.close();

        System.out.println();

        switch (plano) {
            case "1": {
                System.out.println("Plano Básico");
                    System.out.println();
                System.out.println("100 minutos de ligação.");
                System.out.println("8 gigas de internet.");
                System.out.println("R$24.90 p/ mês.");
                break;
            }
            case "2": {
                System.out.println("Plano Padrão");
                    System.out.println();
                System.out.println("120 minutos de ligação.");
                System.out.println("12 gigas de internet.");
                System.out.println("Whatsapp e Instagram ilimitados.");
                System.out.println("R$34.90 p/ mês.");
                break;
            }
            case "3": {
                System.out.println("Plano Ultra");
                    System.out.println();
                System.out.println("140 minutos de ligação.");
                System.out.println("16 gigas de internet.");
                System.out.println("Whatsapp - Instagram - Tiktok ilimitados.");
                System.out.println("R$49.90 p/ mês.");
                break;
            }
            default: {
                System.out.println("Valor indefinido.");
                break;
            }


        }

    }
}
