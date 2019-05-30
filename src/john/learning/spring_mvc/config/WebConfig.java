package john.learning.spring_mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan({"john.learning.spring_mvc.controllers", "john.learning.spring_mvc.config", "john.learning.spring_mvc.model" })
public class WebConfig implements WebMvcConfigurer {
	private static final String RESOLVER_PREFIX = "/WEB-INF/Views/";
	private static final String RESOLVER_SUFFIX = ".jsp";
	
	//Define message source
	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource mesSource = new ResourceBundleMessageSource();
		mesSource.setBasename("resources/messages");
		return mesSource;
	}
	
	//Define View Resolver
	@Bean
	public ViewResolver viewResolver() {
		UrlBasedViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix(RESOLVER_PREFIX);
		resolver.setSuffix(RESOLVER_SUFFIX);
		return resolver;
	}
	
	//Static page view controllers
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
	}
	
	//Serve static files 
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/styles/**").addResourceLocations("classpath:WEB-INF/Views/Css/");
		registry.addResourceHandler("/scripts/**").addResourceLocations("classpath:WEB-INF/Views/Scripts/");
		registry.addResourceHandler("/images/**").addResourceLocations("classpath:WEB-INF/Views/Images/");
	}
	
}
