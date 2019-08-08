package com.flatgine.camera;

import com.flatgine.objectsys.Object;

public class MapScroller {
	
	public static void scrollOfXAxisObjectsGroupByDistance(Object[] objectsGroup, int distance) {
    	for(int i = 0; i < objectsGroup.length; i++) {
    		objectsGroup[i].increaseXBy(distance);
    	}
    }
	
	public static void scrollOfYAxisObjectsGroupByDistance(Object[] objectsGroup, int distance) {
    	for(int i = 0; i < objectsGroup.length; i++) {
    		objectsGroup[i].increaseYBy(distance);
    	}
    }
	
}
