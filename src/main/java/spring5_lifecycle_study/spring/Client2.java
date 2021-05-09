package spring5_lifecycle_study.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Client2 {

	private String host;

	public void close() throws Exception {
		System.out.println("Client.close() 실행");
	}

	public void send() {
		System.out.println("Client.send() to " + host);
	}

	public void connect(){
		System.out.println("Client.connect() 실행");
	}

	public void setHost(String host) {
		this.host = host;
	}

}
