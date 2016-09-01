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
	 * ���������
	 * 
	 * @author zhouneng_lv
	 * @time 2016��6��23������9:23:27
	 * @param webCtx
	 * @param view
	 * @param event
	 */

	@Override
	public void onToolbarClick(WebContext webCtx, BillView view,
			ToolbarClientEvent event) {
	/*	// ��datagrid��ȡ������
		DynamicObject param = new DynamicObject();
		// ��ǩ����
		param.put("pkValue", event.getDataObject().get("pkValue"));
		// ��ǩ����
		param.put("FNAME", event.getDataObject().get("FNAME"));
		// ����
		param.put("FNUMBER", event.getDataObject().get("FNUMBER"));
		// �Ƿ�����
		param.put("FENABLE", event.getDataObject().get("FENABLE"));
		// �޸���
		param.put("FMODIFIERID", 1);
		// �ϼ�����
		param.put("FPARENTID", event.getDataObject().get("FPARENTID"));
		// �޸����� ���뵱ǰ����
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String datetime = format.format(date);
		param.put("FMODIFYDATE", datetime);
		// ����
		
		param.put("FDESCRIPTION", "");
		// ��ȡClickButton�Ĳ���ID
		String clickId = event.getId();
		// �����ж�Click����������Ӧ����
		switch (clickId) {
		// �ж�Ϊˢ�²���
		case "refresh":
			break;
		// �ж�Ϊɾ������
		case "delete":
			break;
		// �ж�Ϊ����a����
		case "save":
			// �ݶ��ж�û�б�ŵĲ�ִ�в���
			if (view.getPkValue() != "") {
				param.put("pkValue", Integer.parseInt(view.getPkValue()));
				// ����Dao����
				AdminServiceFactory.getChannelAreaService().UpdateChannelArea
						(webCtx, Integer.parseInt(view.getPkValue()), param);
				// ��ʾ��ɿ�
				MessageBoxArgu messageBoxArgu_save = new MessageBoxArgu();
				view.showMessage("���θ��³ɹ�", MessageBoxType.Confirm,
						messageBoxArgu_save);
			} else if (view.getPkValue() == "") {
				// ��������pkValue,����Ϊ�Ǳ�����棬����save����
				DynamicObject saveData = AdminServiceFactory.
						getChannelAreaService().saveChannelArea(webCtx, param);		
				// ��pkValue���͵�ǰ̨
				view.setPkValue(saveData);
				// ��ʾ��ɿ�
				MessageBoxArgu messageBoxArgu_save = new MessageBoxArgu();
				view.showMessage("���α���ɹ�", MessageBoxType.Confirm,
						messageBoxArgu_save);
			}
			break;
		}*/
	}


	/**
	 * �ڰ�����ǰ����treeFilter
	 * 
	 * @author zhouneng_lv
	 * @time 2016��6��13������6:23:11
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
	 * ��������
	 * 
	 * @author zhouneng_lv
	 * @time 2016��6��13������6:23:11
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
		    // ��ȡ��Ӧ��ǩ��Ϣ
		    DynamicObject data = AdminServiceFactory.getChannelAreaService().
		    		getChannelArea(webCtx, pkValue);
		    return data;
		}
		else
			return null;
	}
	

}
