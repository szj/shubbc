package com.shu.plugin;

import java.util.Map;

import kingdee.k3.o2o.bos.dynamic.form.ListView;
import kingdee.k3.o2o.bos.dynamic.form.MessageBoxArgu;
import kingdee.k3.o2o.bos.dynamic.form.plugin.ListDataSet;
import kingdee.k3.o2o.bos.dynamic.form.plugin.ListViewPlugin;
import kingdee.k3.o2o.bos.dynamic.form.plugin.QueryFilter;
import kingdee.k3.o2o.bos.dynamic.form.plugin.event.LoadDataEvent;
import kingdee.k3.o2o.bos.dynamic.form.plugin.event.MessageBoxEvent;
import kingdee.k3.o2o.bos.dynamic.form.plugin.event.RowClickEvent;
import kingdee.k3.o2o.bos.dynamic.form.plugin.event.ToolbarClientEvent;
import kingdee.k3.o2o.bos.util.IHashMap;
import kingdee.k3.o2o.bos.web.context.WebContext;

import com.shu.factory.ShuDemoServiceFactory;

import factory.ExtendAdminServiceFactory;

public class ShuDemoListPlugin extends ListViewPlugin {

	@Override
	protected ListView beforeBindData(WebContext webCtx, ListView view,
			ListDataSet listDataSet) {
		// TODO Auto-generated method stub
		return super.beforeBindData(webCtx, view, listDataSet);
	}

	@Override
	public boolean beforeIService(WebContext webCtx, ListView view,
			ToolbarClientEvent event, Object obj, String s) {
		// TODO Auto-generated method stub
		return super.beforeIService(webCtx, view, event, obj, s);
	}

	@Override
	public QueryFilter buildQueryFilter(WebContext webCtx, ListView view,
			IHashMap queryParam) {
		// TODO Auto-generated method stub
		return super.buildQueryFilter(webCtx, view, queryParam);
	}

	@Override
	protected void importAction(WebContext webcontext, ListView listview,
			Map<String, Object> map) {
		// TODO Auto-generated method stub
		super.importAction(webcontext, listview, map);
	}

	@Override
	public void initView(WebContext webCtx, ListView view) {
		// TODO Auto-generated method stub
		super.initView(webCtx, view);
	}

	@Override
	protected void loadNavigateTree(WebContext ctx, ListView view,
			LoadDataEvent loadDataEvent) {
		// TODO Auto-generated method stub
		super.loadNavigateTree(ctx, view, loadDataEvent);
	}

	@Override
	protected Object loadNavigateTreeData(WebContext ctx) {
		// TODO Auto-generated method stub
		return super.loadNavigateTreeData(ctx);
	}

	@Override
	public ListDataSet onDataLoad(WebContext webCtx, ListView view,
			LoadDataEvent event) {
		// TODO Auto-generated method stub
		return super.onDataLoad(webCtx, view, event);
	}

	@Override
	protected void onDeleteToolbarClick(WebContext webcontext,
			ListView listview, ToolbarClientEvent toolbarclientevent) {
		// TODO Auto-generated method stub
		super.onDeleteToolbarClick(webcontext, listview, toolbarclientevent);
	}

	@Override
	public void onMessageBoxCallBack(WebContext webCtx, ListView view,
			MessageBoxEvent event) {
		// TODO Auto-generated method stub
		super.onMessageBoxCallBack(webCtx, view, event);
	}

	@Override
	public void onPage(WebContext webCtx, ListView view, LoadDataEvent event) {
		// TODO Auto-generated method stub
		super.onPage(webCtx, view, event);
	}

	@Override
	protected void onRefreshToolbarClick(WebContext webcontext,
			ListView listview, ToolbarClientEvent toolbarclientevent) {
		// TODO Auto-generated method stub
		super.onRefreshToolbarClick(webcontext, listview, toolbarclientevent);
	}

	@Override
	public void onRowDoubleClick(WebContext webCtx, ListView view,
			RowClickEvent event) {
		// TODO Auto-generated method stub
		super.onRowDoubleClick(webCtx, view, event);
	}

	@Override
	public void onSearch(WebContext webCtx, ListView view, LoadDataEvent event) {
		// TODO Auto-generated method stub
		super.onSearch(webCtx, view, event);
	}

	@Override
	public void onToolbarClick(WebContext webCtx, ListView view,
			ToolbarClientEvent event) {
		/*
		String clickId = event.getId();
		String s = clickId;
		byte byte0 = -1;
		switch (s.hashCode()) {
		case 1085444827:
			if (s.equals("refresh"))
				byte0 = 0;
			break;

		case -1335458389:
			if (s.equals("delete"))
				byte0 = 1;
			break;

		case -1037230245:
			if (s.equals("btn_submit"))
				byte0 = 2;
			break;
		}
		switch (byte0) {
		case 0: // '\0'
			view.refresh(event.getTarget());
			break;

		case 1: // '\001'
			java.util.List list = event.getSelections();
			
			if(list==null||list.size()==0){
				MessageBoxArgu messageBoxArgu = new MessageBoxArgu();
				messageBoxArgu.setKey("deleteNUm");
				messageBoxArgu.setData(Integer.valueOf(1));
				view.showMessage(
						(new StringBuilder())
								.append("«Î—°‘Ò")
								.toString(), "confirm", messageBoxArgu);
				view.refresh(event.getTarget());
			}else{
				int deleteNum = ShuDemoServiceFactory.getShuDemoService().delete(webCtx, list);
				//int deleteNum =ExtendAdminServiceFactory.getShuDemoService().delete(webCtx, list);
				
				MessageBoxArgu messageBoxArgu = new MessageBoxArgu();
				messageBoxArgu.setKey("deleteNUm");
				messageBoxArgu.setData(Integer.valueOf(deleteNum));
				view.showMessage(
						(new StringBuilder())
								.append("\u672C\u6B21\u6709")
								.append(deleteNum)
								.append("\u6761\u8BB0\u5F55\u6267\u884C\u5220\u9664\u6210\u529F")
								.toString(), "confirm", messageBoxArgu);
				view.refresh(event.getTarget());
			}
			break;
		}
		*/
	}

	@Override
	public void setColor(ListView listview, LoadDataEvent loaddataevent) {
		// TODO Auto-generated method stub
		super.setColor(listview, loaddataevent);
	}

	@Override
	protected void showDialog(ListView view, ToolbarClientEvent event) {
		// TODO Auto-generated method stub
		super.showDialog(view, event);
	}
     
}
