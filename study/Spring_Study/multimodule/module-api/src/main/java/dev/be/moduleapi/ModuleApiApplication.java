package dev.be.moduleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (
		// component scan을 수행할 base 패키지를 지정, 필요한 패키지만 지정할 수 있어서 효율적으로 운영할 수 있음
		scanBasePackages = { "dev.be.moduleapi", "dev.be.modulecommon"}
)
public class ModuleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleApiApplication.class, args);
	}

}
