package azeem.java.server;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/")
public class MainController {
	@RequestMapping("/")
	public @ResponseBody GreetingJson greeting() {
		 return new GreetingJson("Welcome To SMS");
	}
	
	public static class GreetingJson {
        private final String message;

        public GreetingJson(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
