package com.lguplus.briefingserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations="classpath:com/lguplus/briefingserver/root-context.xml")
public class ApplicationContextTest {
	@Test
	public void testConfig(){
		
	}
}
