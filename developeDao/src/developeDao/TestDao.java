package developeDao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kingdee.k3.o2o.bos.db.support.WebBaseDaoSupport;
import kingdee.k3.o2o.bos.dynamic.orm.DynamicObject;
import kingdee.k3.o2o.bos.object.DSql;
import kingdee.k3.o2o.bos.web.context.WebContext;

@Repository
public class TestDao  extends WebBaseDaoSupport implements
ITestDao {

	@Override
	public List<DynamicObject> getNoticeList(WebContext webCtx, int page,
			int pageSize, StringBuffer filter) {
		
		DSql sql = new DSql();
        
		return null;
	}
}
