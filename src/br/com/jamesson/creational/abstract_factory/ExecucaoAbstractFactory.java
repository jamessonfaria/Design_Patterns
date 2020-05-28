package br.com.jamesson.creational.abstract_factory;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.portable.ApplicationException;

// execucao do abstract factory

public class ExecucaoAbstractFactory {

	private ExecucaoAbstractFactory() {}
	
	public static void executar() throws ApplicationException {
		List<Veiculo> veiculoSocorro = new ArrayList<>();
		veiculoSocorro.add(VeiculoCreator.criar("Celta", Porte.PEQUENO));
		veiculoSocorro.add(VeiculoCreator.criar("Jetta", Porte.MEDIO));
		veiculoSocorro.add(VeiculoCreator.criar("BMW X6", Porte.GRANDE));
		
		veiculoSocorro.forEach(v -> {
			try {
				AutoSocorro.criarAutoSocorro(v).realizarAtendimento();
			} catch (ApplicationException e) {
				e.printStackTrace();
			}
		});
	}
	
}
