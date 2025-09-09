//reutilizando a classe de intervalos

package numeros;

import java.util.Scanner;

public class Operações {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		IntervaloNumeros.Intervalo num1 = new IntervaloNumeros.Intervalo();
		IntervaloNumeros.Intervalo num2 = new IntervaloNumeros.Intervalo();
		
		System.out.print("Digite o primeiro número: \n");
		num1.Intervalo1 = en.nextInt();
		
		System.out.print("Digite o segundo número; \n");
		num2.Intervalo2 = en.nextInt();
		
		float soma = num1.Intervalo1 + num2.Intervalo2;
		System.out.println("Operação de adição: " + num1.Intervalo1 + " + " + num2.Intervalo2 + " = " + soma);
		
		float sub = num1.Intervalo1 - num2.Intervalo2;
		System.out.println("Operação de subtração: " + num1.Intervalo1 + " - " + num2.Intervalo2 + " = " + sub);
		
		float multi = num1.Intervalo1 * num2.Intervalo2;
		System.out.println("Operação de multiplicação: " + num1.Intervalo1 + " x " + num2.Intervalo2 + " = " + multi);
		
		float div = num1.Intervalo1 / num2.Intervalo2;
		System.out.println("Operação de divisão: " + num1.Intervalo1 + " / " + num2.Intervalo2 + " = " + div);
		
		en.close();
	}

}
