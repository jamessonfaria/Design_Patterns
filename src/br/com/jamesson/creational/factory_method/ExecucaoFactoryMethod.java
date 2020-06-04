package br.com.jamesson.creational.factory_method;

import org.omg.CORBA.portable.ApplicationException;

public class ExecucaoFactoryMethod {
	
	public static void executar() throws ApplicationException {
		 Connection sqlCn = DBFactory.database(DataBase.SQLSERVER)
				 			.createConnector("minhaCs")
				 			.connect();
		 
		 sqlCn.executeCommand("select * from tabelaSql");
		 sqlCn.close();
		 
		 System.out.println("");
		 System.out.println("--------------------------");
		 System.out.println("");
		 
		 Connection oracleCn = DBFactory.database(DataBase.ORACLE)
				 				.createConnector("minhaCs")
				 				.connect();
		 
		 oracleCn.executeCommand("select * from tabelaOracle");
		 oracleCn.close();
		 
	}

}
