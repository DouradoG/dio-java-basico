package edu.Anatomia;

public class Operadores {
    public static void main(String[] args) {
        //incremento e decremento
        int numero = 5;
            numero++;
            System.out.println(numero);
            
        
        boolean verdadeiro = true;
            System.out.println("Inverteu " + !verdadeiro);

        //Operador ternário, tem a condição de if mas é resumida
        int numero2 = 7;

        String valida = numero > numero2 ? "true" : "false";
            System.out.println(valida);

        //Relacional/comparativo, caso seja número o sinal == pode ser utilizado, mas quando comparado string ou objetos, é melhor utilizar equals
        String nome = "Jorge";
        String nome2 = new String("Jorge");

        String resultado = validarNomes(nome, nome2);
            System.out.println(resultado);

        //Expressão lógica avançada
        int numero1 = 1;
            numero2 = 1;
        if(numero1 == 2 & numero2++ == 1 )
            System.out.println("As 2 condições são verdadeiras");

            System.out.println("O numero 1 agora é " + numero1);
            System.out.println("O numero 2 agora é " + numero2);


        
        
    }

    public static String validarNomes (String a, String b) {
        String resultadoDois = (a.equals(b)) ? a : (a+" e "+b);
        
        return resultadoDois;
    }
}
