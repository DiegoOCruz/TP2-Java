package al.infinet.edu.br.diegooliveiracruz.model.domain;

public class Ti extends Departamento{
	private float salario;
	private boolean cursoSuperior;
	private float bonus;
	
	public Ti(String nome, String cpf, String nascimento) {
		super(nome, cpf, nascimento);
		cursoSuperior = false;
	} 
	
	public Ti(String nome, String cpf, String nascimento, float salario, boolean cursoSuperior) {
		super(nome, cpf, nascimento);
		this.salario = salario;
		this.cursoSuperior = cursoSuperior;
	}
	
	
	public float salarioLiquido() {
		if (cursoSuperior) {
			bonus = (float) (salario * 0.1);
			return salario + bonus;
		}else {
			return salario;
		}
		
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public boolean isCursoSuperior() {
		return cursoSuperior;
	}
	public void setCursoSuperior(boolean cursoSuperior) {
		this.cursoSuperior = cursoSuperior;
	}
	
	
	
}
