package org.krishna.advance.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.krishna.advance.Lambda.Student;

public class TestMap2 {

	public static void main(String[] args) {
		List<Student> slist=new ArrayList<>();
		slist.add(new Student(1,"chandu","java"));
		slist.add(new Student(2,"mahi","sql"));
		slist.add(new Student(3,"Raju","html"));
		slist.add(new Student(4,"abi","java"));
		slist.add(new Student(5,"Ravi","java"));
		slist.add(new Student(6,"chinni","java"));
		List<Student> list2=slist.stream().map(e->{e.setName(e.getName().toUpperCase());
		return e;}).collect(Collectors.toList());
		for(Student s:list2) {
			System.out.println(s);
		}
	}

}
