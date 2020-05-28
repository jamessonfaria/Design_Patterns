package br.com.jamesson.creational.factory_method;

// abstract product
public abstract class DbConnector {

	protected String connectionString;

	protected DbConnector(String connectionString) {
		this.connectionString = connectionString;
	}

	protected abstract Connection connect();
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

}
