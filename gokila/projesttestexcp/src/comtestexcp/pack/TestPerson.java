package comtestexcp.pack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPerson {

	@Test
	public void testGetFullName() {
		Person p=new Person("goki","kalimuthu");
		assertEquals("gokikalimuthu",p.getFullName());
		//fail("Not yet implemented");
	}

	@Test
	public void testNullsInFirstname() {
		Person p=new Person("m","kalimuthu");
		assertNotNull("mkalimuthu",p.getFirstName());
		//fail("Not yet implemented");
	}
	
	@Test
	public void testNullsInFirstname1() {
		Person p=new Person(null,"kalimuthu");
		assertNotNull(null,p.getFirstName());
	
	
	}
	
	
	@Test
	public void testGetFirstName() {
		Person p=new Person("goki","kalimuthu");
		assertEquals("goki",p.getFirstName());
	}	
	@Test
	public void testGetSecName() {
		Person p=new Person("goki","kalimuthu");
		assertEquals("kalimuthu",p.getSecName());
	}		//fail("Not yet implemented");	//fail("Not yet implemented");

	@Test (expected=IllegalArgumentException.class)
	public void testException(){
		Person p=new Person(null,null);
	}
	}





