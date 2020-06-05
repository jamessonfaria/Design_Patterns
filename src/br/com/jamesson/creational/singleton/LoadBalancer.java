package br.com.jamesson.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class LoadBalancer {

	private static LoadBalancer instance = new LoadBalancer();
	
	private List<Server> servers;
	private Random random = new Random();
	
	private LoadBalancer() {
		this.servers = new ArrayList<>();
		this.servers.add(new Server(UUID.randomUUID(), "ServerI","120.14.220.18"));
		this.servers.add(new Server(UUID.randomUUID(), "ServerII","120.14.220.19"));
		this.servers.add(new Server(UUID.randomUUID(), "ServerIII","120.14.220.20"));
		this.servers.add(new Server(UUID.randomUUID(), "ServerIV","120.14.220.21"));
		this.servers.add(new Server(UUID.randomUUID(), "ServerV","120.14.220.22"));
	}
	
	public static LoadBalancer getLoadBalancer() {
		return instance;
	}
	
	public Server nextServer() {
		int r = this.random.nextInt(this.servers.size());
		return this.servers.get(r);
	}
	
	
	
}
