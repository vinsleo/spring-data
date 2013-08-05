package com.vins.nothing.core;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {

	User findByFirstname(String firstName);
}