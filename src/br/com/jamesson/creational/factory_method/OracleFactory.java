package br.com.jamesson.creational.factory_method;

// concrete creator
public class OracleFactory extends DBFactory {

	// factory method
	@Override
	protected DbConnector createConnector(String connectionString) {
		return new OracleConnector(connectionString);
	}

}
