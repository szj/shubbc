package com.shu.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kingdee.k3.o2o.bos.db.support.WebBaseDaoSupport;
import kingdee.k3.o2o.bos.dynamic.form.plugin.event.SelectedRow;
import kingdee.k3.o2o.bos.dynamic.orm.DynamicObject;
import kingdee.k3.o2o.bos.object.DSql;
import kingdee.k3.o2o.bos.object.DaoParam;
import kingdee.k3.o2o.bos.web.context.WebContext;

import org.springframework.stereotype.Repository;

@Repository
public class ShuDemoDao  extends WebBaseDaoSupport implements IShuDemoDao {

	//列表信息
	@Override
	public List getShuDemoList(WebContext webcontext, int i, int j,StringBuffer stringbuffer) {
		// TODO Auto-generated method stub
		return null;
	}

	//单行
	@Override
	public DynamicObject getShuDemo(WebContext webcontext, int pkValue) {
		DSql sql = new DSql();
		
		String s = "T_ESS_LABEL el LEFT JOIN T_ESS_LABEL_L ell ON el.FLABElID = ell.FLABElID where el.FLABElID=:FID";
		
		sql.select("el.FLABElID pkValue,el.FNUMBER FLABELNO,el.FENABLE,el.FORDER,ell.FNAME FLABELNAME,ell.FDESC").from(s);
		DaoParam param = new DaoParam();
		param.put("FID", Integer.valueOf(pkValue));
		DynamicObject dyObject = queryFirst(webcontext, sql, param);
		return dyObject;
	}

	//更新
	@Override
	public void updateShuDemo(WebContext webCtx, int i,DynamicObject param) {
		DSql updateSql = new DSql();
		updateSql.update("el").append("set");
		updateSql
				.append("el.FENABLE=:FENABLE, el.FNUMBER=:FNUMBER, el.FORDER=:FORDER, el.FMODIFIERID=:FMODIFIERID, el.FMODIFYDATE=:FMODIFYDATE");
		updateSql.append("from T_ESS_LABEL el");
		updateSql.append("where el.FLABElID=:pkValue");
		int number = update(webCtx, updateSql, param);
		updateSql.clear();
		updateSql.update("ell").append("set");
		updateSql.append("ell.FNAME=:FNAME, ell.FDESC=:FDESC");
		updateSql.append("from T_ESS_LABEL_L ell");
		updateSql.append("where ell.FLABElID=:pkValue");
		number = update(webCtx, updateSql, param);
	}

	//删除
	@Override
	public int delete(WebContext webCtx, List list) {
		DSql sql = new DSql();
		List deleteList = new ArrayList();
		SelectedRow row;
		for (Iterator iterator = list.iterator(); iterator.hasNext(); 
				deleteList.add(Integer.valueOf(Integer.parseInt(row.getPkValue()))))
			row = (SelectedRow) iterator.next();

		String del = DSql.toSQLList(deleteList);
		DynamicObject paramList = new DynamicObject();
		paramList.put("T_ESS_SHUDemo",(new StringBuilder()).append("where fid in (").append(del).append(")").toString());
		
		int deleteNum = 0;
		for (Iterator iterator1 = paramList.keySet().iterator(); iterator1
				.hasNext(); sql.clear()) {
			String key = (String) iterator1.next();
			sql.delete(key).append(paramList.getString(key));
			deleteNum = update(webCtx, sql, null);
		}

		return deleteNum;
	}

	//保存
	@Override
	public DynamicObject saveShuDemo(WebContext webCtx,DynamicObject param) {
		DSql sql = new DSql();
		sql.insert_into("T_ESS_LABEL");
		String tableValues = "FNUMBER,FENABLE,FORDER,FMODIFIERID,FMODIFYDATE";
		sql.append((new StringBuilder()).append(" (").append(tableValues)
				.append(")").toString());
		sql.append("VALUES");
		String values = ":FNUMBER,:FENABLE,:FORDER,:FMODIFIERID,:FMODIFYDATE";
		sql.append((new StringBuilder()).append("(").append(values).append(")")
				.toString());
		DynamicObject resultMap = save(webCtx, sql, param);
		DynamicObject pkValue = new DynamicObject();
		pkValue.put("pkValue", resultMap.get("id"));
		sql.clear();
		sql.insert_into("T_ESS_LABEL_L");
		String tableValues_L = "FID,FLOCALEID,FNAME,FDESC";
		sql.append((new StringBuilder()).append(" (").append(tableValues_L)
				.append(")").toString());
		sql.append("VALUES");
		String values_L = (new StringBuilder()).append(resultMap.getInt("id"))
				.append(",2052,:FNAME,:FDESC").toString();
		sql.append((new StringBuilder()).append("(").append(values_L)
				.append(")").toString());
		DynamicObject resultMap_L = save(webCtx, sql, param);
		return pkValue;
	}


	
}
