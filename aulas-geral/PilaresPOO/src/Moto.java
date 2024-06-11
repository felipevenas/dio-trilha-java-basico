public class Moto extends Veiculo {

    public void ligar(){
        confereCombustivel();
        System.out.println("Ligando a moto...");
        levantaPezinho();
    }
    private void confereCombustivel(){
        System.out.println("Conferindo combustível...");
    }
    private void levantaPezinho(){
        System.out.println("Levantando o apoio da moto...");
    }

}
