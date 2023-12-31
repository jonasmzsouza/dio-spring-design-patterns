package me.dio.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DioSpringDesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioSpringDesignPatternsApplication.class, args);
	}

}
