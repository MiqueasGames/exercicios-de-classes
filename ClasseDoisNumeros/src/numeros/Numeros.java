package numeros;

import java.util.Scanner;

public class Numeros {
	public static void main(String[]args){
	Scanner en = new Scanner(System.in);
	
	IntervaloNumeros.Intervalo inter1 = new IntervaloNumeros.Intervalo();
	IntervaloNumeros.Intervalo inter2 = new IntervaloNumeros.Intervalo();
	IntervaloNumeros.Intervalo troca = new IntervaloNumeros.Intervalo();
	
	System.out.println("Digite o primeiro número");
	inter1.Intervalo1 = en.nextInt();
	
	System.out.println("Digite o primeiro número");
	inter2.Intervalo2 = en.nextInt();
	
	if(inter1.Intervalo1 > inter2.Intervalo2) {
		
		System.out.println("O primeiro número não pode ser maior que o segundo. Realizando troca......");
	
		troca.Troca = inter1.Intervalo1;
		inter1.Intervalo1 = inter2.Intervalo2;
		inter2.Intervalo2 = troca.Troca;
		
	}
	
	System.out.print("Intervalo de " + inter1.Intervalo1 + " até " + inter2.Intervalo2 + "\n");
	
	for(int i = 0; inter1.Intervalo1 < inter2.Intervalo2; i++) {
		
		System.out.print( + inter1.Intervalo1 + ", ");
		inter1.Intervalo1++;
		
	}
	
	en.close();
	
	}
	
	

}
