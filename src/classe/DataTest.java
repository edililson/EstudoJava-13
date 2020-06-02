package classe;

public class DataTest {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 24;
		d1.mes = 11;
		d1.ano = 1997;
		
		System.out.printf("%d/%d/%d   \n", d1.dia,d1.mes,d1.ano);// \n quebra linha
		
		var d2 = new Data();
		d2.dia = 26;
		d2.mes = 11;
		d2.ano = 1997;
		
		System.out.printf("%d/%d/%d", d2.dia,d2.mes,d2.ano);
	}

}
