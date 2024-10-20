package org.krishna.advance.streamAPI;



import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.krishna.advance.Lambda.Student;



public class FilterCourses {

	public static void main(String[] args) {
		List<Student> slist=new ArrayList<>();
		slist.add(new Student(1,"chandu","java"));
		slist.add(new Student(2,"mahi","sql"));
		slist.add(new Student(3,"cherry","html"));
		slist.add(new Student(4,"abi","java"));
//	List<Student>filteredList =slist.stream().filter(e->{
//		return e.getName().startsWith("c");
//		
//	}).collect(Collectors.toList());
//	for(Student s:filteredList) {
//		System.out.println(s);
//	}
	Predicate<Student> Pre=new Predicate<Student>() {
			@Override
			public boolean test(Student t) {
				return t.getCourse().equalsIgnoreCase("java");
				
			}
		};
		List<Student> filteredList2=slist.stream().filter(Pre).collect(Collectors.toList());
		for(Student s:filteredList2) {
			System.out.println(s);
		}
	}


	}
