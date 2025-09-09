package classenome;

import java.util.Scanner;

public class ApresentarNome {
	public static void main(String[]args) {
	Scanner en = new Scanner(System.in);
		
	ArmazenarNome.Nome primeiroNome = new ArmazenarNome.Nome();
	ArmazenarNome.Sobrenome sobrenome = new ArmazenarNome.Sobrenome();
	
	System.out.println("Digite o seu nome: ");
	primeiroNome.nome = en.nextLine();
	
	System.out.println("Digite o seu Sobrenome: ");
	sobrenome.Sobrenome = en.nextLine();
	
	en.close();
	
	System.out.println(primeiroNome.nome + " " + sobrenome.Sobrenome);
	}
}
