package classe;

public class ProdutoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p1 = new Produto("Notebook", 4356.25);
		
		
		var p2 = new Produto();
		p2.nome = "Caneca";
		p2.preco = 12.50;
		
		Produto.desconto = 0.5;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.2);
		
		
		double mediaCarrinho = (precoFinal1 + precoFinal2) /2;
		System.out.printf("Médoa do carrinho é: R$%.2f.", mediaCarrinho);
		
		
	}

}
