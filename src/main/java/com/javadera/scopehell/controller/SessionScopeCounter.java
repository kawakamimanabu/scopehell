package com.javadera.scopehell.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class SessionScopeCounter extends AbstractScopeCounter implements Serializable {

/**
 *
 */
private static final long serialVersionUID = 3469067863193077426L;

  @PostConstruct
  public void init() {
    viewName = "sessionScope";
    super.init();
  }

}
