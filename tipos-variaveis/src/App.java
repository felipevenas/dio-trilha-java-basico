public class App {
    public static void main (String[] args) {
        
        final int ANO_NASCIMENTO = 2005; // O termo 'final' indica que a variável seguinte não poderá ser alterada. Além disso, nomeamos a variável sempre em caixa alta nestes casos. 
        int idade;
        String nome = "Felipe";
        double salario = 1400;
        long cep = 41650195;
        idade = 2024 - ANO_NASCIMENTO;

            System.out.println("Hello World!");
            System.out.println("Nome: " + nome + ".");
            System.out.println("Idade: " + idade + ".");
            System.out.println("Salário:: " + salario + ".");
            System.out.println("CEP: " + cep + ".");
    }
}