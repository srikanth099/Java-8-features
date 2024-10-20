package org.krishna.advance.streamAPI;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.krishna.advance.ImpMethodReference.Trial;

public class TestFlatMap2 {

	public static void main(String[] args) {
		List<String>a1=List.of("Monday","Tuesday");
		List<String>a2=List.of("Wednesday","Thrusday");
		List<String>a3=List.of("Friday","Saturday");
		List<String>a4=List.of("Sunday");
		List<List<String>> list=List.of(a1,a2,a3,a4);
		System.out.println(list);
		
		List<String>list2=list.stream().flatMap(e->e.stream()).flatMap(e->Stream.of((e.toUpperCase()),
				(e.toLowerCase()))).collect(Collectors.toList());
		System.out.println(list2);

//		list2.forEach(System.out::println);//Function by method reference 
//		it is present in consumer interface
	Trial trial=new Trial();
		list2.forEach(Trial::display);
	}

}
