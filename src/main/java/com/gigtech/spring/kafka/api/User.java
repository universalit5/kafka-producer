package com.gigtech.spring.kafka.api;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@Getter
@Setter

public class User {
	public User() {

	}
	private int id;
	private String name;
	private List<String> address;

}
