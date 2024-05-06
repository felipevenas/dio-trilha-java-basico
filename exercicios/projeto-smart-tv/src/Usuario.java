public class Usuario {
    public static void main(String[] args) {
        
        SmartTV smartTV = new SmartTV(); 

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();

            System.out.println("Estado atual da SmartTV: " + smartTV.estadoTv);
            System.out.println("Canal atual: " + smartTV.canal);
            System.out.println("Volume atual: " + smartTV.volume);
        
        System.out.println();

        smartTV.pesquisarCanal(13);
            System.out.println("Canal atual: " + smartTV.canal);

        smartTV.ligar ();
            System.out.println("Novo estado da TV: " + smartTV.estadoTv);

        smartTV.desligar ();
            System.out.println("Novo estado da TV: " + smartTV.estadoTv);

        smartTV.aumentarVolume ();
            System.out.println("Volume atual: " + smartTV.volume);
    }   
}