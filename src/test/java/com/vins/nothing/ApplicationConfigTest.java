package com.vins.nothing;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vins.nothing.core.UserRepository;



public class ApplicationConfigTest {

	@Test
	public void bootstrapAppFromJavaConfig() {

		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		assertThat(context, CoreMatchers.is(CoreMatchers.notNullValue()));
		
		UserRepository bean = context.getBean(UserRepository.class);
		assertThat(bean, CoreMatchers.is(CoreMatchers.notNullValue()));
		
	}


}
