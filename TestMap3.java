package org.krishna.advance.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.krishna.advance.Lambda.Student;

public class TestMap3 {

	public static void main(String[] args) {
		List<Student> slist=new ArrayList<>();
		slist.add(new Student(1,"chandu","JAVA"));
		slist.add(new Student(2,"mahi","SQL"));
		slist.add(new Student(3,"Raju","HTML"));
		slist.add(new Student(4,"abi","JAVA"));
		slist.add(new Student(5,"Ravi","jAva"));
		slist.add(new Student(6,"chinni","HTml"));
List<Student> list2=slist.stream().map(e->{e.setCourse(e.getCourse().toLowerCase());
				return e;}).collect(Collectors.toList());
				for(Student s:list2) {
					System.out.println(s);
				}
			}

		}
