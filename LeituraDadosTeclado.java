import java.util.Scanner;

public class LeituraDadosTeclado {
	
	public static void main(String[] args) {
		
		//utilizamos o Scanner para efetuar a leitura de dados digitado pelo usu�rio.
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("*** Exemplo de Cadastro Simples ***");
		System.out.println("* Digite seu nome completo: ");
		String nomeCompleto = entrada.nextLine();/*nextLine para receber uma string*/
		
		System.out.println("* Digite seu apelido: ");
		String apelido = entrada.nextLine();

		System.out.println("* Digite seu telefone: ");
		String telefone = entrada.nextLine();
		
		System.out.println("* Digite a sua idade: ");
		int idade = entrada.nextInt(); /*nextInt para receber uma int*/		
		
		System.out.println("* Digite a seu peso: ");
		double peso = entrada.nextDouble(); /*nextDouble para receber uma double*/
		
		//aqui estamos mostrando na tela o que gravamos nas vari�veis, conforme o que foi informado pelo usu�rio.
		System.out.println("*** Exemplo de Cadastro Simples ***");
		System.out.println("- Nome completo: " + nomeCompleto);
		System.out.println("- Apelido: " + apelido);
		System.out.println("- Idade: " + idade);
		System.out.println("- Peso: " + peso);
		System.out.println("- Telefone: " + telefone);

	} 
}
