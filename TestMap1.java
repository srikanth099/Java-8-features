package org.krishna.advance.streamAPI;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestMap1 {
	public static void main(String[] args) {
	List<Integer>list=List.of(5,8,4,2,3,9,6);//from 1.9update
//	Function<Integer,String> fun=new Function<Integer,String>(){
//	@Override
//	public String apply(Integer t) {
//		return t*t+"";
//		System.out.println(list);
//	}
//	};
	
	List<Integer>list2=list.stream().map(e->e*e).collect(Collectors.toList());
	System.out.println(list2);
	}
}
