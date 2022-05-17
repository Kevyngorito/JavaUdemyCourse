package personalChallengers;

import java.util.Scanner;

public class ContaBancariaComSwitch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe seu nome: ");
		String name = input.next();
		System.out.println("         Informe a conta desejada\n"
				+ "[1] Corrente [2] Poupan�a [3] Sal�rio [4] Universit�ria\n ");
		
		
		int account = input.nextInt();
		int outAccount = 0;
		int transferAccount = 0;
		int extractAccount = 0;
		int acceptTerms = 0;
		
		
		switch(account) {
		case 1: 
			System.out.printf("\nOl� %S voc� escolheu a op��o %d conta corrente\n", name, account);
			outAccount = 4;
			transferAccount = 4;
			extractAccount = 4;
			System.out.println("Voc� ter� acesso a 4 saques, 4 transfer�ncias e 4 extratos por m�s.\n");
			break;
		case 2:
			System.out.printf("\nOl� %s voc� escolheu a op��o %d conta corrente\n", name, account);
			outAccount = 2;
			transferAccount = 2;
			extractAccount = 3;
			System.out.println("Voc� ter� acesso a 2 saques, 2 transfer�ncias e 3 extratos por m�s.\n");

			break;
		case 3:
			System.out.printf("\nOl� %s voc� escolheu a op��o %d conta corrente\n", name, account);
			outAccount = 2;
			transferAccount = 0;
			extractAccount = 1;
			System.out.println("Voc� ter� acesso a 2 saques, 0 transfer�ncias e 1 extratos por m�s.\n");
			break;
		case 4:
			System.out.printf("\nOl� %s voc� escolheu a op��o %d conta corrente\n", name, account);
			outAccount = 2;
			transferAccount = 1;
			extractAccount = 1;
			System.out.println("Voc� ter� acesso a 2 saques, 1 transfer�ncias e 1 extratos por m�s.\n");
			break;		
		}
		
		System.out.println("Voc� aceita as condi��es informadas? [1]SIM [2]N�O");
		acceptTerms = input.nextInt();
		
		if(acceptTerms == 1) {
			System.out.println("Parab�ns, voc� abriu uma conta em nosso banco. Seja bem vindo!");
		} else if(acceptTerms == 2) {
			System.out.println("Deseja rever as op��es de contas?");
			String review = input.next();
		}
	
		
		
		input.close();
	}
}
