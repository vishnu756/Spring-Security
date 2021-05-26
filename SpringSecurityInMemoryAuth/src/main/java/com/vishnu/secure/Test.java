package com.vishnu.secure;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BCryptPasswordEncoder enc = new BCryptPasswordEncoder();
		String ep = enc.encode("peter");
		System.out.println(ep);
	}

}
