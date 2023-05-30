package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		
		Gato g1 = new Gato();
		Cachorro c1 = new Cachorro();
		
		g1.setNome("Mimi");
		g1.setRaca("SRD");
		g1.setComprimento(0.70f);
		g1.setnPatas(4);
		g1.setCor("Laranja");
		g1.setEcossistema("Doméstico");
		
		System.out.println(g1.getNome());
		System.out.println(g1.getRaca());
		System.out.println(g1.getComprimento());
		System.out.println(g1.getnPatas());
		System.out.println(g1.getCor());
		System.out.println(g1.getEcossistema());
	    System.out.println();
		g1.mia();
	    System.out.println();

		c1.setNome("Fred");
		c1.setRaca("Pug");
		c1.setComprimento(1.20f);
		c1.setnPatas(4);
		c1.setCor("Preto");
		c1.setEcossistema("Doméstico");
		
		System.out.println(c1.getNome());
		System.out.println(c1.getRaca());
		System.out.println(c1.getComprimento());
		System.out.println(c1.getnPatas());
		System.out.println(c1.getCor());
		System.out.println(c1.getEcossistema());
	    System.out.println();
		c1.late();
		
		
	}
}