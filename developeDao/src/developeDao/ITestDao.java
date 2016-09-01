package developeDao;

import java.util.List;

import kingdee.k3.o2o.bos.dynamic.orm.DynamicObject;
import kingdee.k3.o2o.bos.web.context.WebContext;

public interface ITestDao {

	List<DynamicObject> getNoticeList(WebContext webCtx, int page, int pageSize, StringBuffer filter);

}
