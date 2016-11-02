package fm;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.model.UserExample;
import com.di.service.UserService;

public class UserTest {
	private static UserService userService;

	@BeforeClass
	public static void init() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-context.xml");
		userService = (UserService) context.getBean("userService");
	}

	@Test
	public void testGetAcccountById() {
		userService.selectByExample(new UserExample());
	}
}
