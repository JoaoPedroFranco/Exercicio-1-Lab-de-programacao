import java.util.Scanner;

public class Exemplo5_21_03 {

	public static void main(String[] args) {
		
		//Escreva um programa em Java para calcular as ra�zes de uma equa��o do segundo 
		//grau. O seu programa dever� ter um m�todo para calcular e retornar o valor do 
		//delta e tamb�m um m�todo para calcular e retornar as duas ra�zes da equa��o.
		
		Scanner t=new Scanner(System.in);
		double a,b,c,d;
		
		System.out.print("a--> ");
		a=t.nextDouble();
		System.out.print("b--> ");
		b=t.nextDouble();
		System.out.print("c--> ");
		c=t.nextDouble();
		
		if(a!=0) {
			d=delta(a,b,c);
			if(d>=0) {
				double[] x=raiz(a,b,d);
				System.out.println("x1 = "+x[0]);
				System.out.println("x2 = "+x[1]);
			}
		} else {
			System.out.println("os valores n�o formam uma equa��o do 2o grau");
		}

	}
	
	public static double delta(double a, double b, double c) {
		return(b*b-4*a*c);
	}
	
	public static double[] raiz(double a, double b, double d) {
		double[] x=new double[2];
		x[0]=(-b+Math.sqrt(d))/(2*a);
		x[1]=(-b-Math.sqrt(d))/(2*a);
		return x;
	}
}
