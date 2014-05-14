package week7.singleton;

public class ConnectionInfoSingleton {
	
	private static ConnectionInfoSingleton instance = null;
	
	private ConnectionInfoSingleton(){
		System.out.println("In constructor");
	}
	
	public static ConnectionInfoSingleton getInstance(){
		if(instance == null){
			instance = new ConnectionInfoSingleton();
		}
		return instance;
	}
	
	private String ip;
	
	private String port;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
	
	

}
