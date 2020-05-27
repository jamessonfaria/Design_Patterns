package br.com.jamesson.creational.abstract_factory;

import org.omg.CORBA.portable.ApplicationException;

// Client Class

public class AutoSocorro {
	private Veiculo veiculo;
	private Guincho guincho;
	
	public AutoSocorro(AutoSocorroFactory factory, Veiculo veiculo) throws ApplicationException {
		this.veiculo = factory.criarVeiculo(veiculo.getModelo(), veiculo.getPorte());
		this.guincho = factory.criarGuincho();
	}
	
	public void realizarAtendimento() {
		this.guincho.socorrer(veiculo);
	}
	
	public static AutoSocorro criarAutoSocorro(Veiculo veiculo) throws ApplicationException {
		switch (veiculo.getPorte()) {
		case PEQUENO:
			return new AutoSocorro(new SocorroVeiculoPequeno(), veiculo);
		case MEDIO:
			return new AutoSocorro(new SocorroVeiculoMedio(), veiculo);
		case GRANDE:
			return new AutoSocorro(new SocorroVeiculoGrande(), veiculo);
		default:
			throw new ApplicationException("Não foi possivel identificar o veiculo", null);
		}
	}
}
