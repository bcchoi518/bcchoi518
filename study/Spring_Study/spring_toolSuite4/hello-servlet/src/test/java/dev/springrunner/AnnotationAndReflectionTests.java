package dev.springrunner;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Test;

public class AnnotationAndReflectionTests {

	@Test
	void handelAnnotation() throws Exception {
		Class<BlogService> blogServiceClass = BlogService.class;
		Component component = blogServiceClass.getAnnotation(Component.class);
		
		System.out.println("name: "+ component.name());
	}//handelAnnotation
	
	@Target({ElementType.METHOD, ElementType.TYPE})
	@Retention(RetentionPolicy.RUNTIME)
	@interface Component {
		String name();
	}//Component
	
	@Component(name = "블로그 서비스")
	class BlogService {
		
	}//BlogService
}//AnnotationAndReflectionTests
