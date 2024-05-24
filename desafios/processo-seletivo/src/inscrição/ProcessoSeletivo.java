package inscrição;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String [] args) {

        System.out.println("====== Processo Seletivo ======");

        selecaoCandidatos();

        /* analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0); */
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

    static double salarioDesejado() { // Função para gerar valores aleatórios. | Simulação.
        return ThreadLocalRandom.current().nextDouble(1500, 2200);
    }


}
