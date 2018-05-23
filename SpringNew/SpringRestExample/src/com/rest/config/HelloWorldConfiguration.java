package com.rest.config;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import org.springframework.web.servlet.view.xml.MarshallingView;

import com.rest.beans.Member;
import com.rest.service.MemberService;
 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.rest")
public class HelloWorldConfiguration {
    @Bean
    public ViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
 
        return viewResolver;
    }
    @Bean
    public View jsonmembertemplate() {
    MappingJackson2JsonView view = new MappingJackson2JsonView();
    view.setPrettyPrint(true);
    return view;
    }
 
    @Bean
    public View membertemplate() {
    	org.springframework.oxm.Marshaller marshaller=jaxb2Marshaller();
    return new MarshallingView(marshaller);
    }
    @Bean
    public org.springframework.oxm.Marshaller jaxb2Marshaller() {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    marshaller.setClassesToBeBound(MemberService.class, Member.class);
    return marshaller;
    }
    @Bean
    public ViewResolver viewResolver() {
    
    	return new BeanNameViewResolver();
    }
    
}