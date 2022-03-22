import java.util.Scanner;

public class ex1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nc, nl, y;
		boolean  z = false;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Nm de linhas -->" );
		nl=teclado.nextInt();
		System.out.print("Nm de colunas -->" );
		nc=teclado.nextInt();
		int[][] x=new int[nl][nc];
		
		for(int i=0; i<nl;i++) {
			for(int j=0; j<nc; j++) {
				System.out.print("digite um valor x -->" );
				x[i][j]=teclado.nextInt();
						}
			}
		System.out.print("Informe um valor y -->");
		y =teclado.nextInt();
		for(int i=0; i<nl;i++) {
			for(int j=0; j<nc; j++) {
				if(x[i][j]==y) {
				System.out.println("O número da linha e da coluna são " +i +j );
				z = true;
				}
			}	
		}
		if(z == false ){ 
			System.out.println("X não se encontra na matriz");
		
		}
		
	}
}
