import java.util.Random;
import java.util.Scanner;

public class ex1_3 {

	public static void main(String[] args) {
		// Escreva um programa em Java para fazer a corre��o de uma prova contendo 10 
		//	quest�es de m�ltipla escolha (a, b, c, d ou e) de uma turma contendo X alunos (o n�mero de alunos 
//			dever� ser informado pelo usu�rio da aplica��o). O programa dever� gerar as respostas dos alunos 
//			de forma aleat�ria e as respostas dever�o ser impressas no v�deo no formato de uma tabela 
//			(conforme apresentado durante as aulas). Em seguida, o programa dever� ler o gabarito da prova 
//			(a entrada dever� ser informada pelo usu�rio da aplica��o). O seu programa dever� emitir um 
//		    relat�rio contendo a nota de cada aluno e a sua situa��o (aprovado ou reprovado) considerando 
//		    que a nota para aprova��o dever� ser maior ou igual a 7. 
		
		int aux, nr, nota = 0;
		Scanner t=new Scanner(System.in);
		Random y=new Random();
		String[] respostas=new String[10];
		String[] gabarito=new String[10];
		
		
		System.out.print("Quantos alunos tem na sala? --> ");
		nr=t.nextInt();
		
		int[]x1=new int[10];
		for(int i = 0; i < 10;i++) {
			System.out.print("Qual a respodta da quest�o "+(i+1)+"?");
			gabarito[i] = t.next();
		}
	
		
			
		for(int i = 0; i < nr; i++) {
			for(int j=0; j<10; j++) {
					aux= y.nextInt(5);
					if(aux==0) {
						respostas[j] = "a";
					}
					if(aux==1) {
						respostas[j] = "b";
					}
					if(aux==2) {
						respostas[j] = "c";
					}
					if(aux==3) {
						respostas[j] = "d";
					}
					if(aux==4) {
						respostas[j] = "e";
					}
					System.out.print(respostas[j]+ "\t");
		}
			System.out.println();
			
		for(int j = 0; j < 10; j++) {
			if(respostas[i].equals(gabarito[i])) {
					nota++;
				}
		}
		
		System.out.println();
		
		if(nota>=7) {
			System.out.println(";) aprovado");
		}else {
			System.out.println(":( reprovado");
		}
		
		}
		
		
	}
}
		
		
		
		 

	

