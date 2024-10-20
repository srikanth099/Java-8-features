package org.krishna.advance.streamAPI;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestDistinct {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(2);
		List<Integer> list2=list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(list2);
	}

}

