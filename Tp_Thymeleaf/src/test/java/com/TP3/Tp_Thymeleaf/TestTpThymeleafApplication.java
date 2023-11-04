package com.TP3.Tp_Thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTpThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.from(TpThymeleafApplication::main).with(TestTpThymeleafApplication.class).run(args);
	}

}
