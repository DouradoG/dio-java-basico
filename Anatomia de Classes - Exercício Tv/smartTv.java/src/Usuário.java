public class Usuário {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
            System.out.println("Está ligada? "+smartTv.ligada+" Volume:"+smartTv.volume+" Canal futuramente ");

        
        smartTv.ligar();
            System.out.println("Estado atual "+smartTv.ligada+" Volume atual:"+smartTv.volume);
        
        smartTv.diminuirVolume();
            System.out.println("Estado atual "+smartTv.ligada+" Volume atual:"+smartTv.volume);
        
        smartTv.diminuirVolume();
            System.out.println("Estado atual "+smartTv.ligada+" Volume atual:"+smartTv.volume);
        
        smartTv.aumentarCanal();
        System.out.println("Estado atual "+smartTv.ligada+" Volume atual:"+smartTv.volume+" Cnal atual:"+smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Estado atual "+smartTv.ligada+" Volume atual:"+smartTv.volume+" Cnal atual:"+smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
                System.out.println("Estado atual "+smartTv.ligada+" Volume atual:"+smartTv.volume+" Cnal atual:"+smartTv.canal);
        
        smartTv.escolherCnal(93);
                System.out.println("Estado atual "+smartTv.ligada+" Volume atual:"+smartTv.volume+" Cnal atual:"+smartTv.canal);



        
        




        
    }    
}
