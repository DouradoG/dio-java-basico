// ExemploFor.java
public class ExemploFor {
	public static void main(String[] args) {
		//Primeira forma apresentada
		for(int carneirinhos = 1 ; carneirinhos >=-20; carneirinhos --) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}

		/*Outra forma que pode ser realizda, é declarando variável primeiro, 
		inserindo a condição de parada, e após a impressão, a manipulação da variável
		 */
		int carneirinhos = 1;
		for( ; carneirinhos <=20; ) {
			 System.out.println(carneirinhos + " - Carneirinho(s)");
			 carneirinhos ++;
		}

		//Exemplo com maior complexidade
	String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	for (int x=0; x<alunos.length; x++) {
		System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	}
	
	String teste [] = {"teste1", "taquera", "rei"};
	System.out.println(teste[2]);

	String teste2 = "teste2555";
	int leng = teste2.length();
	System.out.println(leng);


	}
}
