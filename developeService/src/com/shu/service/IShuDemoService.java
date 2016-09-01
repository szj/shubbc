package com.shu.service;

import java.util.List;

import kingdee.k3.o2o.bos.dynamic.orm.DynamicObject;
import kingdee.k3.o2o.bos.web.context.WebContext;

public interface IShuDemoService {
	//列表
	public abstract List getShuDemoList(WebContext webcontext, int i, int j,
			StringBuffer stringbuffer);

	//单行
	public abstract DynamicObject getShuDemo(WebContext webcontext, int i);

	//更新
	public abstract void UpdateShuDemo(WebContext webcontext, int i,
			DynamicObject dynamicobject);

	//删除
	public abstract int delete(WebContext webcontext, List list);

	//保存
	public abstract DynamicObject saveShuDemo(WebContext webcontext,
			DynamicObject dynamicobject);
	
	
}
