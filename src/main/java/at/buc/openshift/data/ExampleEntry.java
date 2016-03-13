package at.buc.openshift.data;

import org.springframework.data.annotation.Id;

public class ExampleEntry {
	@Id
	private String id;

	private String firstName;
	private String lastName;

	public ExampleEntry() {
	}

	public ExampleEntry(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%s, firstName='%s', lastName='%s']", id,
				firstName, lastName);
	}
}
