package br.com.jamesson.creational.abstract_factory;

import org.omg.CORBA.portable.ApplicationException;

//concrete factory

public class SocorroVeiculoMedio implements AutoSocorroFactory{

	@Override
	public Guincho criarGuincho() throws ApplicationException {
		return GuinchoCreator.criar(Porte.MEDIO);
	}

	@Override
	public Veiculo criarVeiculo(String modelo, Porte porte) throws ApplicationException {
		return VeiculoCreator.criar(modelo, porte);
	}

}
