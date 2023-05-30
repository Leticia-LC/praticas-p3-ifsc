package ex2;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal nomeP = new Animal();
		nomeP.nomeCient = "Felis catus";
		nomeP.familia = "Felídeos";
	    nomeP.reino = "Animalia";
	    
	    System.out.println(nomeP.nomeCient);
	    System.out.println(nomeP.familia);
	    System.out.println(nomeP.reino);
	    
	    String[] vetor = new String [5];
	    
	    vetor[0] = "Persa";
	    vetor[1] = "Siamês";
	    vetor[2] = "Maine Coon";
	    vetor[3] = "SRD";
	    vetor[4] = "Angorá";
	    
	    nomeP.nomesPopulares = vetor;
	    
	    for (int i = 0; i < nomeP.nomesPopulares.length; i++) {
			System.out.println(nomeP.nomesPopulares[i]);
	    }
	}
}
		

	


