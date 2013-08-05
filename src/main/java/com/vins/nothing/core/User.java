package com.vins.nothing.core;

import javax.persistence.Entity;

import org.springframework.util.Assert;

@Entity
public class User extends AbstractEntity {

	private String firstname, lastname;

	public User(String firstname, String lastname) {

		Assert.hasText(firstname);
		Assert.hasText(lastname);

		this.setFirstname(firstname);
		this.setLastname(lastname);
	}

	protected User() {

	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

}
