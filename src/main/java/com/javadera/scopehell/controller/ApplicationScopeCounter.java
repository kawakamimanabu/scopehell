package com.javadera.scopehell.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ApplicationScopeCounter extends AbstractScopeCounter implements Serializable {

  /**  */
  private static final long serialVersionUID = -4529288885218319091L;

  @PostConstruct
  public void init() {
    viewName = "applicationScope";
    super.init();
  }

}
