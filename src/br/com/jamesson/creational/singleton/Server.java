package br.com.jamesson.creational.singleton;

import java.util.UUID;

public class Server {

	private UUID id;
	private String name;
	private String ip;

	public Server(UUID id, String name, String ip) {
		this.id = id;
		this.name = name;
		this.ip = ip;
	}
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}
