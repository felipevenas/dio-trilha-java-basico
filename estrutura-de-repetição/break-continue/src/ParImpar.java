import java.util.Scanner;
import java.util.Locale;

public class ParImpar {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        
        System.out.println("Digite um número: ");
            int x = scanner.nextInt();
        scanner.close();

        
    
    }
}
