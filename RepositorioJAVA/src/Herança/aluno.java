package Herança;

public class aluno {
	private String nome;
	private int idade;
	private int matricula;
	private Boolean aprovado;
	
	
	public aluno(String nome) {
		this.nome = nome;
		this.idade = 0;
		this.matricula = 0;
		this.aprovado = true;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public Boolean getAprovado() {
		return this.aprovado;
	}
	
	
}



