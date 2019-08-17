package test.flatgine.camera;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.flatgine.camera.Camera;


class CameraTest {
Camera camera = new Camera(0,0);
	@BeforeAll
	public static void init() {
	}
	
    @BeforeEach
    public void setup() {
	  camera.setX(0);
	  camera.setY(0);
    }

	@Test
	void moveToCoordPlus() {
		camera.moveToCoord(10,10);
		assertEquals(camera.getX(),10);
		assertEquals(camera.getY(),10);
	}
	@Test
	void moveToCoordMinus() {
		
		camera.moveToCoord(-10,-10);
			assertEquals(camera.getX(),-10);
			assertEquals(camera.getY(),-10);
			
	}
	
	@Test
	void moveToCoordZero() {
		camera.moveToCoord(0,0);
			assertEquals(camera.getX(),0);
			assertEquals(camera.getY(),0);
		
	}
}
