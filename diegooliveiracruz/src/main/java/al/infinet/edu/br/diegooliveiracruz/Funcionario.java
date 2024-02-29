package al.infinet.edu.br.diegooliveiracruz;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import al.infinet.edu.br.diegooliveiracruz.model.domain.Ti;

@Component
public class Funcionario implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//String nome, String cpf, String nascimento, float salario, boolean cursoSuperior
		Ti teste1 = new Ti("Diego", "123.456.798-10", "17/02/1989", 10000, true);
		teste1.setNome("Diego");
		
		//System.out.println("Funcionário " + teste1.getNome() + " cadastrado com sucesso!");	
		//System.out.println("Funcionário " + teste1.getNome() + "Salário: R$" + teste1.salarioLiquido());	
		 
		Ti teste2 = new Ti("Joao", "789.456.321-00", "01/02/1990");
		//teste2.isCursoSuperior();
		teste2.setSalario(2000);
		//System.out.println("Funcionário " + teste2.getNome() + "Salário: R$" + teste2.salarioLiquido());
		
		teste2.setCursoSuperior(true);
		//System.out.println(teste2.salarioLiquido());
		
	}   

}
