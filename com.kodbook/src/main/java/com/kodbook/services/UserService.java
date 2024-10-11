package com.kodbook.services;

import com.kodbook.entities.User;

public interface UserService {

	boolean userExists(String username, String email);

	void addUser(User user);

}
