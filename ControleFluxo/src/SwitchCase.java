public class SwitchCase {

/**Quando um critério maior também retornar o mesmo valor para o menor, utilizar esse método,
*Assim não será necessário ficar repetindo resultados conforme o exemplo a baixo
*public static void main(String[] args) {
*		String plano = "M"; //M / T
*		
*		if(plano == "B") {
*			System.out.println("100 minutos de ligação");
*		}else if(plano == "M") {
*			System.out.println("100 minutos de ligação");
*			System.out.println("WhatsApp e Instagram grátis");	
*		}else if(plano == "T") {
*			System.out.println("100 minutos de ligação");
*			System.out.println("WhatsApp e Instagram grátis");	
*			System.out.println("5Gb Youtube");	
*		}
*			
*		
*	}
*/
        public static void main(String[] args) {
            String plano = "T"; // M / T
    
            switch (plano) {
                case "T": {
                    System.out.println("5Gb Youtube");
                }
                case "M": {
                    System.out.println("WhatsApp e Instagram grátis");
                }
                case "B": {
                    System.out.println("100 minutos de ligação");
                }
            }
        }
    }
    

