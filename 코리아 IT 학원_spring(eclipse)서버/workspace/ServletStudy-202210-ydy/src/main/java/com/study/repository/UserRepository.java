package com.study.repository;

import java.util.ArrayList;
import java.util.List;

import com.study.domain.User;

public class UserRepository {
	
	private static UserRepository instance = null;
	
	private List<User> userList;
	
	private UserRepository() {
		userList = new ArrayList<>();
	}
	
	public static UserRepository getInstance() {
		if(instance == null) {
			instance = new UserRepository();
		}
		return instance;
	} // 싱글톤 -> 어디서든지 접근 가능
	
	public void saveUser(User user) {
		System.out.println("저장소에 사용자 등록");
		userList.add(user);
	}
	// user 찾기
	public User findUserByUsername(String username) {
		User user = null;
		
		for(User u : userList) {
			if(u.getUsername().equals(username)) {
				user = u;
				break;
			} // 만약 getUsername과 username이 동일하다면, 그 유저를 user에 넣어라
		}
		
		return user;
		// 만약 for문이 끝날때까지 못찾았을 경우 user = null을 return
	}
	
	public void showUserAll() {
		System.out.println("[등록된 사용자 조회]");
		userList.forEach(user -> {
			System.out.println(user);
		});
	}
	
	
	
}
