
public class Carro extends Veiculo {

    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Ligando o carro...");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo combustível...");
    }
    private void confereCambio(){
        System.out.println("Checando se o câmbio está na primeira...");
    }

}
