package classe;

public class PrimeiroTrauma {
	/*
	 * O desafio � mecher na variavel a que est� fora do metodo main
	 */
	
	 int a = 4;
	
	public static void main(String[] args) {

		//Para acessar ele eu precisei criar uma instancia 
		PrimeiroTrauma variavel = new PrimeiroTrauma();
		System.out.println(variavel.a);
		variavel.a = 10;
		System.out.println(variavel.a);
		
	}

}
