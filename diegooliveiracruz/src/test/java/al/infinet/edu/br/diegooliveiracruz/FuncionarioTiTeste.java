package al.infinet.edu.br.diegooliveiracruz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import al.infinet.edu.br.diegooliveiracruz.model.domain.Ti;

@SpringBootTest
public class FuncionarioTiTeste {
	
	private Ti funcTeste1;
	private final String NOME = "Diego";
	private final String CPF = "123.456.789-10";
	private final String NASCIMENTO = "17/02/1989";
	//String nome, String cpf, String nascimento, float salario, boolean cursoSuperior
	
	@BeforeEach
	private void setUp() {
		funcTeste1 = new Ti(NOME, CPF, NASCIMENTO);
	}
	
	@Test
	void testeSalárioCursoSuperior() {
		funcTeste1.setSalario(1000);
		funcTeste1.setCursoSuperior(true);
		//System.out.println("Salário: " + funcTeste1.salarioLiquido());
		
		assertEquals(1100, funcTeste1.salarioLiquido());
	}
	
	@Test
	void testeSalárioNaoCursoSuperior() {
		funcTeste1.setSalario(1000);
		//funcTeste1.setCursoSuperior(true);
				
		assertEquals(1000, funcTeste1.salarioLiquido());
	}
	
	@Test
	void testNome() {
		funcTeste1.setNome("Diego Oliveira da Cruz");
		assertEquals("Diego Oliveira da Cruz", funcTeste1.getNome());
	}
	
	@Test
	void testCPF() {
		funcTeste1.setCpf("789.456.123-00");
		assertEquals("789.456.123-00", funcTeste1.getCpf());
	}
	
	@Test
	void testNascimento() {
		funcTeste1.setNascimento("01/01/1990");
		assertEquals("01/01/1990", funcTeste1.getNascimento());
	}
	
	@Test
	void testSalario() {
		funcTeste1.setSalario(5000);
		assertEquals(5000, funcTeste1.getSalario());
	}
	
	@Test
	void testCursoSuperior() {
		
		assertEquals(false, funcTeste1.isCursoSuperior());
	}
}
