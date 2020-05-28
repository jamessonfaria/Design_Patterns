package br.com.jamesson.creational.abstract_factory;

// produto concreto

public class GuinchoMedio extends Guincho {

	protected GuinchoMedio(Porte porte) {
		super(porte);
	}

	@Override
	public void socorrer(Veiculo veiculo) {
		System.out.println("Socorrendo Carro Medio - Modelo - " + veiculo.getModelo());
	}

}
