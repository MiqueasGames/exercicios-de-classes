package quadrado;

public class Quadrado {
	float lado;
	
	public Quadrado(float lado) {
		lado = lado;
	}
	
	void MudardeLado(float novoLado) {
		lado = novoLado;
	}
	
	void ValorDoLado() {
		System.out.println(lado);
	}
	
	void CalcularArea(float area) {
		area = lado*4;
	}
}
