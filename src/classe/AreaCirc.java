package classe;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.1415;
	//static p�s � uma variavel statica da classe e final diz que � o valor final/n�o pode ser alterada
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		//Math.pow � utilizado para mutiplicar ao quadrado ou elevado a 2 potencia
		return PI * Math.pow(raio, 2);
	}
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
