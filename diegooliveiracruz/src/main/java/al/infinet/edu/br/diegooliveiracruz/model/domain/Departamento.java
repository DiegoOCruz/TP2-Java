package al.infinet.edu.br.diegooliveiracruz.model.domain;


public abstract class Departamento {
	private String nome;
	private String cpf;
	private String nascimento; 
	
	
	
	
	public Departamento(String nome, String cpf, String nascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		//System.out.println("Funcionário " + this.nome + " cadastrado com sucesso!");
	} 
	public String getNome() {
		return nome;
	} 
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
}
