public abstract class Veiculo {
    private String chassi;
    public String getChassi(){
        return chassi;
    }
    public String setChassi(String chassi){
        this.chassi = chassi;
        return chassi;
    }
    public abstract void ligar(); // Todos que quiserem ser um veículo, precisarão ter o método 'ligar'.
}
