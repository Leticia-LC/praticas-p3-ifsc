package ifsc;

import java.util.ArrayList;

public class MainAnimal {

	public static void main(String[] args) {

		ArrayList<Gato> gatinhos = new ArrayList<>();

		Gato gato1 = new Gato();
		gato1.setNome("Gato 1");
		gato1.setNumPatas(4);
		gato1.setRaca("Persa");
		gato1.setEcossistema("Casa");
		gato1.setCor("Rajado");
		gato1.setComprimento(20.0f);

		gatinhos.add(gato1);

		Gato gato2 = new Gato();
		gato2.setNome("Gato 1");
		gato2.setNumPatas(4);
		gato2.setRaca("Persa");
		gato2.setEcossistema("Casa");
		gato2.setCor("Rajado");
		gato2.setComprimento(20.0f);

		gatinhos.add(gato2);

		Gato gato3 = new Gato();
		gato3.setNome("Gato 1");
		gato3.setNumPatas(4);
		gato3.setRaca("Persa");
		gato3.setEcossistema("Casa");
		gato3.setCor("Rajado");
		gato3.setComprimento(20.0f);

		gatinhos.add(gato3); 
		
		for (Gato gato : gatinhos) {
			System.out.println(gato.getNome());
			System.out.println(gato.getRaca());
			System.out.println(gato.getComprimento());
			System.out.println(gato.getCor());
			System.out.println(gato.getNumPatas());
			System.out.println(gato.getEcossistema());

		}

		ArrayList<Cachorro> cachorrinhos = new ArrayList<>();

		Cachorro cao1 = new Cachorro(); 
		cao1.setNome("Cao 1");
		cao1.setNumPatas(4);
		cao1.setRaca("SRD");
		cao1.setEcossistema("Casa");
		cao1.setCor("Preto");
		cao1.setComprimento(20.0f);

		Cachorro cao2 = new Cachorro();
		cao2.setNome("Cao 1");
		cao2.setNumPatas(4);
		cao2.setRaca("SRD");
		cao2.setEcossistema("Casa");
		cao2.setCor("Preto");
		cao2.setComprimento(20.0f);

		Cachorro cao3 = new Cachorro(); 
		cao3.setNome("Cao 1");
		cao3.setNumPatas(4);
		cao3.setRaca("SRD");
		cao3.setEcossistema("Casa");
		cao3.setCor("Preto");
		cao3.setComprimento(20.0f);

		for (Cachorro cao : cachorrinhos) { 
			System.out.println(cao.getNome());
			System.out.println(cao.getRaca());
			System.out.println(cao.getComprimento());
			System.out.println(cao.getCor());
			System.out.println(cao.getNumPatas());
			System.out.println(cao.getEcossistema());
		}

	}

}
