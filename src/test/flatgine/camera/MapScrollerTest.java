package test.flatgine.camera;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import com.flatgine.camera.MapScroller;
import com.flatgine.objectsys.Object;

class MapScrollerTest {

	//TODO take tests for 1, 5, 10, 50, 100, 300 objects in testGroup
	static final Object[] testGroup = new Object[1];
	
	
	@BeforeClass
	public static void init() {
		for(int i = 0; i < testGroup.length; i++) {
			testGroup[i] = new Object();
		}
		
		testGroup[0].setX(100);
		testGroup[0].setY(100);
	}
	
	
	//___SIDES_SCROLL___
	
	@Test 
	void scrollToUp() {
		MapScroller.scrollOfYAxisObjectsGroupByDistance(testGroup, 10);
		assertEquals(testGroup[0].getY(), 110);
	}
	
	@Test
	void scrollToDown(){
		MapScroller.scrollOfYAxisObjectsGroupByDistance(testGroup, -10);
		assertEquals(testGroup[0].getY(), 90);
	}
	
	@Test
	void scrollToRight(){
		MapScroller.scrollOfXAxisObjectsGroupByDistance(testGroup, 10);
		assertEquals(testGroup[0].getX(), 110);
	}
	
	@Test
	void scrollToLeft(){
		MapScroller.scrollOfXAxisObjectsGroupByDistance(testGroup, -10);
		assertEquals(testGroup[0].getX(), 90);
	}
	
	
	
	//___CROSSES_ZERO_LINE_COORDINATES___
	
	@Test
	void axisXCrossesZeroLine(){
		MapScroller.scrollOfXAxisObjectsGroupByDistance(testGroup, -110);
		assertEquals(testGroup[0].getX(), -10);
	}
	
	@Test
	void axisYCrossesZeroLine(){
		MapScroller.scrollOfYAxisObjectsGroupByDistance(testGroup, -110);
		assertEquals(testGroup[0].getY(), -10);
	}

	
}
