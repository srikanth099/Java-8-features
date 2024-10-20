package org.krishna.advance.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestSorted1 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(12);
		list.add(16);
		list.add(15);
		List<Integer> list2=list.stream().sorted().collect(Collectors.toList());
		System.out.println(list2);
		
	}

}
