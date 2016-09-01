package com.shu.dao;

import java.util.List;

import kingdee.k3.o2o.bos.dynamic.orm.DynamicObject;
import kingdee.k3.o2o.bos.web.context.WebContext;

public interface IShuDemoDao {
	//�б�
	public abstract List getShuDemoList(WebContext webcontext, int i, int j,
			StringBuffer stringbuffer);
	
    //����
	public abstract DynamicObject getShuDemo(WebContext webcontext, int i);

	//����
	public abstract void updateShuDemo(WebContext webcontext, int i,
			DynamicObject dynamicobject);

	//ɾ��
	public abstract int delete(WebContext webcontext, List list);

	//����
	public abstract DynamicObject saveShuDemo(WebContext webcontext,
			DynamicObject dynamicobject);

}
