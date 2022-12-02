package com.study.service;

import java.util.ArrayList;
import java.util.List;

import com.study.domain.User;
import com.study.repository.UserRepository;

public class AccountService {
	
private static AccountService instance = null;
	
	
	private AccountService() {}
	
	public static AccountService getInstance() {
		if(instance == null) {
			instance = new AccountService();
		}
		return instance;
	} 
	
	// username 중복 확인
	public boolean isDuplicateUsername(String username) {
		User user = UserRepository.getInstance().findUserByUsername(username);
		
		return user !=null;
	}
}
