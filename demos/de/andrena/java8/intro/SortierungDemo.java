package de.andrena.java8.intro;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import de.andrena.java8.Person;

public class SortierungDemo {

	@Test
	public void sortierePersonenNachNachname() {

		Person antonio = new Person("Antonio", "Calabrese");
		Person julia = new Person("Julia", "Hall");
		Person stefan = new Person("Stefan", "Maier");

		List<Person> personen = Arrays.asList(stefan, antonio, julia);

		// TODO Sortiere Personen nach Nachname

		assertThat(personen, contains(antonio, julia, stefan));
	}
}
