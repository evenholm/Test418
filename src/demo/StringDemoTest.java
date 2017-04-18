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
		assertEquals("һ����ĸ��Сд",str.smallString("A"),"a");
	}
	
	@Test
	public void testSmallString2() {
		assertEquals("һ����ĸ��Сд",str.smallString("AAAA"),"aaaa");
	}
	
	@Test
	public void testSmallString3() {
		assertEquals("һ����ĸ��Сд",str.smallString(""),"error");
	}
	
	@Test
	public void testSmallString4() {
		assertEquals("һ����ĸ��Сд",str.smallString("adDAW"),"addaw");
	}
	
	@Test
	public void testSmallString5() {
		assertEquals("һ����ĸ��Сд",str.smallString("1235A"),"1235a");
	}
	
	@Test
	public void testSmallString6() {
		assertEquals("һ����ĸ��Сд",str.smallString("123"),"123");
	}
	
	@Test
	public void testSmallString7() {
		assertEquals("һ����ĸ��Сд",str.smallString("*%^%$DD"),"*%^%$dd");
	}
	
	@Test
	public void testSmallString8() {
		assertEquals("һ����ĸ��Сд",str.smallString("*%^%$"),"*%^%$");
	}
	
	@Test
	public void testSmallString9() {
		assertEquals("һ����ĸ��Сд",str.smallString("A...a"),"a...a");
	}
	
	@Test
	public void testSmallString10() {
		assertEquals("һ����ĸ��Сд",str.smallString(""),"error");
	}

}
