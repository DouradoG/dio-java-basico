package edu.Anatomia;
public class MinhaClasse {


    public static void main(String[] args) {
       String a = "Guilherme";
       String b = "da Silva Dourado";


       String c = nomeCompleto(a, b);

       System.out.println(c);

        
        }

    /* Abaixo exemplo de método */
    public static String nomeCompleto (String nome, String sobrenome) {
        return nome+" "+sobrenome;
    }
}
