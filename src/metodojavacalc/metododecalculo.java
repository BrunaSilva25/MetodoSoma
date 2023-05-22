package metodojavacalc;
import java.util.Scanner;

public class metododecalculo {
	

		public static void main(String[] args) {
		System.out.println("digite numero pra a:");
		Scanner entrada = new Scanner(System.in);
		int a = entrada.nextInt();
		
		System.out.println("digite numero pra a:");
		Scanner entrada2 = new Scanner(System.in);
		int b = entrada2.nextInt();
		
		int total = metododecalculo.somar(a, b);
	    System.out.println(total);
		}
	  //metodo somar
		public static int somar(int a, int b) {
			return(a+b);
		}
		
		
	}


