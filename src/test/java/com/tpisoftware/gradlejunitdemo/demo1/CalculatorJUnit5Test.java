package com.tpisoftware.gradlejunitdemo.demo1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CalculatorJUnit5Test {
	@Test
	public void testAdd() {
		assertEquals(30, Integer.sum(21, 9));
	}
	
	@Tag("slow")
    @Test
    public void testAddMaxInteger() {
		assertEquals(1400000, Integer.sum(1000000, 400000));
    }
 
	/**
	 * 返回第一個參數除以第二個參數的無符號商，其中每個參數和結果都被解釋為無符號值。
	 */
    @Tag("fast")
    @Test
    public void testDivide() {
    	assertThrows(ArithmeticException.class, () -> {
            Integer.divideUnsigned(42, 0); //當出現異常算術條件時拋出。例如，整數“除以零”會拋出此類的一個實例。
        });
    }
}
