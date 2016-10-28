package fm;

import org.junit.Test;
import com.di.toolkit.EncryptionUtil;

/**
 * @author di:
 * @date 创建时间：2016年10月28日 下午4:14:11
 * @version
 */
public class Md5Test {
	@Test
	public void testGetAcccountById() {
		System.out.println(EncryptionUtil.md5Hex("a"));
	}
}
