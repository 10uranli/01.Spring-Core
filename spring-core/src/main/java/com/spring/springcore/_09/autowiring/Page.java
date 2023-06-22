package com.spring.springcore._09.autowiring;

public class Page {
	
	private String pageName;
	private SubPage subPage;
	
	public Page(String pageName, SubPage subPage) {
		super();
		this.pageName = pageName;
		this.subPage = subPage;
	}

	public String getPageName() {
		return pageName;
	}
	
	
	public String getSubPageName(){
		return subPage.getSubPageName();
	}


	//buradaki const. ile xmldeki uyusmalý, parametre sayýsý
}
