package controle;

import java.util.ArrayList;
import modelo.Produto;

public class ProdutoDAO {
	
	private ArrayList<Produto> lista;
	
	public ProdutoDAO(){
		
		lista = new ArrayList<>();
	}
	
	public boolean inserir (Produto p) {
		
		lista.add(p); 
		return true;
	}
	
	public boolean alterar(Produto produtoNovo) {
		for(Produto produto  : lista) {
			if(produto.getCodBarras() == produtoNovo.getCodBarras()) {
			   produto.setNome(produtoNovo.getNome());
        		return true;
		}
	}
		       return false; 
	}	
	public boolean excluir(Produto produtoExcluir) {
		for (Produto produto : lista) {
			if(produto.getCodBarras() == produtoExcluir.getCodBarras()) {
				lista.remove(produto);
		        return true;
			}
		}
	        return false; 
	}
	
	public ArrayList<Produto> listar() {
		return this.lista; 
	}
}