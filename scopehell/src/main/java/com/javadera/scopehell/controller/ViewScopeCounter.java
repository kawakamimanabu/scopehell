package com.javadera.scopehell.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ViewScopeCounter extends AbstractScopeCounter implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 6739314454130644497L;

	@PostConstruct
	public void init() {
		viewName = "viewScope";
		super.init();
	}

}
