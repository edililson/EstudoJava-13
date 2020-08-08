package classe.desafioComida;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.100);
		
		Pessoa p1 = new Pessoa("David", 80);
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
	}

}