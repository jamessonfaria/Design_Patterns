package br.com.jamesson.creational.factory_method;

// concrete product
public class OracleConnector extends DbConnector {

	protected OracleConnector(String connectionString) {
		super(connectionString);
		this.connectionString = connectionString;
	}

	@Override
	protected Connection connect() {
		System.out.println("Conectado ao banco Oracle...");
		Connection connection = new Connection(connectionString);
		connection.open();
		
		return connection;
	}

}
