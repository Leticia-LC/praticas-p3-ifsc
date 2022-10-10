package prog;

public class ContaCorrente {
	
	public String nome_do_titular;
	public Long cpf;
	public Long numero_da_conta;
	public Double saldo;
	
	public void mostrar_dados() {
		System.out.println("Titular:" + nome_do_titular);
		System.out.println("Cpf:" + cpf);
		System.out.println("Conta:" + numero_da_conta);
		System.out.println("Saldo da Conta:" + saldo);
		
	}
	public Double sacar(Double valorSaque) {
		
		double retornoSaque = 0;
		if(valorSaque > saldo) {
			System.out.println("Saldo insuficiente!");
		} else {
			saldo = saldo - valorSaque;
			retornoSaque = valorSaque;
		}
		
		return retornoSaque;
	}
	
	public void depositar(Double valorDeposito) {
		saldo = saldo + valorDeposito;
	}
	
	public static void main(String[] args) {
		
		ContaCorrente c = new ContaCorrente();
		
		c.nome_do_titular = "Letícia Lima Cunha";
		c.cpf = (long) 100000;
		c.numero_da_conta = (long) 1894323;
		c.saldo = 9000.0;
		
		c.mostrar_dados();
		c.depositar(null);
		c.sacar(null);
		
		c.mostrar_dados();
	
}
}
