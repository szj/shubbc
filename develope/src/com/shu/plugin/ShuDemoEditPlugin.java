package com.shu.plugin;

import kingdee.k3.o2o.admin.service.AdminServiceFactory;
import kingdee.k3.o2o.bos.dynamic.form.BillView;
import kingdee.k3.o2o.bos.dynamic.form.plugin.BillViewPlugin;
import kingdee.k3.o2o.bos.dynamic.form.plugin.event.LoadDataEvent;
import kingdee.k3.o2o.bos.dynamic.form.plugin.event.ToolbarClientEvent;
import kingdee.k3.o2o.bos.dynamic.orm.DynamicObject;
import kingdee.k3.o2o.bos.web.context.WebContext;
import kingdee.k3.o2o.constant.Constants;

public class ShuDemoEditPlugin extends BillViewPlugin {

	@Override
	public void initView(WebContext webCtx, BillView view) {
		// TODO Auto-generated method stub
		super.initView(webCtx, view);
	}

	@Override
	public boolean isEditView(BillView view) {
		// TODO Auto-generated method stub
		return super.isEditView(view);
	}

	@Override
	protected void afterMetadataSave(WebContext webcontext, BillView billview,
			ToolbarClientEvent toolbarclientevent, DynamicObject dynamicobject) {
		// TODO Auto-generated method stub
		super.afterMetadataSave(webcontext, billview, toolbarclientevent, dynamicobject);
	}

	@Override
	protected DynamicObject beforeMetadataSave(WebContext webCtx,
			DynamicObject afterData, DynamicObject beforeData) {
		// TODO Auto-generated method stub
		return super.beforeMetadataSave(webCtx, afterData, beforeData);
	}

	@Override
	protected void showDialog(WebContext webCtx, BillView view,
			ToolbarClientEvent event) {
		// TODO Auto-generated method stub
		super.showDialog(webCtx, view, event);
	}

	@Override
	public void onToolbarClick(WebContext webcontext, BillView billview,
			ToolbarClientEvent toolbarclientevent) {
		// TODO Auto-generated method stub
		super.onToolbarClick(webcontext, billview, toolbarclientevent);
	}

	@Override
	public DynamicObject onDataLoad(WebContext webCtx, BillView view,
			LoadDataEvent event) {
		// TODO Auto-generated method stub
		return super.onDataLoad(webCtx, view, event);
	}

	@Override
	protected DynamicObject beforeBindData(WebContext webCtx, BillView view,
			LoadDataEvent event, DynamicObject dataObject) {
		// TODO Auto-generated method stub
		return super.beforeBindData(webCtx, view, event, dataObject);
	}

	@Override
	protected void initControl(WebContext webcontext, BillView billview,
			LoadDataEvent loaddataevent) {
		// TODO Auto-generated method stub
		super.initControl(webcontext, billview, loaddataevent);
	}

	
	
	
}