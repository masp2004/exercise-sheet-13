package de.unistuttgart.iste.sqa.pse.sheet13.presence.registration;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class to search for a name in a list with a simple GUI.
 */
public class RegistrationGUI {

	private List<String> registratedCustomers = new ArrayList<String>();
	
	/**
	 * Initializes list with some registered customers.
	 */
	public RegistrationGUI() {
		registrateSomeCustomers();
	}
	
	/**
	 * Register some random customers by adding them to the registratedCustomers list.
	 */
	private void registrateSomeCustomers() {
		List<String> randomNames = Arrays.asList(new String[] {"Gunnar, Jörg, Michael, Fabian, Petra"});
		/*
		 * @loop_invariant i names were added to registered customers (when i is the number of iterations)
		 * @decreasing randomNames.size() - i 
		 */
		for (String name : randomNames) {
			registratedCustomers.add(name);
		}
	}
}
