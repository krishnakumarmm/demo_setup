package com.hcl.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapUtilDemo {

	public MapUtilDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Object, Object> hashMapObj = new HashMap<>();
        hashMapObj.put('a', "january");
        hashMapObj.put(null,  "february");
        hashMapObj.put('c', null);
        hashMapObj.put('a', "february");
        System.out.println("hashmap "+hashMapObj);
        
        LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();
        lhm.put('a', "january");
        lhm.put(null,  "february");
        lhm.put('c', null);
        lhm.put('a', "february");
        System.out.println("linked hashmap "+lhm);
        
        TreeMap<Object, Object> tm = new TreeMap<>();
        tm.put('a', "january");
        tm.put('b',  "february");
        tm.put('c', "march");
        tm.put('a', "february");
        System.out.println("treemap "+tm);
	}

}
