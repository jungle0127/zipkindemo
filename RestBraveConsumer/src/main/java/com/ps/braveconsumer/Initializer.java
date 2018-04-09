package com.ps.braveconsumer;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.ps.braveconsumer.config.AppConfiguration;
import com.ps.braveconsumer.config.TracingConfiguration;

import brave.spring.webmvc.DelegatingTracingFilter;

public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { TracingConfiguration.class, AppConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	/** Ensures tracing is setup for all HTTP requests. */
	@Override
	protected Filter[] getServletFilters() {
		return new Filter[] { new DelegatingTracingFilter() };
	}
}
