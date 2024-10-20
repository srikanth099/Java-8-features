package org.krishna.advance.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.krishna.advance.Lambda.Student;


public class Filter {

	public static void main(String[] args) {
		List<Student> slist=new ArrayList<>();
		slist.add(new Student(1,"chandu","java"));
		slist.add(new Student(2,"mahi","sql"));
		slist.add(new Student(3,"cherry","html"));
		slist.add(new Student(4,"abi","java"));
	List<Student>filteredList =slist.stream().filter(e->{
		return e.getName().startsWith("c");
		
	}).collect(Collectors.toList());
	for(Student s:filteredList) {
		System.out.println(s);
	}

	}

}
