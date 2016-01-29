package com.javadera.scopehell.controller;

import java.util.logging.Logger;

import javax.annotation.PreDestroy;
import javax.inject.Inject;

/**
 * バッキングビーンの基底クラスです
 * @author
 *
 */
public abstract class AbstractScopeCounter {
	protected Integer counter = 0;
	protected String viewName = "";
	@Inject protected Logger log;

	/**
	 * PostConstruct 時に呼ばれるメソッド
	 */
	public void init() {
		counter = 0;
		viewName = viewName + this.toString().substring(this.toString().lastIndexOf('@'));
		log.info(viewName + " PostConstruct:counter = [" + counter + "]");
	}

	@PreDestroy
	public void preDestory() {
		log.info(viewName + " PreDestroy.");
	}

	/**
	 * カウントアップさせて自画面に遷移します。
	 * @return
	 */
	public String countUpAction() {
		++counter;
		log.info(viewName + " CountUpAction:counter = [" + counter + "]");
		return viewName.substring(0, viewName.lastIndexOf('@')) + ".xhtml";
	}

	/**
	 * ActionListener でカウントアップさせます
	 * @return
	 */
	public void countUpActionListener() {
		++counter;
		log.info(viewName + " CountUpActionListener:counter = [" + counter + "]");
	}


	/**
	 * 渡された引数をログ出力し、画面遷移します。
	 * @return
	 */
	public String showScope(Integer i) {
		log.info(viewName + " ShowScope:counter = [" + i + "]");
		counter = i;
		return viewName.substring(0, viewName.lastIndexOf('@')) + ".xhtml";
	}

	//--- getter, setter ---
	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}

	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

}
