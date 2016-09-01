package factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shu.service.IShuDemoService;

import developeService.ITestService;

@Component("extendAdminServiceFactory")
public class ExtendAdminServiceFactory {

	private static ITestService testService;
	
	private static IShuDemoService shuDemoService;

	public static ITestService getTestService() {
		return testService;
	}

	@Autowired
	public void setTestService(ITestService testService) {
		ExtendAdminServiceFactory.testService = testService;
	}
	
	public static IShuDemoService getShuDemoService() {
		return shuDemoService;
	}

	@Autowired
	public void setShuDemoService(IShuDemoService shuDemoService) {
		ExtendAdminServiceFactory.shuDemoService = shuDemoService;
	}
	
}
