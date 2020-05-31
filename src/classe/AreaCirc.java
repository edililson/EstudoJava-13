package classe;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.1415;
	//static pós é uma variavel statica da classe e final diz que é o valor final/não pode ser alterada
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		//Math.pow é utilizado para mutiplicar ao quadrado ou elevado a 2 potencia
		return PI * Math.pow(raio, 2);
	}
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
