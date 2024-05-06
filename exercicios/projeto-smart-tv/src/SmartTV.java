public class SmartTV {

    boolean estadoTv; 
    int canal = 1;
    int volume = 25;

    public void pesquisarCanal(int novoCanal){ // pesquisarCanal é um MÉTODO DE CLASSE e int novoCanal é um parâmetro exclusivo desse método.
        canal = novoCanal;
    }

    public void subirCanal(){
        canal++;
    }

    public void descerCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume ++;
    }

    public void diminuirVolume(){
        volume --;
    }

    public void ligar(){
        estadoTv = true;
    }
    
    public void desligar(){
        estadoTv = false;
    }

}
