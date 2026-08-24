package akshat.post_service;

import akshat.post_service.httpInterface.UserClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.service.registry.ImportHttpServices;

@SpringBootApplication
// Importing http services, without this userClient bean would not be generated
@ImportHttpServices(group = "user-service",types = UserClient.class)
public class PostServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostServiceApplication.class, args);
	}

}
