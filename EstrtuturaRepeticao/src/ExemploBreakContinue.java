public class ExemploBreakContinue {
    public static void main(String[] args) {
        int contar [] = {0,1,2,3,4,5,6,7,8,9,10};
        //int numero = 1;

        for( int resultado : contar ) {

            System.out.println(resultado);
            if (resultado==6)
            break;
        }

        for(int numero = 1; numero <=40 ; numero ++) {
            if (numero >= 5 && numero <=30)
            continue;

            System.out.println(numero);
            
            
            
        }

        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
            
            System.out.println(numero);
            
        }
    }
    
}
