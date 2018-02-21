import java.util.Scanner;

public class TrabalhandoComArrays {
	public static void main(String[] args) {
			
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int indice;
		
		/*Exemplo 1*/
		System.out.println("1 - Passar valores entre dois vetores");
		
		for(indice = 0; indice < vetorA.length; indice++) {
			vetorA[indice] = indice + 1;
			System.out.print("Vetor A["+indice +"]: " + vetorA[indice] + ";  ");
		}
		System.out.print("\n");
		for(indice = 0; indice < vetorB.length; indice++) {
			vetorB[indice] = vetorA[indice];
			System.out.print("Vetor B["+indice +"]: " + vetorB[indice] + ";  ");
		}
		
		
		/*Exemplo 2*/
		System.out.println("\n\n2 - Aqui temos um vetor com elementos e o outro vetor de mesmo tamanho " + 
				           "e tipo que recebe o valor do resto da divisão de cada valor por 2");
		
		for(indice = 0; indice < vetorA.length; indice++) {
			vetorA[indice] = indice + 1;
			System.out.print("Vetor A["+indice +"]: " + vetorA[indice] + ";  ");
		}
		System.out.println("");
		for(indice = 0; indice < vetorB.length; indice++) {
			vetorB[indice] = vetorA[indice] % 2;
			System.out.print("Vetor B["+indice +"]: " + vetorB[indice]+ ";  ");
		}
	}
}
