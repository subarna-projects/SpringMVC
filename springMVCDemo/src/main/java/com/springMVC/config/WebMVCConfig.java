package com.springMVC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"com.springMVC"})
public class WebMVCConfig implements WebMvcConfigurer {
	@Override
	public void configureDefaultServletHandling( DefaultServletHandlerConfigurer configurer ){      
	    configurer.enable();
	}

	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver resolver= new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		System.out.println("viewResolver");
		return resolver;
		
	} 
	
	 @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry
	            .addResourceHandler("/resources/**")
	            .addResourceLocations("/resources/");
	    }
}
