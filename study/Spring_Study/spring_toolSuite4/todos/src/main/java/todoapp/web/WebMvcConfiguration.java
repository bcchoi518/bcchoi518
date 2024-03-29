package todoapp.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ObjectToStringHttpMessageConverter;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import todoapp.commons.web.servlet.ExecutionTimeHandlerInterceptor;
import todoapp.commons.web.servlet.LoggingHandlerInterceptor;
import todoapp.commons.web.view.CommaSeparatedValuesView;
import todoapp.core.todos.domain.Todo;
import todoapp.core.user.domain.ProfilePictureStorage;
import todoapp.security.UserSessionRepository;
import todoapp.security.web.servlet.RolesVerifyHandlerInterceptor;
import todoapp.security.web.servlet.UserSessionFilter;
import todoapp.security.web.servlet.UserSessionHandlerMethodArgumentResolver;

/**
 * Spring Web MVC 설정
 *
 * @author springrunner.kr@gmail.com
 */
@Configuration // 스프링 컨테이너에 빈 구성 정보로서 사용이 되는 클래스
public class WebMvcConfiguration implements WebMvcConfigurer {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserSessionRepository userSessionRepository;
	
	@Autowired
	private ProfilePictureStorage profilePictureStorage;
	
	public WebMvcConfiguration() {
		logger.debug("스프링 MVC 설정자가 생성됩니다.");
	}

    @Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
		resolvers.add(new UserSessionHandlerMethodArgumentResolver(userSessionRepository));
	}//addArgumentResolvers

	@Override
	public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> handlers) {
		handlers.add(new UserController.ProfilePictureReturnValueHandler(profilePictureStorage));
	}//addReturnValueHandlers

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoggingHandlerInterceptor());
		registry.addInterceptor(new ExecutionTimeHandlerInterceptor());
		registry.addInterceptor(new RolesVerifyHandlerInterceptor());
	}//addInterceptors

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// 리소스 핸들러를 등록, 정적 자원을 처리할 수 있습니다.
    	
    	// http://localhost:8092/assets/css/todos.css
    	
    	// 서블릿 컨텍스트 경로에서 정적 자원 제공
//    	registry.addResourceHandler("/assets/**").addResourceLocations("assets/");
    	
    	// 파일 경로에서 정적 자원 제공
//    	registry
//    		.addResourceHandler("/assets/**")
//    		.addResourceLocations("file:D:/Developement/workspace/Spring_Study/spring_toolSuite4/todos/files/assets/");
    	
    	// 클래스패스 경로에서 정적 자원 제공
//    	registry.addResourceHandler("/assets/**").addResourceLocations("classpath:assets/");
    	
//    	registry
//    		.addResourceHandler("/assets/**")
//    		.addResourceLocations(
//    				"assets/", 
//    				"file:D:/Developement/workspace/Spring_Study/spring_toolSuite4/todos/files/assets/", 
//    				"classpath:assets/");
	}//addResourceHandlers
	
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
//    	registry.viewResolver(new TodoController.TodoCsvViewResolver());
    	
        // registry.enableContentNegotiation();
        // 위와 같이 직접 설정하면, 스프링부트가 구성한 ContentNegotiatingViewResolver 전략이 무시된다.
    }
    
    @Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		DefaultConversionService conversionService = new DefaultConversionService();
		conversionService.addConverter(new Converter<Todo, String>() {
			@Override
			public String convert(Todo source) {
				return source.toString();
			}//convert
		});
		
		converters.add(new ObjectToStringHttpMessageConverter(conversionService));
	}//configureMessageConverters

    @Bean
    public FilterRegistrationBean<CommonsRequestLoggingFilter> commonsRequestLoggingFilter() {
    	CommonsRequestLoggingFilter commonsRequestLoggingFilter = new CommonsRequestLoggingFilter();
    	commonsRequestLoggingFilter.setIncludeHeaders(true);
    	commonsRequestLoggingFilter.setIncludePayload(true);
    	commonsRequestLoggingFilter.setIncludeClientInfo(true);
    	
    	FilterRegistrationBean<CommonsRequestLoggingFilter> filter = new FilterRegistrationBean<>();
    	filter.setFilter(commonsRequestLoggingFilter);
    	filter.setUrlPatterns(Collections.singletonList("/*"));
    	
    	return filter;
    }//commonsRequestLoggingFilter
    
    @Bean
    public FilterRegistrationBean<UserSessionFilter> userSessionFilter() {
    	UserSessionFilter userSessionFilter = new UserSessionFilter(userSessionRepository);
    	
    	FilterRegistrationBean<UserSessionFilter> filter = new FilterRegistrationBean<>();
    	filter.setFilter(userSessionFilter);
    	filter.setUrlPatterns(Collections.singletonList("/*"));
    	
    	return filter;
    }//userSessionFilter
    
	/**
     * 스프링부트가 생성한 ContentNegotiatingViewResolver를 조작할 목적으로 작성된 컴포넌트
     */
	@Configuration
    public static class ContentNegotiationCustomizer {

		@Autowired
        public void configurer(ContentNegotiatingViewResolver viewResolver) {
			List<View> defaultViews = new ArrayList<>(viewResolver.getDefaultViews());
			defaultViews.add(new CommaSeparatedValuesView());
			defaultViews.add(new MappingJackson2JsonView());
			
			viewResolver.setDefaultViews(defaultViews);
        }//configurer
    }//ContentNegotiationCustomizer
}//WebMvcConfiguration
