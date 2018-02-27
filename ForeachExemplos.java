public class ForeachExemplos {
	public static void main(String[] args) {
	
		/*Neste exemplo estamos preenchendo um vetor/array de 10 posi��es 
		 * com valores de "indice + 2".
		 * 
		 * ***Lembrando que indice � uma variavel tipo int.***
		 * 
		 *  Ap�s o preenchimento, em um for tradicional, n�s estamos 
		 *  utilizando um foreach (que aqui aparece como "for" mesmo
		 *  mas, sua estrutura de declara��o � diferente.*/
		
		
		int[] arrayParaPercorcorrer = new int[10];
		int indice;

		/* F O R *///preenchimento do array utilizando o for tradicional
		
		for(indice = 0; indice < arrayParaPercorcorrer.length; indice++) {
			arrayParaPercorcorrer[indice] = indice + 2;
		}
		
		
		/* F O R E A C H *///foi criada uma vari�vel (percorrer) para percorrer o array (arrayParaPercorcorrer)
		
		for (int percorrer : arrayParaPercorcorrer) {			
			System.out.println(percorrer);
		}
	}
}
