package br.com.jamesson.creational.abstract_factory;

import org.omg.CORBA.portable.ApplicationException;

// abstract factory

public interface AutoSocorroFactory {
	public abstract Guincho criarGuincho() throws ApplicationException;
	public abstract Veiculo criarVeiculo(String modelo, Porte porte) throws ApplicationException;
}
