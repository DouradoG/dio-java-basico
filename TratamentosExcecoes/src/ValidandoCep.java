public class ValidandoCep {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String cep = "1";
        String cepFormatado;
        try {
            cepFormatado = formatarCep(cep);
            System.out.println(cepFormatado);

        } catch (ExecaoPersonalizada e) {
            // TODO Auto-generated catch block
            System.out.println("Por favor, ajuste o Cep, o mesmo não possui 8 digitos");;
        }

    }
    
    static String formatarCep(String cep) throws ExecaoPersonalizada{
        if(cep.length() != 8)
          throw new ExecaoPersonalizada();
        
          //simulando um cep formatado
          return cep.substring(0, 2)+"."+cep.substring(2, 5)+"-"+
          cep.substring(5, 8);
    }
}
