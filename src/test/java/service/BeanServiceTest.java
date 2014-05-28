/**
 * 
 */
package service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import domain.Bean0;

/**
 * @author mrebuschi
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:test.xml" })
public class BeanServiceTest {

	
	@Autowired
	private BeanService beanService;
	
	/**
	 * Test method for {@link service.BeanService#persist(domain.Bean0)}.
	 */
	@Test
	public void testPersist() {
		Bean0 b0 = new Bean0();
		b0.setCode("testCode2");
		b0.setName("testName2");
		b0 = beanService.persist(b0);
		assertNotNull(b0);
	}

	/**
	 * Test method for {@link service.BeanService#findAll()}.
	 */
	@Test
	public void testFindAll() {
		
		List<Bean0> bList = beanService.findAll();
		
		for(Bean0 b0 : bList)
		{
			System.out.println("name: "+b0.getName()+" code"+b0.getCode());
		}
		assertTrue(true==true);
	}

}
