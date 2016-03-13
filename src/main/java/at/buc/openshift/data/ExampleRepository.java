package at.buc.openshift.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExampleRepository extends MongoRepository<ExampleEntry, String>{
	public ExampleEntry findByFirstName(String firstName);

	public List<ExampleEntry> findByLastName(String lastName);
}
