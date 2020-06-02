package classe;


public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " "+b);
		
		Data d1 = new Data(24, 11, 1997);
		Data d2 = d1;//atribuição por referencia (objeto)
		
		d1.dia = 31;
		d2.mes = 10;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPAdrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	
	}
	
	static void voltarDataParaValorPAdrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
