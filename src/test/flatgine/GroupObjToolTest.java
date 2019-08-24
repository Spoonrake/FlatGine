package test.flatgine;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flatgine.GroupObjTool;
import com.flatgine.objectsys.Object;

class GroupObjToolTest {

	static final ArrayList<Object> testGroup = new ArrayList<Object>();
	static final Object obj = new Object();
	static final Object obj2 = new Object();
	
	
	@BeforeEach
	public void setup() {
		testGroup.clear();
	}
	
	@Test
	void addObjToGroupTest() {
		GroupObjTool.addObjToGroup(obj, testGroup);
		assertEquals(testGroup.get(0), obj);
	}
	
	@Test
	void removeObjFromGroupTest() {
		testGroup.add(obj);
		testGroup.add(obj2);
		GroupObjTool.removeObjFromGroup(obj, testGroup);
		assertEquals(testGroup.get(0), obj2);
	}
	
	@Test
	void removeAllObjFromGroup() throws IndexOutOfBoundsException{
		testGroup.add(obj);
		testGroup.add(obj2);
		GroupObjTool.removeAllObjFromGroup(testGroup);
		Throwable thrown = assertThrows(IndexOutOfBoundsException.class, () -> {
			testGroup.get(0);
		});
		assertNotNull(thrown.getMessage());
	}

}
