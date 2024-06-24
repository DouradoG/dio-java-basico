public class Ternario {

    //tipo, nome, condição, ?, resultado, :, outra condição ou resultado false
    public static void main(String[] args) {
        int nota = 8;
        String tern = nota >= 7 ? "Passou ótaru"
                    : nota < 7 && nota >=5 ? "Ixiii, recuperação trein"
                    : "Se lascou, reprovou";
        System.out.println(tern); 

    }
    
}
