package al.infinet.edu.br.diegooliveiracruz;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import al.infinet.edu.br.diegooliveiracruz.model.domain.Filial;
import al.infinet.edu.br.diegooliveiracruz.model.service.FilialService;

@Component
public class FilialLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		//Filial filial01 = new Filial("Penápolis", "00.000.000.0000-00");
		//System.out.println(filial01);
		/*
		System.out.println(new Filial("Penápolis", "00.000.000.0000-00"));
		System.out.println(new Filial("Araçatuba", "00.000.000.0000-01"));
		System.out.println(new Filial("Birigui", "00.000.000.0000-02"));
		*/
		
		FilialService filialService = new FilialService();
		
		filialService.incluir(new Filial("Penápolis", "00.000.000.0000-00"));
		
		
		filialService.excluir("Penápolis");
		
		
		//filialService.incluir(new Filial("Araçatuba", "00.000.000.0000-01"));
		
		//filialService.incluir(new Filial("Birigui", "00.000.000.0000-02"));

		//System.out.println(filialService.obter("Araçatuba"));
	}

}
