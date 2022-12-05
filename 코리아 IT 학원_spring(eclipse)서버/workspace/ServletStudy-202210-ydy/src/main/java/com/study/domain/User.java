package com.study.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
	private String username;
	private String password;
	private String name;
	private String email;
	private String roles; // ROLE_USER, ROLE_MANAGER, ROLE_ADMIN
}
