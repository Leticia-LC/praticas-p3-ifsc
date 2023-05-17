package ex1;

import java.util.Scanner;

public class PessoaMainA {

	public static void main(String[] args) {
		
		Pessoa n1 = new Pessoa();
		Pessoa n2 = new Pessoa();
		Pessoa n3 = new Pessoa();
		
		n1.nome = "Kemily";
		n1.cpf = 10010010000l;
		n1.dataNascimento = "17/01/2006";
		
		n2.nome = "Arthur";
		n2.cpf = 20020020000l;
		n2.dataNascimento = "27/06/2005";
		
		n3.nome = "Letícia";
		n3.cpf = 30030030000l;
		n3.dataNascimento = "28/12/2005";
				
		System.out.println("A pessoa " + n1.nome + " tem o CPF n° " + n1.cpf + " e nasceu no dia: " + n1.dataNascimento);
		System.out.println("A pessoa " + n2.nome + " tem o CPF n° " + n2.cpf+ " e nasceu no dia: " + n2.dataNascimento);
		System.out.println("A pessoa " + n3.nome + " tem o CPF n° " + n3.cpf + " e nasceu no dia: " + n3.dataNascimento);

	}

}
