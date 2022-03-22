import java.util.Scanner;

public class Exemplo5_21_03 {

	public static void main(String[] args) {
		
		//Escreva um programa em Java para calcular as raízes de uma equação do segundo 
		//grau. O seu programa deverá ter um método para calcular e retornar o valor do 
		//delta e também um método para calcular e retornar as duas raízes da equação.
		
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
			System.out.println("os valores não formam uma equação do 2o grau");
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
