package hello;

import org.springframework.web.bind.annotation.RestController;

import hello.domain.Hello;
import hello.repository.CustomerRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Autowired
	CustomerRepository repo; 
	
	@RequestMapping("/")
	List<Hello> home(){
		
		
		Hello savehello = new Hello("nonji");
		savehello = repo.save(savehello);
		System.out.println("!!!!!!!!!!!! = "+ savehello.getId());
		Hello updatehello = new Hello(1, "mumunonji");
		repo.save(updatehello);
		
		Hello deletehello = new Hello(15);
		repo.delete(deletehello);
		
		List<Hello> name = repo.findAll();
		System.out.println(name);
		
		
		return name;
	}
	
	
//    @RequestMapping("/")
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }

}