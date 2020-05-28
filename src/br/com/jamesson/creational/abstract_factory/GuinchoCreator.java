package br.com.jamesson.creational.abstract_factory;
import org.omg.CORBA.portable.ApplicationException;

// factory

public class GuinchoCreator {

	private GuinchoCreator() {
		throw new IllegalStateException("Utility class");
	}

	public static Guincho criar(Porte porte) throws ApplicationException {
		switch (porte) {
		case PEQUENO:
			return new GuinchoPequeno(porte);
		case MEDIO:
			return new GuinchoMedio(porte);
		case GRANDE:
			return new GuinchoGrande(porte);
		default:
			throw new ApplicationException("Porte de Guinho desconhecido...", null);
		}
	}

}
