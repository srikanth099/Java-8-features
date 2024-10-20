package org.krishna.advance.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilter1 {
	public static void main(String[] args) {
	List<Integer>li=new ArrayList<>();
	li.add(10);
	li.add(21);
	li.add(30);
	li.add(76);
	li.add(45);
	li.add(2);

//	List<Integer>li2=new ArrayList<>();
//	for(Integer c:li) {
//		if(c%2==0) {
//			li2.add(c);
//		}
//	}
	//System.out.println(li2);
	List<Integer>li2=li.stream().filter(e->e%2==0).collect(Collectors.toList());
	System.out.println(li2);
	}
}
