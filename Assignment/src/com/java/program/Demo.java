package com.java.program;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo {

	public static void main(String[] args) {

		String s="this is is a this ram";
		String a[]=s.split(" ");
		
		LinkedHashSet lhs=new LinkedHashSet();
		for(String arr:a)
		{
			lhs.add(arr);
		}
		Iterator itr =lhs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

}
