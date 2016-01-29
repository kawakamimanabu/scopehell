package com.javadera.scopehell.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ApplicationScopeCounter extends AbstractScopeCounter implements Serializable {

	@PostConstruct
	public void init() {
		viewName = "applicationScope";
		super.init();
	}

}
