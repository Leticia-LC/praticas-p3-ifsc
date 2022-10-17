package ifsc;

public class Animal {

		private String nome;
		private String raca;
		private Float comprimento;
		private Integer numPatas;
		private String cor;
		private String ecossistema;

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}

		public Float getComprimento() {
			return comprimento;
		}

		public void setComprimento(Float comprimento) {
			this.comprimento = comprimento;
		}

		public Integer getNumPatas() {
			return numPatas;
		}

		public void setNumPatas(Integer numPatas) {
			this.numPatas = numPatas;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public String getEcossistema() {
			return ecossistema;
		}

		public void setEcossistema(String ecossistema) {
			this.ecossistema = ecossistema;
		}

		public void caminha() {
			System.out.println("Poin poin poin");
		}

	}
