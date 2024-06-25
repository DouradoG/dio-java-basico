import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TratamentoTryCatch {
    public static void main(String[] args) throws Exception {
    try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo " + nome + " Entendendo a diferença agregador toUpperCase " + nome.toUpperCase());
        System.out.println("Tenho " + idade + " Anos");
        System.out.println("Altura " + altura);
    } catch (InputMismatchException e) {
        System.out.println("Por favor, insira altura válida, substitua , por .");
    }

    }
}
