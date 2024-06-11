public class Autodromo {
    public static void main (String[] args){
        Carro camaro = new Carro(); // Criando o objeto do carro.
        camaro.setChassi("1106202401");
        camaro.ligar();

        System.out.println();

        Moto xj6 = new Moto(); // Criando o objeto da moto.
        xj6.setChassi("1106202431");
        xj6.ligar();

        System.out.println();

        Veiculo coringa = xj6; // Testando o polimorfismo = Duas formas diferentes de ligar o veículo coringa...
        coringa.ligar();
    }
}
