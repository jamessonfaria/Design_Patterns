package br.com.jamesson.creational.singleton;

public class Singleton {

	public static void main(String[] args) {
		LoadBalancer b1 = LoadBalancer.getLoadBalancer();
		LoadBalancer b2 = LoadBalancer.getLoadBalancer();
		LoadBalancer b3 = LoadBalancer.getLoadBalancer();
		LoadBalancer b4 = LoadBalancer.getLoadBalancer();
		
		if(b1 == b2 && b2 == b3 && b3 == b4) {
			System.out.println("Mesma Instancia");
		}
		
		LoadBalancer balancer = LoadBalancer.getLoadBalancer();
		
		for(int i = 0; i < 15; i++) {
			String serverName = balancer.nextServer().getName();
			System.out.println("Disparando request para: " + serverName);
		}
	}
	
}
