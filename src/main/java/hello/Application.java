package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import persistence.User;
import persistence.UserRepository;

@EntityScan("persistence")

@EnableJpaRepositories("persistence")
@SpringBootApplication
@RestController
public class Application {

	@Autowired
	UserRepository userRepository;

	@RequestMapping("/")
	public String home() {
		String lastName = "";
		// User user = new User();
		// user.setFirstName("Deepti");
		// user.setLastName("Lalwani");
		// user.setUserName("deepti");
		// userRepository.save(user);
		User user = userRepository.getUserDetails("deepti");
		if (user != null) {
			lastName = user.getLastName();
		}

		return "Hello User " + lastName;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
