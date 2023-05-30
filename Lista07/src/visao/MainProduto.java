package visao;

import java.util.ArrayList;

import controle.ProdutoDAO;
import modelo.Produto;

public class MainProduto {

	public static void main(String[] args) {
		Produto p = new Produto();

		p.setNome("Òculos de sol");
		p.setCodBarras(49741280347548l);

		ProdutoDAO dao = new ProdutoDAO();
		dao.inserir(p);

		ArrayList<Produto> listar = dao.listar();
		for (Produto produto : dao.listar()) {
			System.out.println(produto.getNome());
		}
		
		p.setNome("Anel");
		dao.alterar(p);
		for (Produto produto : dao.listar()) {
			System.out.println(produto.getNome());
		}
		
		dao.excluir(p);
		for (Produto produto : dao.listar()) {
			System.out.println(produto.getNome());

		}
		
		System.out.println(dao.listar());
	}
}