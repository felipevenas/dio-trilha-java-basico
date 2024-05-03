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
   
         // Operadores relacionais: | (==) Diferentes = (!=) (>) (>=) (<) (<=)  
        int num1 = 5;
        int num2 = 15;
        
        boolean simNao = num1 == num2;
            System.out.println("Número 1 é igual ao número 2? " + simNao);
        simNao = num1 != num2;
            System.out.println("Número 1 é diferente ao número 2? " + simNao);

        simNao = num1 >= num2;
            System.out.println("Número 1 é maior ou igual ao número 2? " + simNao);

        if (num1 > num2) {
            System.out.println("Nossa condição é verdadeira.");
        } else {
            System.out.println("Nossa condição é falsa.");    
        }

        String nomeUm = "Felipe";
        String nomeDois = new String("Carlos"); // Criando um novo objetivo (new).
            System.out.println(nomeUm.equals(nomeDois)); // 'Equals' é utilizado para comparar objetivos diferentes.

        // Operadores lógicos: | E = (&&) Ou = (||)
        boolean condicao1 = true;
        boolean condicao2 = false;

        // Exemplo &&
        if (condicao1 && condicao2){
            System.out.println("Ambas condições são verdadeiras.");
        } else {
            System.out.println("Ambas condições são distintas.");
        }

        // Exemplo ||
        if (condicao1 || condicao2){
            System.out.println("Uma das condições são verdadeiras.");
        } else {
            System.out.println("Uma das condições são distintas.");
        }
        

    }
}
