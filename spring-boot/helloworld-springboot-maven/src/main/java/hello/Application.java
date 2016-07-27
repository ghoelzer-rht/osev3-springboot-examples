package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
	   String helloWorldMsg = "Hello Docker World from ";
	   try {
		InetAddress ip = InetAddress.getLocalHost();
        	String hostname = ip.getHostName();

		helloWorldMsg = helloWorldMsg + " Pod/IP: " + ip;
		
	   } catch (UnknownHostException ex) {
            ex.printStackTrace();
           }
           return helloWorldMsg;
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
