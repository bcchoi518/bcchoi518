package todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;

import todoapp.commons.web.error.ReadableErrorAttributes;

@SpringBootApplication
@ConfigurationPropertiesScan	// 자동으로 ConfigurationProperties 애노테이션이 있는 빈을 찾아서 등록함
public class TodosApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodosApplication.class, args);
	}//main
	
//	@Bean
//	public SiteProperties siteProperties() {
//		return new SiteProperties();
//	}
	
	@Bean
	public ReadableErrorAttributes errorAttributes(MessageSource messageSource) {
		return new ReadableErrorAttributes(messageSource);
	}//errorAttributes
}//TodosApplication
