package demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import demo.StringDemo;
import junit.framework.TestCase;

public class StringDemoTest extends TestCase{
	
	private StringDemo str;
	
	protected void setUp(){
		str = new StringDemo();
	}

	@Test
	public void testSmallString1() {
		assertEquals(str.smallString("A"),"a");
	}
	
	@Test
	public void testSmallString2() {
		assertEquals(str.smallString("AAAA"),"aaaa");
	}
	
	@Test
	public void testSmallString3() {
		assertEquals(str.smallString(""),"error");
	}
	
	@Test
	public void testSmallString4() {
		assertEquals(str.smallString("adDAW"),"addaw");
	}
	
	@Test
	public void testSmallString5() {
		assertEquals(str.smallString("1235A"),"1235a");
	}
	
	@Test
	public void testSmallString6() {
		assertEquals(str.smallString("123"),"123");
	}
	
	@Test
	public void testSmallString7() {
		assertEquals(str.smallString("*%^%$DD"),"*%^%$dd");
	}
	
	@Test
	public void testSmallString8() {
		assertEquals(str.smallString("*%^%$"),"*%^%$");
	}
	
	@Test
	public void testSmallString9() {
		assertEquals(str.smallString("A...a"),"a...a");
	}
	
	@Test
	public void testSmallString10() {
		assertEquals(str.smallString(""),"error");
	}

}
