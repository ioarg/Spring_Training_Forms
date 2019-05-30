package john.learning.spring_mvc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebApp implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		//Register web configuration
		context.register(WebConfig.class);
		//Register dispatcher servlet
		DispatcherServlet dispatcher  = new DispatcherServlet(context);
		ServletRegistration.Dynamic dispatcher_conf = servletContext.addServlet("dispatcher", dispatcher);
		dispatcher_conf.addMapping("/");
		dispatcher_conf.setLoadOnStartup(1);
		dispatcher_conf.setInitParameter("throwExceptionIfNoHandlerFound", "true");
	}

}
