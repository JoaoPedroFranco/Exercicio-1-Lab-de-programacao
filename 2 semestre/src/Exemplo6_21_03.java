import java.util.Random;

public class Exemplo6_21_03 {

	public static void main(String[] args) {
		
		// Escreva um programa em Java que leia um vetor de 10 posições com valores 
		// inteiros e aleatórios. Em seguida, coloque os elementos do vetor em ordem 
		// crescente.
		
		int[] x=new int[10];
		
		preencher(x);
		imprimir(x);
		ordenar(x);
		imprimir(x);
		
	}

	public static void preencher(int[] x) {
		Random gerador=new Random();
		for(int i=0; i<x.length; i++) {
			x[i]=gerador.nextInt(50);
		}
	}
	
	public static void imprimir(int[] x) {
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
	
	public static void ordenar(int[] x) {
		int aux;
		for(int j=0;j<x.length;j++) {
			for(int i=0; i<x.length-1; i++) {
				if(x[1]>x[i+1]) {
					aux=x[i];
					x[i]=x[i+1];
					x[i+1]=aux;
				}
			}
		}
	}
}
