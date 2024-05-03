public class Operadores {
    public static void main(String[] args) throws Exception {
        
        // Operador de atribuição: | =
        String nome = "nome";
        int idade = 19;
        double peso = 81.5;
        char sexo = 'M';
        boolean doadorOrgao = true;
        
        // Operadores aritméticos: | + - * / %
        double soma = 10.4 + 12.6;
        int subtracao = 100 - 50;
        int modulo = 18 % 3; // Armazena o resto da divisão.
        double resultado = (10 * 5) + (50 / 5);
        
        // Operadores unários: | (+) (-) (++) (--) (!)
        int numero = 5; 
        numero++; // Incrementa a variável com 1 número.
            System.out.println(numero);
        numero--; // Decrementa a variável com 1 número.
            System.out.println(numero);

        boolean trueOrFalse = true;
            System.out.println(!trueOrFalse); // Nega uma variável do tipo boolean.
        
        // Operadores ternários: | If = (?) Else = (:)
        int a, b;
        a = 8;
        b = 4;

        String resultadoOpTern = a==b ?"Verdadeiro" :"Falso";
            System.out.println(resultadoOpTern);
    }
}
