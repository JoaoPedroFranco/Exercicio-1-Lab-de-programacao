import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		//Escreva um programa em Java que leia 3 valores inteiros. O programa deverá ter 
		//um método para determinar e retornar o  maior valor digitado.
		
		Scanner teclado=new Scanner(System.in);
		int a,b,c,maior;
		
		System.out.println("1o valor --> ");
		a=teclado.nextInt();
		System.out.println("2o valor --> ");
		b=teclado.nextInt();
		System.out.println("3o valor --> ");
		c=teclado.nextInt();
		
		maior=calcularMaior(a,b,c);
		
		System.out.println("maior entre os três valores = "+maior);
		
	}

	public static int calcularMaior(int a,int b,int c) {
		if(a>b && a>c) {
			return a;
		} else if(b>c) {
			return b;
		} else {
			return c;
		}
		}
}
