package com.tpisoftware.gradlejunitdemo.demo3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class MockitoSpyTest {

	/**
	 * @SpyBean({xxx.class, ooo.class})
	 * 
	 * @SpyBean(xxx.class)
	 * @SpyBean(ooo.class)
	 * 
	 * @SpyBeans({
	 *   @SpyBean(xxx.class),
	 *   @SpyBean(ooo.class)
	 * })
	 */
	@SpyBean
	private Person person;
	
	@Test
	public void test1() {
		String name = person.getName();
		assertEquals("Billy", name);
	}
	
	@Test
	public void test2() {
		when(person.getAge()).thenReturn(40);
		int age = person.getAge();
		assertEquals(40, age);
		
//		String name = person.getName();
//		assertEquals("Billy", name);
	}
}
