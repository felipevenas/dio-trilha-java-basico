import java.util.Scanner;
import java.util.Locale;

public class SistemaMedida {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String sigla = " ";

        System.out.println("Escolha seu tamanho:");
        System.out.println("P | M | G | GG | XG");
            sigla = scanner.nextLine();

            scanner.close();

        System.out.println();
        
        switch(sigla) {
            case "P":{
                System.out.println("Tamanho escolhido: Pequeno.");
                break;
            }
            case "M":{
                System.out.println("Tamanho escolhido: Médio.");
                break;
            }
            case "G":{
                System.out.println("Tamanho escolhido: Grande.");
                break;
            }
            case "GG":{
                System.out.println("Tamanho escolhido: Muito grande.");
                break;
            }
            case "XG":{
                System.out.println("Tamanho escolhido: Extra grande.");
                break;
            }
            default: {
                System.out.println("Tamanho indefinido.");
            }
        }
    }
}
