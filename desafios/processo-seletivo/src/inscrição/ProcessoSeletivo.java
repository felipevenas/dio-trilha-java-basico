package inscrição;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String [] args) {

        imprimirCandidatos();

        selecaoCandidatos();

        String [] candidatos = {"Felipe", "Elthon", "Breno", "Alisson", "Costa", "Levi", "Rayan", "Luisa", "Amanda", "Kaique", "Nicolas"};
        for (String candidato: candidatos) {
            System.out.println("Classificação do candidato, " + candidato + ":");
            analisarCandidato(salarioDesejado());
            System.out.println();
        }

        for (String candidato: candidatos) {
            contatarCandidatos(candidato);
        }

        selecaoCandidatos();

    }

    static void analisarCandidato(double salarioDesejado) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioDesejado) {
            System.out.println("Ligar para o candidato.");
        } else if (salarioBase == salarioDesejado) {
            System.out.println("Lista de espera.");
        } else {
            System.out.println("Segunda chamada.");
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Felipe", "Elthon", "Breno", "Alisson", "Costa", "Levi", "Rayan", "Luisa", "Amanda", "Kaique", "Nicolas"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0; // Índice do array acima. | Ponteiro.
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioDesejado = salarioDesejado();

            System.out.println("O(a) candidato(a) " + candidato.toUpperCase() + " solicitou esse valor de salário: " + salarioDesejado + ".");
            if (salarioBase >= salarioDesejado) {
                System.out.println("O(a) candidato(a) " + candidato.toUpperCase() + " foi selecionado(a) para vaga.");
                candidatosSelecionados++;
            } else {
                System.out.println("O(a) candidato(a) " + candidato.toUpperCase() + " não foi selecionado(a) nesse momento.");
            }

            candidatoAtual++;

            System.out.println();

        }
    }

    static void imprimirCandidatos() {
        String [] candidatos = {"Felipe", "Elthon", "Breno", "Alisson", "Costa", "Levi", "Rayan", "Luisa", "Amanda", "Kaique", "Nicolas"};

        System.out.println("Imprimindo a lista de candidatos: ");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice + 1) + " é o " + candidatos[indice]);
        }
    }

    static void contatarCandidatos(String candidato) {
        String [] candidatos = {"Felipe", "Elthon", "Breno", "Alisson", "Costa", "Levi", "Rayan", "Luisa", "Amanda", "Kaique", "Nicolas"};

            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;

            do {
                atendeu = atender();
                continuarTentando = !atendeu;
                if (continuarTentando)
                    tentativasRealizadas++;
                else
                   System.out.println("Contato realizado com sucesso!");
            } while (continuarTentando && tentativasRealizadas < 3);
                if (atendeu)
                    System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
                else
                    System.out.println("Não conseguimos contato com " + candidato + "," + " número máximo de tentativas excedido.");

            System.out.println();

    }

    static double salarioDesejado() { // Função para gerar valores aleatórios. | MÉTODO AUXILIAR.
        return ThreadLocalRandom.current().nextDouble(1500, 2200);
    }

    static boolean atender() {  // Função booleana para gerar valores aleatórios. | MÉTODO AUXILIAR.
        return new Random().nextInt(3)==1; // Cria uma estrutura randomica; Determina que o valor verdadeiro está entre 1 e 3; '==1' = Valor verdadeiro.
    }
}
