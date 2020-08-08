package classe;

public class ValorNulo {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		//Não está funcionando pos uma variavel null não aponta para um espaço na memoria reservado (NullPointerException
		
		//nesta çonha eu estou gerando numeros aleatorios, se o numero for maior que 0.5 ele cria uma nova data senão ele atribui null
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		if(d1 != null) {
			d1.mes = 11;
			System.out.println(d1.obterDataFormatada());
		}
		
		String s2 = Math.random() > 0.5 ? "Opaa!" : null;
		if(s2 != null) {
			System.out.println(s2.concat(":::"));
		}
		
	}

}
