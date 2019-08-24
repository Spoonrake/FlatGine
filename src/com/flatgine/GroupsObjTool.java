package com.flatgine;

import java.util.ArrayList;
import com.flatgine.objectsys.Object;

public class GroupsObjTool {
	
	public static void addObjToGroup(Object obj, ArrayList<Object> group) {
		group.add(obj);
	}
	
	public static void removeObjByNameFromGroup(Object obj, ArrayList<Object> group) {
		group.remove(group.indexOf(obj));
	}
	
	public static void removeAllObjFromGroup(ArrayList<Object> group) {
		group.clear();
	}
}
