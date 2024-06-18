package edu.Anatomia;
public class BoletimEstudantil {
    public static void main(String[] args) {

         int MEDIA_FINAL = 5;

        
        if (MEDIA_FINAL < 6)
            System.out.println("Reprovado");
        else if (MEDIA_FINAL == 6)
            System.out.println("Quase reprova");
        else
            System.out.println("Aprovado nego!");    
    }
}