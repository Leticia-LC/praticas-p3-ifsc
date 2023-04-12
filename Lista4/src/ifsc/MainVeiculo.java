package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();
		Veiculo v2 = new Veiculo();
		Veiculo v3 = new Veiculo();
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		
		v1.setNome ("Camaro");
		v1.setAno (2010);
		v1.setCor("Amarelo");
		v1.setFabricante ("Chevrolet");
		v1.setRodas(4);
		veiculos.add(v1);
		
		v2.setNome ("Bicicleta");
		v2.setAno (2019);
		v2.setCor("Preto");
		v2.setFabricante ("Sense");
		v2.setRodas(2);
		veiculos.add(v2);
		
		v3.setNome ("Moto");
		v3.setAno (2015);
		v3.setCor("Vermelho");
		v3.setFabricante ("Honda");
		v3.setRodas(2);
		veiculos.add(v3);
		
		for (Veiculo veiculo : veiculos) {
			
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getRodas());
			System.out.println(veiculo.getCor());
			
			
		}
	}

}