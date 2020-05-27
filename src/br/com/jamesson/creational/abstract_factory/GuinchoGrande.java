package br.com.jamesson.creational.abstract_factory;

public class GuinchoGrande extends Guincho {

	protected GuinchoGrande(Porte porte) {
		super(porte);
	}

	@Override
	public void socorrer(Veiculo veiculo) {
		System.out.println("Socorrendo Carro Grande - Modelo - " + veiculo.getModelo());
	}

}
