public class ExemploBreakContinue {
    public static void main(String[] args) {
        int contar [] = {0,1,2,3,4,5,6,7,8,9,10};
        //int numero = 1;

        for( int resultado : contar ) {
            if (resultado==6)
            break;
            System.out.println(resultado);

        }

        for( int resultado : contar ) {
            if (resultado==6)
            continue;
            System.out.println(resultado);

        }

        for(int numero = 1; numero <=40 ; numero ++) {
            if (numero >= 5 && numero <=30)
            continue;

            System.out.println(numero);
            
            
            
        }

    }
    
}
