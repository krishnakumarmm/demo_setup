package com.hcl.java.string;

public class FunctionsUtilDemo {

	public FunctionsUtilDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("The two strings are "+FunctionsUtil.stringsComparision("India", "India"));
	}

}
class FunctionsUtil {
	public static boolean stringsComparision(String s1, String s2) {
		boolean b = s1.equals(s2);
		return b;
	}
}