package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		
		System.out.print("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7) {
			System.out.println("O aluno foi aprovado!");
		} else if(media < 7 && media >= 5) {
			System.out.println("O aluno est� de recupera��o.");
			
		}else {
			System.out.println("O aluno foi reprovado!");
		}
		
		entrada.close();
	}
}
