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
	InetAddress ip="127.0.0.1";
        String hostname="localhost";
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
		return "Hello Docker World from " + hostname + "IP Address: " + ip;
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
