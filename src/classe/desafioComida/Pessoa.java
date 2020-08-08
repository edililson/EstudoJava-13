package classe.desafioComida;

import java.util.Scanner;

public class Pessoa {
	Scanner scan = new Scanner(System.in);
	
	String nomePessoa;
	double pesoPessoa;
	
	Pessoa(String nome, double peso){
		this.nomePessoa = nome;
		this.pesoPessoa = peso;
	}
	
	public void comer(Comida comida){
		if(comida != null) {
			this.pesoPessoa   += comida.pesoComida;
		}
	}
	
	String apresentar() {
		return "Olá meu nome é " + nomePessoa + " e peso " + pesoPessoa +  " kilos";
	}
	
	
}
