import java.util.Scanner;

public class exemplo_vetor2 {

	public static void main(String[] args) {
		
		//Escreva um programa em Java que leia 6 valores inteiros. O programa deverá ter 
		//um método para determinar e retornar o  maior valor digitado.
		
		Scanner teclado=new Scanner(System.in);
		int[] x=new int[6];
		int maior;
		
		for(int i=0; i<x.length; i++) {
			System.out.print("valor --> ");
			x[1]=teclado.nextInt();
		}
		
		maior=calcularMaior(x);
		
		System.out.println("maior entre os três valores = "+maior);
		
	}

	public static int calcularMaior(int[] x) {
		int aux=x[0];
		for(int i=0; i<x.length; i++) {
			if(x[i]>aux) {
				aux=x[i];
			}
			
		}
		return aux;
	}
}
