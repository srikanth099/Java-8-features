package org.krishna.advance.streamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFlatMap1 {

	public static void main(String[] args) {
		List<Integer> l1=List.of(5,6,7,9);
		List<Integer> l2=List.of(2,5,6,5);
		List<Integer> l3=List.of(5,3,7,2);
		List<List<Integer>> list=List.of(l1,l2,l3);
		System.out.println(list);
		
	List<Integer> list2=list.stream().flatMap(e->e.stream()).flatMap(e->Stream.of((e*e),(e*2))).collect(Collectors.toList());
	System.out.println(list2);
	
//	List<Integer> list3=list2.stream().flatMap(e->Stream.of((e*e),(e*2))).collect(Collectors.toList());
//	System.out.println(list3);
	}

}
