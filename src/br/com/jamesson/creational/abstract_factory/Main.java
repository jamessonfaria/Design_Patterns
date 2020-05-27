package br.com.jamesson.creational.abstract_factory;

import org.omg.CORBA.portable.ApplicationException;

public class Main {

	public static void main(String[] args) {
		try {
			ExecucaoAbstractFactory.executar();
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}

}
