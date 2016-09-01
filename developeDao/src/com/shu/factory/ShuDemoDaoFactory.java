package com.shu.factory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shu.dao.IShuDemoDao;

@Component
public class ShuDemoDaoFactory {
	private static IShuDemoDao shuDemoDao;

	public static IShuDemoDao getShuDemoDao() {
		return shuDemoDao;
	}

	@Autowired
	public void setShuDemoDao(IShuDemoDao shuDemoDao) {
		this.shuDemoDao = shuDemoDao;
	}
	
}
