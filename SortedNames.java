package org.krishna.advance.streamAPI;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.krishna.advance.Lambda.Student;

public class SortedNames {

	public static void main(String[] args) {
		List<Student> slist=new ArrayList<>();
		slist.add(new Student(1,"chandu","java"));
		slist.add(new Student(2,"mahi","SQL"));
		slist.add(new Student(3,"Raju","HTML"));
		slist.add(new Student(4,"abi","JAVA"));
		slist.add(new Student(5,"Ravi","java"));
		slist.add(new Student(6,"chinni","java"));
		List<Student>list2=slist.stream().sorted((e1,e2)->{
			return e1.getName().compareToIgnoreCase(e2.getName());
			}).collect(Collectors.toList());
			for(Student s:list2) {
			System.out.println(s);
			}
		}
	
	}
