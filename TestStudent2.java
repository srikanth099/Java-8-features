package org.krishna.advance.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStudent2 {

public static void main(String[] args) {
			List<Student> slist=new ArrayList<>();
				slist.add(new Student(1,"Anitha","java"));
				slist.add(new Student(2,"mahi","sql"));
				slist.add(new Student(3,"Raju","html"));
				slist.add(new Student(4,"abi","java"));
				TestStudent2 Student=new TestStudent2();
				Student.sortByCourse(slist);
		}
			public void sortByCourse(List<Student>slist) {
			Collections.sort(slist,(e1,e2)->{
				return e1.getCourse().compareToIgnoreCase(e2.getCourse());
				
		});

		for(Student c:slist)
		{
			System.out.println(c);
		}
			}
//			public void sortByCourse(List<Student>slist) {
//				Collections.sort(slist,(e1,e2)->{
//					return e1.getName().compareToIgnoreCase(e2.getName());
//					
//			});
//
//			for(Student c:slist)
//			{
//				System.out.println(c);
//			}
		}

