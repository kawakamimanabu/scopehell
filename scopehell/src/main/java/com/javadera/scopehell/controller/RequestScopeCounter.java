package com.javadera.scopehell.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class RequestScopeCounter extends AbstractScopeCounter {

	@PostConstruct
	public void init() {
		viewName = "requestScope";
		super.init();
	}

}
