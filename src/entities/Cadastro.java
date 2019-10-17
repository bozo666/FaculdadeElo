package entities;

import java.util.List;

public class Cadastro {
	
	private String nome;
	private Integer idade;
	private Double peso;
	
	public Cadastro(String nome, Integer idade, Double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public static double RetornaMediaIdade(List<Cadastro> list){
		double qtdTotalIdade = 0;
		
		for (Cadastro cadastro : list) {
			qtdTotalIdade += cadastro.getIdade();
		}
		return qtdTotalIdade / list.size();
	}
	
	public static double RetornaMediaPeso(List<Cadastro> list) {
		double qtdTotalPeso = 0;
		
		for(Cadastro cadastro : list) {
			qtdTotalPeso += cadastro.getPeso();
		}
		return qtdTotalPeso / list.size();
	}
	
}
