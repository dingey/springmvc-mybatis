package fm;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.di.mapper.TestMapper;

/**
 * @author di
 * @date 2016年11月9日 下午5:47:27
 * @since 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-context.xml")
@Transactional
public class TestTest {
	@Autowired
	TestMapper testMapper;

	@Test
	public void test() {
		com.di.model.Test l = new com.di.model.Test();
		l.setCreatedAt(new Date());
		l.setOppCode("test");
		l.setOppCommit("test");
		l.setOppFee(0);
		l.setOppNotify("test");
		l.setOppReturn("test");
		l.setOppType(0);
		l.setPayingId("test");
		l.setRefundId(1L);
		l.setStatus(true);
		l.setUpdatedAt(new Date());
		testMapper.insert(l);
		System.out.println(l.getId());
	}
}
