package at.buc.openshift.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenshiftRestClient {

	@RequestMapping("/")
	public String greeting() {
		return "Hallo Welt";
		
	}
	@RequestMapping("/secure")
	public String scret_greeting() {
		return "AFFE";
		
	}
	
	
}
