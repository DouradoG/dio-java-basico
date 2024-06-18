public class SmartTv {
    
    boolean ligada=false;
    int volume=25;
    int canal=10;
   
    
public void ligar(){
    ligada = true;
}

public void desligar(){
    ligada = false;
}

public void aumentarVolume(){
    volume = ++volume;
}

public void diminuirVolume(){
    volume = --volume;
}

public void aumentarCanal(){
    canal = ++canal;
}

public void diminuirCanal(){
    canal = --canal;
}

public void escolherCnal(int canalEscolhido){
    canal=canalEscolhido;
}


                    }
