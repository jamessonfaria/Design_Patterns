package br.com.jamesson.creational.abstract_factory;

import org.omg.CORBA.portable.ApplicationException;

public class VeiculoCreator {
	
	private VeiculoCreator() {
		throw new IllegalStateException("Utility class");
	}

	public static Veiculo criar(String modelo, Porte porte) throws ApplicationException {
		switch (porte) {
		case PEQUENO:
			return new VeiculoPequeno(modelo, porte);
		case MEDIO:
			return new VeiculoMedio(modelo, porte);
		case GRANDE:
			return new VeiculoGrande(modelo, porte);
		default:
			throw new ApplicationException("Porte de Veiculo desconhecido...", null);
		}
	}
	
}
