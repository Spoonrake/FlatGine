package test.flatgine;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.flatgine.GroupsObjTool;
import com.flatgine.objectsys.Object;

class GroupsObjToolTest {

	static final ArrayList<Object> testGroup = new ArrayList<Object>();
	static final Object obj = new Object();
	
	@Test
	void addObjToGroupTest() {
		GroupsObjTool.addObjToGroup(obj, testGroup);
		assertEquals(testGroup.get(0), obj);
	}

}
