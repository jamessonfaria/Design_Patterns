package br.com.jamesson.creational.factory_method;

import org.omg.CORBA.portable.ApplicationException;

public class Main {

	public static void main(String[] args) {

		try {
			ExecucaoFactoryMethod.executar();
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
		
	}

}
