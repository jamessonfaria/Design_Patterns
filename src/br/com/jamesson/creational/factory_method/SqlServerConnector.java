package br.com.jamesson.creational.factory_method;

// concrete product
public class SqlServerConnector extends DbConnector {

	protected SqlServerConnector(String connectionString) {
		super(connectionString);
		this.connectionString = connectionString;
	}

	@Override
	protected Connection connect() {
		System.out.println("Conectado ao banco SQL Server...");
		Connection connection = new Connection(connectionString);
		connection.open();
		
		return connection;
	}

}
