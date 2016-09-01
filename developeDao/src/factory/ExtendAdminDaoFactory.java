package factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import developeDao.ITestDao;

@Component
public class ExtendAdminDaoFactory {

	private static ITestDao testDao;

	public static ITestDao getTestDao() {
		return testDao;
	}

	@Autowired
	public void setTestDao(ITestDao testDao) {
		ExtendAdminDaoFactory.testDao = testDao;
	}
	
}
