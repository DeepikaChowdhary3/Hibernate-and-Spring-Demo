package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigure2 {

	@Bean(name="student")
	public Student2 getStudentBean()
	{
		System.out.println("The student details are:");
		return new Student2();
	}
}
