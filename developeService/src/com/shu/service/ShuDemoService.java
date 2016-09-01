package com.shu.service;

import java.util.List;

import kingdee.k3.o2o.admin.service.AdminServiceBase;
import kingdee.k3.o2o.bos.dynamic.orm.DynamicObject;
import kingdee.k3.o2o.bos.web.context.WebContext;

import org.springframework.stereotype.Service;

import com.shu.factory.ShuDemoDaoFactory;

 

@Service
public class ShuDemoService extends AdminServiceBase implements IShuDemoService{

	@Override
	public List getShuDemoList(WebContext webcontext,  int page, int pageSize,
			StringBuffer stringbuffer) {
		// TODO Auto-generated method stub
		//ShuDemoDaoFactory.
		
		return ShuDemoDaoFactory.getShuDemoDao() .getShuDemoList(webcontext, page, pageSize, stringbuffer);
		 
	}

	@Override
	public DynamicObject getShuDemo(WebContext webcontext, int i) {
		// TODO Auto-generated method stub
		return ShuDemoDaoFactory.getShuDemoDao() .getShuDemo(webcontext, i);
		 
	}

	@Override
	public void UpdateShuDemo(WebContext webcontext, int i,
			DynamicObject dynamicobject) {
		// TODO Auto-generated method stub
	   ShuDemoDaoFactory.getShuDemoDao().updateShuDemo(webcontext, i, dynamicobject);
		 
	}

	@Override
	public int delete(WebContext webcontext, List list) {
		// TODO Auto-generated method stub
		return  ShuDemoDaoFactory.getShuDemoDao().delete(webcontext, list);
	}

	@Override
	public DynamicObject saveShuDemo(WebContext webcontext,
			DynamicObject dynamicobject) {
		// TODO Auto-generated method stub
		return ShuDemoDaoFactory.getShuDemoDao().saveShuDemo(webcontext, dynamicobject);
	}

	
}
