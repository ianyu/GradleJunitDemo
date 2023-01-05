package com.tpisoftware.gradlejunitdemo.demo3;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class MockitoMockTest {
	@MockBean
	private Person person;
	
	
	/**
	 * 當我們模擬一個類別的對象時，
	 * 我們得到一個空實例而不是實際實例。
	 * 模擬對象的所有方法都返回 null，所有字串值也為 null。
	 */
	@Test
	public void test1() {
		String name = person.getName();
		assertEquals(null, name);
	}
	
	
	/**
	 * Mockito.when( 對象.方法名() ).thenReturn( 自定義結果 )
	 * thenReturn 依 when value 自動指定型別
	 */
	@Test
	public void test2() {
		when(person.getAge()).thenReturn(20); // 指定類別的參數值為自定義值
		int age = person.getAge();
		assertEquals(20, age);
		
//		String name = person.getName();
//		assertEquals("Billy", name);
	}
}

class Person {
	public String getName() {
		return "Billy";
	}
	
	public int getAge() {
		return 18;
	}
}
