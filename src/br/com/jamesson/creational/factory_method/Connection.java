package br.com.jamesson.creational.factory_method;

public class Connection {

	private String connectionString;
	private boolean opened;
	
	public Connection(String connectionString) {
		this.connectionString = connectionString;
	}
	
	public void executeCommand(String command) {
		System.out.println("Executando o comandoL " + command);
	}
	
	public void open() {
		opened = true;
		System.out.println("Conexao aberta...");
	}
	
	public void close() {
		opened = false;
		System.out.println("Conexao fechada...");
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public boolean isOpened() {
		return opened;
	}

	public void setOpened(boolean opened) {
		this.opened = opened;
	}


}
