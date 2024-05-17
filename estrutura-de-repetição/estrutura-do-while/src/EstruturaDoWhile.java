import java.util.Random;

public class EstruturaDoWhile {
    public static void main(String[] args) throws Exception {
        
        /* Nesse caso, a estrutura será acionada PELO MENOS uma vez, fazendo a verificação booleana após a primeira tentativa.*/
        do {
           System.out.println("Telefone tocando..."); 
        } while (tocando());
            System.out.println();
        System.out.println("Alô?");
    }

    private static boolean tocando() { // Novo método para criar valores aleatórios para caracterizar as tentativas do telefone tocando...
        boolean atendeu = new Random().nextInt(3)==1; // Valores aleatórios entre 1-3, caso o resultado seja 1, ele atendeu.
            System.out.println("Atendeu? " + atendeu);
        return ! atendeu; // ! é um operador de negação. LEMBRE-SE!
    }

}
