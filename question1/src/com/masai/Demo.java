package com.masai;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//By Using == operator

		String s1="anc";
		String s2="anc";
		String s3=new String("anc");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		//String compare by compareTo() method
		String s11="abc";
		String s22="abc";
		String s33="abd";
		System.out.println(s11.compareTo(s22));
		System.out.println(s11.compareTo(s33));
		System.out.println(s33.compareTo(s11));

	}

}
//Suppose there are 3 reference variables, all refer to one
//object "sss". If one reference variable changes the value of the object,
//it will be affected by all the reference variables. Thats  why String objects
//are immutable in Java.

//Difference
//String are Immutable but with the help of  StringBuilder we can mutate the  string.