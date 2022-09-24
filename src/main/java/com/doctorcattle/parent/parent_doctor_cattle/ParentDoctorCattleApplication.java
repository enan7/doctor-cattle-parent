package com.doctorcattle.parent.parent_doctor_cattle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ParentDoctorCattleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParentDoctorCattleApplication.class, args);
	}

}
