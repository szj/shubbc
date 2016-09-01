package developeService;

import java.util.List;

import org.springframework.stereotype.Service;
import kingdee.k3.o2o.admin.AdminDaoFactory;
import kingdee.k3.o2o.admin.service.AdminServiceBase;
import kingdee.k3.o2o.bos.dynamic.orm.DynamicObject;
import kingdee.k3.o2o.bos.web.context.WebContext;

@Service
public class TestService extends AdminServiceBase implements
ITestService{

	@Override
	public List<DynamicObject> getChannelLevelList(WebContext webCtx, int page,
			int pageSize, StringBuffer filter) {
		return AdminDaoFactory.getChannelLevelDao().getChannelLevelList(webCtx,
				page, pageSize, filter);
	}
}
