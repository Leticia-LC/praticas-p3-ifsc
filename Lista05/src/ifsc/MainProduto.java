package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto();
		
		ArrayList<Produto> produtos = new ArrayList<>();
		
		p1.setNome("Shampoo");
		p1.setCodBarras(267890878l);
		p1.setPreco(27.80);
		p1.setFornecedor("Pantene");
		produtos.add(p1);
		
		p2.setNome("Base");
		p2.setCodBarras(74684055l);
		p2.setPreco(200.00);
		p2.setFornecedor("WePink");
		produtos.add(p2);
		
		p3.setNome("Chuck 70");
		p3.setCodBarras(58964123l);
		p3.setPreco(500.00);
		p3.setFornecedor("Converse");
		produtos.add(p3);
		
        for (Produto produto : produtos) {
			
			System.out.println(produto.getNome());
			System.out.println(produto.getCodBarras());
			System.out.println(produto.getPreco());
			System.out.println(produto.getFornecedor());
	}
	}
}


