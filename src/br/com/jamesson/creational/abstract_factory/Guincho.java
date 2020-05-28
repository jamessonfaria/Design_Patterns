package br.com.jamesson.creational.abstract_factory;

// abstract product

public abstract class Guincho {
	private Porte porte;
	
	protected Guincho(Porte porte) {
		this.porte = porte;
	}

	public abstract void socorrer(Veiculo veiculo);
	
	public Porte getPorte() {
		return porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}	
	
}
