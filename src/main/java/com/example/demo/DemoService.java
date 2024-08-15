package com.example.demo;

import com.zaxxer.hikari.HikariDataSource;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public DemoService(HikariDataSource hikariDataSource) {
		System.out.println("---> DemoService constructor");
	}
}
