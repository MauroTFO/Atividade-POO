package org.listaalgoritmos.template;

public class RespostaListaExercicio {

	/*
	 * Utilize apenas o método main para testar a implementação dos métodos.
	 * Não se faz necessário implementar dentro do escopo do método.
	 */
	public static void main(String[] args) {

	}

	/**
	 * Método deve calcular o IMC utilizando peso e altura. Como resultado
	 * o método deve retornar uma variável resultado do tipo float.
	 * 
	 * @param peso
	 * @param altura
	 * @return resultado
	 */
	public static float calcularImc(float peso, float altura) {
		
		float imc = peso / (altura * altura);
		return imc;
	}

	/**
	 * Método deve calcular a área do trapézio independente da unidade de medida.
	 * Como resultado, o método deve retornar a área calculada.
	 * 
	 * @param baseMaior
	 * @param baseMenor
	 * @param altura
	 * @return areaTrapezio
	 */
	public static float calcularAreaTrapezio(float baseMaior, float baseMenor, float altura) {
		
		float trapezio = ((baseMaior + baseMenor) * altura) / 2;
		return trapezio;
	}

	/**
	 * O método deve calcular o maior entre dois inteiros, que são fornecidos
	 * como argumento do método. O retorno deve ser o maior valor dado
	 * como entrada, sendo do tipo inteiro.
	 * 
	 * @param a
	 * @param b
	 * @return maiorValor
	 */
	public static int maiorEntreDoisInteiros(int a, int b) {
		
		if (a > b)
			return a;
		else
			return b;
	}

	/**
	 * Método verifica se o número apresentado como argumento é ímpar ou par.
	 * caso seja par, o retorno do método deve ser verdadeiro. Caso contrário,
	 * o valor retornado deve ser falso.
	 * 
	 * @param numero
	 * @return condicao
	 */
	public static boolean verificarParImpar(int numero) {
		
		if (numero % 2 == 0)
			return true;
		else
			return false;
	}

	/**
	 * Método calcula a média aritmetica dos elementos float a partir de um array.
	 * O retorno deve ser o resultado do cálculo da média.
	 * 
	 * @param notas
	 * @return media
	 */
	public static float calcularMediaNotas(float[] notas) {

		float soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma = soma + notas[i];
		}
		float media = soma / notas.length;
		return media;
	}

	/**
	 * Método imprime array de inteiros no sentido inverso, separando os elementos
	 * por vírgula.
	 * O último elemento impresso não deve preceder vírgula. Use o
	 * System.out.print() para imprimir os valores.
	 * Os elementos devem ser impresso numa única linha.
	 * 
	 * @param array
	 */
	public static void imprimirArrayInverso(int[] array) {
		
		for (int i = array.length - 1; i > 0; i--)
			System.out.print(array.length + ",");
	}

	/**
	 * Método deve imprimir os elementos primos de um array de inteiros. O formato
	 * da impressão
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os
	 * elementos e
	 * após o último elemento. Utilize System.out.print()
	 * 
	 * @param array
	 */
	public static void imprimirElementosPrimos(int[] array) {
		

		int contar = 0;
			for(int i = 1; i <= array.length; i++) {
				if(array.length % i == 0) {
					contar += 1;
				}
			}
			if(contar == 2) {
				System.out.print(array.length + " ");
		}
	}

	/**
	 * Método deve imprimir os elementos ímpares de um array de inteiros. O formato
	 * da impressão
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os
	 * elementos e
	 * após o último elemento. Utilize System.out.print()
	 * 
	 * @param array
	 */
	public static void imprimirElementosImpares(int[] array) {

		for (int i = 0; i < array.length; i++) { 
			if (i % 2 != 0){
				System.out.print(array.length + " ");
			}
		}
	}

	/**
	 * Método deve imprimir os elementos pares de um array de inteiros. O formato da
	 * impressão
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os
	 * elementos e
	 * após o último elemento. Utilize System.out.print()
	 * 
	 * @param array
	 */
	public static void imprimirElementosPares(int[] array) {
		
		for (int i = 0; i < array.length; i++) { 
			if (i % 2 == 0){
				System.out.print(array.length + " ");
			}
		}
	}

	/**
	 * Método deve imprimir o maior e o menor elemento de um array de inteiros. O
	 * formato da impressão
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os
	 * elementos e
	 * após o último elemento. Utilize System.out.print()
	 * 
	 * @param array
	 */
	public static void imprimirMaiorMenorElemento(int[] array) {
		
		int Maior = array[0];
		int Menor = array[0];
		for(int elemento : array) {
			if(Maior < elemento) {
				Maior = elemento;
			}if(Menor > elemento) {
				Menor = elemento;
			}
		}
		System.out.print(Maior + " " + Menor + " ");
	}

	/**
	 * O método calcula a média aritmética dos elementos de um array de inteiros.
	 * Como resultado, o valor da média deve ser retornado no método.
	 * 
	 * @param array
	 * @return media
	 */
	public static float calcularMediaAritmetica(int[] array) {
		
		int soma = 0;
		for(int elemento : array) {
			soma += elemento;
		}
		return soma/array.length;
	}

}
