/**
 * 
 */
package com.dayler.jsf.sample.started.domain;

/**
 * @author dayler salazar
 * 
 */
public class User {

	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		// Image here a database access to validate the users
		if (name.equalsIgnoreCase("test")
				&& password.equalsIgnoreCase("test")) {
			return "success";
		} else if (name.isEmpty() || password.isEmpty()) {
			return "error";
		} else {
			return "failed";
		}

	}
}
