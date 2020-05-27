package br.com.jamesson.creational.abstract_factory;

import org.omg.CORBA.portable.ApplicationException;

public class SocorroVeiculoPequeno implements AutoSocorroFactory{

	@Override
	public Guincho criarGuincho() throws ApplicationException {
		return GuinchoCreator.criar(Porte.PEQUENO);
	}

	@Override
	public Veiculo criarVeiculo(String modelo, Porte porte) throws ApplicationException {
		return VeiculoCreator.criar(modelo, porte);
	}

}
