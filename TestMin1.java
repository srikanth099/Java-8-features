package org.krishna.advance.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class TestMin1 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(2);
		list.add(7);
		list.add(25);
		list.add(1);
		list.add(1);
		list.add(6);
		list.add(8);
		Integer min=list.stream().min((e1,e2)->e1-e2).get();
		System.out.println(min);
	}

}
