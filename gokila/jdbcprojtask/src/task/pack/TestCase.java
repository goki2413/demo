package task.pack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase {
	Student stud;
	StudentDAO std;
	int r;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	stud=new Student();
	std=new StudentDAO();
	}
	@After
	public void tearDown() throws Exception {
		stud=null;
		std=null;
	}

	@Test
	public void testInsert() {
		 
		 stud.setId(7);
		 stud.setName("goki");
		 r=std.insert(stud);
		 assertEquals(1,r);
		
	}

	@Test
	public void testUpdate() {
		 
		 stud.setId(9);
		 stud.setName("shaks");
		 r=std.update(stud);
		 assertEquals(1,r);
		
	}
	
}