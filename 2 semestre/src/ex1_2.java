import java.util.*;
public class ex1_2 {

	public static void main(String[] args) {
		int aux;
		
		Random xis=new Random();
		int[][] y=new int[4][4];
		
		for(int i=0; i<4; i++) {
			for(int j = 0; j <4; j++){
			 y[i][j]=xis.nextInt(10);
			 System.out.print(y[i][j]+"\t");}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<4; i++) {
			for(int j = 0; j <4; j++){
				if(j>i) {
				aux=y[i][j];
				y[i][j]=y[j][i];
				y[j][i]=aux;
				}
				System.out.print(y[i][j]+"\t");}
			System.out.println();
			}
			
		}
		
		
		
		
	}
