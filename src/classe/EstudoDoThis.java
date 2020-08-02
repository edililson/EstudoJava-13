package classe;

public class EstudoDoThis {

	/*
	 * Esta classe foi copiada da class Data para poder estudar a funcionalidade do this e do metodo This()
	 */
		int dia;
		int mes;
		int ano;
		
		public EstudoDoThis() {
			//dia = 1;
			//mes = 1;
			//ano = 1970;
			//em vez de chama o this.dia iremos usar o This() como função
			this(1,10,2019);
		}
		
		EstudoDoThis(int diaInicial, int mesInicial, int anoInicial){
			//utilizando o this estou acessando a minha variavel de instancia
			this.dia = diaInicial;
			this.mes = mesInicial;
			this.ano = anoInicial;
		}
		
		String obterDataFormatada() {
			// aqui pode usar tanto com co this como sem pos está dentreo da mesma instancia
			return String.format("%d/%d/%d", dia,mes,ano);
		}
		
		void imprimirDataFormatada() {
			System.out.println(obterDataFormatada());
		}
		
		static void teste() {
			//o this não poder ser usado dentro de metodos staticos
			//this.dia = 10;
		}
}
