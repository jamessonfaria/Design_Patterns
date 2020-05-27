package br.com.jamesson.creational.abstract_factory;

public class GuinchoPequeno extends Guincho {

	protected GuinchoPequeno(Porte porte) {
		super(porte);
	}

	@Override
	public void socorrer(Veiculo veiculo) {
		System.out.println("Socorrendo Carro Pequeno - Modelo - " + veiculo.getModelo());
	}

}
