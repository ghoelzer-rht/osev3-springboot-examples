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
	   try {
		InetAddress ip = InetAddress.getLocalHost();
        	String hostname = ip.getHostName();

		return "Hello Docker World from " + hostname + "IP Address: " + ip;
		
	   } catch (UnknownHostException ex) {
            ex.printStackTrace();
           }
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
