package com.shu.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shu.service.IShuDemoService;

@Component("shuDemoServiceFactory")
public class ShuDemoServiceFactory {
	private static IShuDemoService shuDemoService;

	public static IShuDemoService getShuDemoService() {
		return shuDemoService;
	}

	@Autowired
	public void setShuDemoService(IShuDemoService shuDemoService) {
		this.shuDemoService = shuDemoService;
	}
}
