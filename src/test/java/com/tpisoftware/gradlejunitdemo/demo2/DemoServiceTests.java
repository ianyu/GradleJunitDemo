package com.tpisoftware.gradlejunitdemo.demo2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * 
 * @SpringBootTest 預設於當前測試類別中的package開始搜索，
 * 並向上搜尋尋找使用 @SpringBootConfiguration 註解的類別後，
 * 讀取後套用於創建應用程序中所有測試類別。
 *
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DemoServiceTests {

	@Autowired
	private DemoServiceTestsB demoServiceTestsB;
	
	@MockBean
	private DemoServiceTestsA demoServiceTestsA;
	
	@Test
	public void testAddInt() {
		
		int a = 1;
		int b = 2;
		
		/**
		 * MockBean 可調用一般輸出結果物件，但無法調用具備存取資料庫能力的 Bean 類別
		 */
		when(demoServiceTestsA.add(a, b)).thenReturn(3);
		
		int actual = demoServiceTestsA.add(a, b);
		int expected = 3;
		
		assertEquals(expected, actual);
	}
}
