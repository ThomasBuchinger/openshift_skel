package at.buc.openshift.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.buc.openshift.data.ExampleEntry;
import at.buc.openshift.data.ExampleRepository;

@RestController
public class OpenshiftRestClient {
	@Autowired
	private ExampleRepository repository;

	public OpenshiftRestClient() {
		
		
	}
	
	@RequestMapping("/")
	public String greeting() {
		return "Hallo Welt";
		
	}
	@RequestMapping("/secure")
	public String scret_greeting() {
		return "AFFE";
		
	}
	
	@RequestMapping("/mongo")
	public ArrayList<String> mongo() {
		repository.save(new ExampleEntry("Thomas", "Buchinger"));
		repository.save(new ExampleEntry("Max", "Mustermann"));
		System.out.println("OpenshiftRestClient.mongo()");
		ArrayList<String> re=new ArrayList<String>();
		for (ExampleEntry e : repository.findAll()) {
			re.add(e.toString());
		}
		
		return re;
	}
}
