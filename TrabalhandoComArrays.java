import java.util.Scanner;

public class TrabalhandoComArrays {
	public static void main(String[] args) {
			
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		double[] vetorC = new double[10];
		int indice;
		int multiploDeCinco = 0;
		
		System.out.println("*** LISTA DE EXEMPLOS DE OPERAÇÕES EM VETORES ***");
		
		for(indice = 0; indice < vetorA.length; indice++) {
			vetorA[indice] = indice + 1;
		}
		printaVetor(indice, vetorA);
		System.out.println("");
		
		System.out.println("1 - Passar valores entre dois vetores");
		for(indice = 0; indice < vetorB.length; indice++) {
			vetorB[indice] = vetorA[indice];
			System.out.print("Vetor B["+indice +"]: " + vetorB[indice]+ ";  ");
		}
		
		System.out.println("\n\n2 - Aqui temos um vetor com elementos inteiros e o outro vetor de mesmo tamanho " + 
				           "e tipo que recebe o valor do resto da divisão de cada valor, do primeiro vetor, por 2");
		for(indice = 0; indice < vetorB.length; indice++) {
			vetorB[indice] = vetorA[indice] % 2;
			System.out.print("Vetor B["+indice +"]: " + vetorB[indice]+ ";  ");
		}		
		
		System.out.println("\n\n3 - Aqui temos um vetor com elementos inteiros e o outro vetor de mesmo tamanho " + 
				           "e tipo que recebe o quadrado dos valores do primeiro vetor.");
		for(indice = 0; indice < vetorB.length; indice++) {
			vetorB[indice] = vetorA[indice] * vetorA[indice];
			System.out.print("Vetor B["+indice +"]: " + vetorB[indice]+ ";  ");
		}
		
		System.out.println("\n\n4 - Aqui temos um vetor com elementos inteiros e o outro vetor de mesmo tamanho " + 
				           "e tipo que recebe a raíz quadrada do primeiro vetor.");
		for(indice = 0; indice < vetorB.length; indice++) {
			vetorB[indice] = (int) Math.sqrt(vetorA[indice]);
			System.out.print("Vetor B["+indice +"]: " + vetorB[indice]+ ";  ");
		}
		
		System.out.println("\n\n5 - Aqui temos dois vetores com elementos inteiros e um terceiro vetor " + 
				           "que recebe divisão do primeiro pelo segundo vetor.");
		for(indice = 0; indice < vetorC.length; indice++) {
			vetorC[indice] = vetorA[indice]/ (double) vetorB[indice];
			System.out.print("Vetor C["+indice +"]: " + vetorC[indice]+ ";  ");
		}
		
		System.out.println("\n\n6 - Aqui temos um vetor com elementos inteiros onde os valores "
				+ "multiplos de 5 exibem o resultado de sua soma");
		for(indice = 0; indice < vetorB.length; indice++) {
			if(vetorA[indice]%5 == 0) {
				multiploDeCinco += vetorA[indice];
				System.out.print("Valor multiplo de 5: " + vetorA[indice] + ";  ");
			}
		}
	}
	
	private static void printaVetor(int indice, int vetor[]) {
		for(indice = 0; indice < vetor.length; indice++) {
			System.out.print("Vetor A["+indice +"]: " + vetor[indice] + ";  ");
		}
		System.out.println("");
	}
}
