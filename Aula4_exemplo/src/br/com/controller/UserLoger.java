package br.com.controller;

import br.com.model.User;

public class UserLoger {
	
	public boolean validacaoLogin(String login, String senha) {
		
		User user = dummyUser();
		
		return user.getLogin().equals(login) && user.getSenha().equals(senha);
		
	}
	
	public User dummyUser() {
		
		User user = new User("poo_user", "poo_pass");
		
		return user;
		
	}

}
