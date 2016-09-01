package plugin;

import kingdee.k3.o2o.admin.service.AdminServiceFactory;
import kingdee.k3.o2o.admin.webapp.plugin.goods.GoodsLabelListPlugin;
import kingdee.k3.o2o.bos.dynamic.form.BillView;
import kingdee.k3.o2o.bos.dynamic.form.plugin.BillViewPlugin;
import kingdee.k3.o2o.bos.dynamic.form.plugin.event.LoadDataEvent;
import kingdee.k3.o2o.bos.dynamic.form.plugin.event.ToolbarClientEvent;
import kingdee.k3.o2o.bos.dynamic.orm.DynamicObject;
import kingdee.k3.o2o.bos.web.context.WebContext;
import kingdee.k3.o2o.constant.Constants;


public class TestEditPlugin extends BillViewPlugin {
	
	
	@Override
	public void initView(WebContext webCtx, BillView view) {

		//kingdee.k3.o2o.admin.webapp.plugin.goods.GoodsBrandEditPlugin
		//GoodsLabelListPlugin
		//MenuGroupListPlugin
		//GoodsBrandListPlugin
		//DynamicFormAction
		super.initView(webCtx, view);
		

		
		
	}

	/**
	 * 工具栏点击
	 * 
	 * @author zhouneng_lv
	 * @time 2016年6月23日上午9:23:27
	 * @param webCtx
	 * @param view
	 * @param event
	 */

	@Override
	public void onToolbarClick(WebContext webCtx, BillView view,
			ToolbarClientEvent event) {
	/*	// 从datagrid中取得数据
		DynamicObject param = new DynamicObject();
		// 标签编码
		param.put("pkValue", event.getDataObject().get("pkValue"));
		// 标签名称
		param.put("FNAME", event.getDataObject().get("FNAME"));
		// 编码
		param.put("FNUMBER", event.getDataObject().get("FNUMBER"));
		// 是否启用
		param.put("FENABLE", event.getDataObject().get("FENABLE"));
		// 修改者
		param.put("FMODIFIERID", 1);
		// 上级区域
		param.put("FPARENTID", event.getDataObject().get("FPARENTID"));
		// 修改日期 放入当前日期
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String datetime = format.format(date);
		param.put("FMODIFYDATE", datetime);
		// 描述
		
		param.put("FDESCRIPTION", "");
		// 获取ClickButton的操作ID
		String clickId = event.getId();
		// 根据判断Click操作调用相应服务
		switch (clickId) {
		// 判断为刷新操作
		case "refresh":
			break;
		// 判断为删除操作
		case "delete":
			break;
		// 判断为保存a操作
		case "save":
			// 暂定判断没有编号的不执行操作
			if (view.getPkValue() != "") {
				param.put("pkValue", Integer.parseInt(view.getPkValue()));
				// 调用Dao方法
				AdminServiceFactory.getChannelAreaService().UpdateChannelArea
						(webCtx, Integer.parseInt(view.getPkValue()), param);
				// 显示完成框
				MessageBoxArgu messageBoxArgu_save = new MessageBoxArgu();
				view.showMessage("本次更新成功", MessageBoxType.Confirm,
						messageBoxArgu_save);
			} else if (view.getPkValue() == "") {
				// 若不存在pkValue,则认为是保存界面，调用save方法
				DynamicObject saveData = AdminServiceFactory.
						getChannelAreaService().saveChannelArea(webCtx, param);		
				// 将pkValue发送到前台
				view.setPkValue(saveData);
				// 显示完成框
				MessageBoxArgu messageBoxArgu_save = new MessageBoxArgu();
				view.showMessage("本次保存成功", MessageBoxType.Confirm,
						messageBoxArgu_save);
			}
			break;
		}*/
	}


	/**
	 * 在绑定数据前带上treeFilter
	 * 
	 * @author zhouneng_lv
	 * @time 2016年6月13日上午6:23:11
	 * @param webCtx
	 * @param view
	 * @param event
	 * @return
	 */
	@Override
	public DynamicObject beforeBindData(WebContext webCtx, BillView view,
			LoadDataEvent event, DynamicObject dataObject){
		
		if(event.get(Constants.TREE_FILTER)==null||event.get(Constants.TREE_FILTER).toString().isEmpty())
			return dataObject;
		else{
			DynamicObject data = AdminServiceFactory.getChannelAreaService().
					getAreaByFilter(webCtx, event.get(Constants.TREE_FILTER).toString());
			return data;
		}
	}
	/**
	 * 加载数据
	 * 
	 * @author zhouneng_lv
	 * @time 2016年6月13日上午6:23:11
	 * @param webCtx
	 * @param view
	 * @param event
	 * @return
	 */
	@Override
	public DynamicObject onDataLoad(WebContext webCtx, BillView view,
			LoadDataEvent event) {		
		if(view.getPkValue()!=""){
			int pkValue = Integer.parseInt(view.getPkValue());
		    // 获取对应标签信息
		    DynamicObject data = AdminServiceFactory.getChannelAreaService().
		    		getChannelArea(webCtx, pkValue);
		    return data;
		}
		else
			return null;
	}
	

}
