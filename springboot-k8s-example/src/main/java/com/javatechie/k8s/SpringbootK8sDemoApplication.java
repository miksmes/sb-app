package com.javatechie.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class SpringbootK8sDemoApplication {

	@GetMapping("/message")
	public String displayMessage() throws UnknownHostException{
		InetAddress inetAddress;
		inetAddress = InetAddress.getLocalHost();
		return ("<h1>Michael's Spring Boot Application</h1> \n My hostname/IP is : " + inetAddress);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sDemoApplication.class, args);
		InetAddress inetAddress;
		try {
			inetAddress = InetAddress.getLocalHost();
			System.out.println("My hostname is : " + inetAddress.getHostName());
			System.out.println("My IP address is  : " + inetAddress);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	

	}

}
