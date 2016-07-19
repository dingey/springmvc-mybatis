package fm;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.fm.model.User;
import com.fm.service.UserService;

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
		User u=userService.selectUserByUsername("a");
		System.out.println(u.getUserName());
	}
}
