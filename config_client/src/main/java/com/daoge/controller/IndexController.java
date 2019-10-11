package com.daoge.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class IndexController {

	@Value("${userAge}")
	private String userAge;

	@RequestMapping("/getUserAge")
	public String getUserAge() {
		return userAge;
	}

}
