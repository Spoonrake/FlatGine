package com.flatgine.physics;

import com.flatgine.objectsys.Object;

public class Phys {
	public static void gravityY(Object obj, int interval){
    	obj.increaseYBy(interval);
    	if(obj.getCurrentSpeedFall()<obj.getMaxSpeedFall())
    	{obj.increaseCurrentSpeedFallBy(obj.getAccelerationFall());}
    	}
}
