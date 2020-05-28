package br.com.jamesson.creational.factory_method;

import org.omg.CORBA.portable.ApplicationException;

// abstract creator
public abstract class DBFactory {
	
	// factory method
	protected abstract DbConnector createConnector(String connectionString);
	
	public static DBFactory database(DataBase dataBase) throws ApplicationException {
		if(dataBase == DataBase.SQLSERVER)
			return new SqlFactory();
		if(dataBase == DataBase.ORACLE)
			return new OracleFactory();
		
		throw new ApplicationException("Banco de dados não reconhecido", null);
	}
	
}
